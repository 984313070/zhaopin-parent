package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.QsJobsMapper;
import com.jk.pojo.QsJobs;
import com.jk.pojo.QsJobsWithBLOBs;
import com.jk.service.JobsService;
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
 * 类名称：JobsServiceImpl
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-10 16:36
 * 修改人： 程龙
 * 修改时间：2019-09-10 16:36
 * 修改备注：
 * @version </pre>
 */
@Service(timeout = 1200000)
public class JobsServiceImpl implements JobsService {
    @Autowired
    private QsJobsMapper qsJobsMapper;

    @Override
    public PageResult findJobsList(QsJobs qsJobs, Integer rows, Integer page) {
        PageHelper.startPage(page,rows);
        PageResult pageResult = new PageResult();
        List<QsJobs> qsJobs1 = qsJobsMapper.selectByExample(null);
        int count = qsJobsMapper.countByExample(null);
        pageResult.setTotal(count);
        pageResult.setRows(qsJobs1);
        return pageResult;
    }

    @Override
    public QsJobs findById(Integer id) {
        return qsJobsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updJobs(Integer audit,Integer[] ids) {
        for (Integer id : ids) {
            QsJobs qsJobs = new QsJobs();
            qsJobs.setId(id);
            qsJobs.setAudit(audit);
            qsJobsMapper.updateJobs(qsJobs);
        }
    }

    @Override
    public void delJobs(Integer[] ids) {
        for(Integer  id: ids){
            qsJobsMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void deleteJobs(Integer id) {
        qsJobsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<QsJobs> findAll() {

        return qsJobsMapper.selectByExample(null);
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
            List<QsJobs> qsJobs = new ArrayList<>();

            for (Row row : sheetAt) {

                //首行（即表头）不读取
                if (row.getRowNum() == 0 || row.getRowNum() == 1 || row.getRowNum() == 2) {
                    continue;
                }
                QsJobsWithBLOBs qsJobsWithBLOBs = new QsJobsWithBLOBs();
                //读取当前行中单元格数据，索引从0开始

                String id = row.getCell(0).getStringCellValue();
                String jobsName = row.getCell(1).getStringCellValue();
                String companyname = row.getCell(2).getStringCellValue();
                String audit = row.getCell(3).getStringCellValue();
                String addtime = row.getCell(4).getStringCellValue();
                String refreshtime = row.getCell(5).getStringCellValue();

                qsJobsWithBLOBs.setId(Integer.parseInt(id));
                qsJobsWithBLOBs.setJobsName(jobsName);
                qsJobsWithBLOBs.setCompanyname(companyname);
                qsJobsWithBLOBs.setAudit(Integer.parseInt(audit));
                qsJobsWithBLOBs.setAddtime(Integer.parseInt(addtime));
                qsJobsWithBLOBs.setRefreshtime(Integer.parseInt(refreshtime));

                qsJobsMapper.insert(qsJobsWithBLOBs);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"导入失败");
        }

        return new Result(true,"导入成功");
    }


}
