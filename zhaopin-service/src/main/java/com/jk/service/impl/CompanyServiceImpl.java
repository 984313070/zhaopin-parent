package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.QsCompanyProfileMapper;
import com.jk.pojo.QsCompanyProfile;
import com.jk.service.CompanyService;
import entity.PageResult;
import entity.Result;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>项目名称：zhaopin-parent
 * 类名称：CompanyServiceImpl
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-09 21:12
 * 修改人： 程龙
 * 修改时间：2019-09-09 21:12
 * 修改备注：
 * @version </pre>
 */
@Service(timeout = 1200000)
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private QsCompanyProfileMapper qsCompanyProfileMapper;


    @Override
    public PageResult findCompanylist(QsCompanyProfile qsCompanyProfile, Integer rows, Integer page) {
        PageHelper.startPage(page,rows);
        PageResult pageResult = new PageResult();
        List<QsCompanyProfile> qsCompanyProfiles = qsCompanyProfileMapper.selectByExample(null);
        int count = qsCompanyProfileMapper.countByExample(null);
        pageResult.setTotal(count);
        pageResult.setRows(qsCompanyProfiles);
        return pageResult;
      /*  QsCompanyProfileExample example = new QsCompanyProfileExample();
        QsCompanyProfileExample.Criteria criteria = example.createCriteria();
        if (qsCompanyProfile!=null){
           if(qsCompanyProfile.getAudit()!=null){
               criteria.andAuditEqualTo(qsCompanyProfile.getAudit());
           }
           if (qsCompanyProfile.getSetmealId()!=null){
               criteria.andSetmealIdEqualTo(qsCompanyProfile.getSetmealId());
           }
        }
        Page<QsCompanyProfile> page = (Page<QsCompanyProfile>) qsCompanyProfileMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());*/
    }

    @Override
    public void addCompany(QsCompanyProfile qsCompanyProfile) {
            qsCompanyProfileMapper.insert(qsCompanyProfile);
    }

    @Override
    public void delCompany(Integer[] ids) {
        for(Integer id: ids){
            qsCompanyProfileMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public QsCompanyProfile findById(Integer id) {
        return qsCompanyProfileMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updCompany(Integer audit, Integer[] ids) {
        for (Integer id : ids) {
            QsCompanyProfile qsCompanyProfile = new QsCompanyProfile();
            qsCompanyProfile.setId(id);
            qsCompanyProfile.setAudit(audit);
            qsCompanyProfileMapper.updateCompany(qsCompanyProfile);
        }

    }

    @Override
    public void deleteCompany(Integer id) {
        qsCompanyProfileMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<QsCompanyProfile> findAll() {
        return qsCompanyProfileMapper.selectByExample(null);
    }

    @Override
    public Result importXLS(String filePath) {

        try {
            InputStream inputStream = new FileInputStream(filePath);

            //2、获取Excel工作簿对象
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);

            //3、得到Excel工作表对象
            HSSFSheet sheetAt = workbook.getSheetAt(0);

            //4、循环读取表格数据
            List<QsCompanyProfile> qsCompanyProfiles = new ArrayList<>();

            for (Row row : sheetAt) {

                //首行（即表头）不读取
                if (row.getRowNum() == 0 || row.getRowNum() == 1 || row.getRowNum() == 2) {
                    continue;
                }
                QsCompanyProfile qsCompanyProfile = new QsCompanyProfile();
                //读取当前行中单元格数据，索引从0开始


                String id = row.getCell(0).getStringCellValue();
                String companyname = row.getCell(1).getStringCellValue();
                String audit = row.getCell(2).getStringCellValue();
                String addtime = row.getCell(3).getStringCellValue();
                String refreshtime = row.getCell(4).getStringCellValue();
                String setmealName = row.getCell(5).getStringCellValue();
                String jobs = row.getCell(6).getStringCellValue();

                qsCompanyProfile.setId(Integer.parseInt(id));
                qsCompanyProfile.setCompanyname(companyname);
                qsCompanyProfile.setAudit(Integer.parseInt(audit));
                qsCompanyProfile.setAddtime(Integer.parseInt(addtime));
                qsCompanyProfile.setRefreshtime(Integer.parseInt(refreshtime));
                qsCompanyProfile.setSetmealName(setmealName);

                qsCompanyProfileMapper.insert(qsCompanyProfile);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"导入失败");
        }

        return new Result(true,"导入成功");
    }



}
