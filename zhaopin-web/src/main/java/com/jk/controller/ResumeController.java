package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.*;
import com.jk.service.ResumeService;
import entity.PageResult;
import entity.Result;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import util.ExportExcel;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：zhaopin-parent
 * 类名称：ResumeController
 * 类描述：
 * 创建人：马娇娇
 * 创建时间：2019-09-11 17:07
 * 修改人：马娇娇
 * 修改时间：2019-09-11 17:07
 * 修改备注：
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Reference
    private ResumeService resumeService;
/*
    @RequestMapping("/search")
    public PageResult search(QsResumeExample qsResume, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows) {
        return resumeService.findPage(qsResume, page, rows);
    }*/

   @RequestMapping("findCenter")
   public PageResult findCenter(QsJobs qsJobs, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findCenter(qsJobs,page,rows);
   }

   @RequestMapping("findPersonById")
   public PageResult findPersonById(Integer id ,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findPersonById(id,page,rows);
   }


    @RequestMapping("findResumeById")
    public QsResume findResumeById(Integer id){
        return resumeService.findResumeById(id);
    }


    @RequestMapping("findTopById")
   public QsAdvResume findTopById(Integer id ){
       return resumeService.findTopById(id);
   }

   @RequestMapping("findEducationById")
   public QsAdvResumeEducation findEducationById(Integer id ){
       return resumeService.findEducationById(id);
   }

   @RequestMapping("findWorkByIds")
   public QsAdvResumeWork findWorkByIds(Integer id ){
       return resumeService.findWorkByIds(id);
   }

   @RequestMapping("findPeixunByIds")
   public QsAdvResumeTraining findPeixunByIds(Integer id ){
       return resumeService.findPeixunByIds(id);
   }

   @RequestMapping("findzhengshuByIds")
   public QsAdvResumeCredent findzhengshuByIds(Integer id ){
       return resumeService.findzhengshuByIds(id);
   }

   @RequestMapping("findlanguageByIds")
   public QsAdvResumeLanguage findlanguageByIds(Integer id ){
       return resumeService.findlanguageByIds(id);
   }

   @RequestMapping("queryLogs")
   public PageResult queryLogs(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.queryLogs(page,rows);
   }

   @RequestMapping("findPerson")
   public PageResult findPerson(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findPerson(page,rows);
   }

   @RequestMapping("search")
   public PageResult search(QsResume qsResume,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findPage(qsResume,page,rows);
   }

   @RequestMapping("findWork")
   public PageResult findWork(QsAdvResumeWork resumeWork,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findWork(resumeWork,page,rows);
   }

   @RequestMapping("findEducation")
   public PageResult findEducation(QsAdvResumeEducation advResumeEducation,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findEducation(advResumeEducation,page,rows);
   }

   @RequestMapping("findPeixun")
   public PageResult findPeixun(QsAdvResumeTraining advResumeTraining,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.peixunjigou(advResumeTraining,page,rows);
   }

   @RequestMapping("findCre")
   public PageResult findCre(QsAdvResumeCredent advResumeCredent,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findCre(advResumeCredent,page,rows);
   }

   @RequestMapping("findLanguage")
   public PageResult findLanguage(QsAdvResumeLanguage advResumeLanguage,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findLanguage(advResumeLanguage,page,rows);
   }

   @RequestMapping("findTop")
   public PageResult findTop(QsAdvResume advResume,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
       return resumeService.findTop(advResume,page,rows);
   }

   @RequestMapping("delResume")
   public Result delResume(Integer[] ids){
       try {
           resumeService.delResume(ids);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("deleteTops")
   public Result deleteTops(Integer[] ids){
       try {
           resumeService.deleteTops(ids);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("deleteResumeById")
   public Result deleteResumeById(Integer id){
       try {
           resumeService.deleteResumeById(id);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("deleteTopById")
   public Result deleteTopById(Integer id){
       try {
           resumeService.deleteTopById(id);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("deleteEdu")
   public Result deleteEdu(Integer id){
       try {
           resumeService.deleteEdu(id);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("deleteWork")
   public Result deleteWork(Integer id){
       try {
           resumeService.deleteWork(id);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("deletePeixun")
   public Result deletePeixun(Integer id){
       try {
           resumeService.deletePeixun(id);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("deleteCreById")
   public Result deleteCreById(Integer id){
       try {
           resumeService.deleteCreById(id);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("deleteLanguageById")
   public Result deleteLanguageById(Integer id){
       try {
           resumeService.deleteLanguageById(id);
           return new Result(true,"删除成功");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败");
   }

   @RequestMapping("updateAdv")
    public Result updateAdv(QsAdvResume advResume){
       try {
           if(advResume!=null){
               resumeService.updateAdv(advResume);
               return new Result(true,"修改成功");
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"修改失败");
   }

    @RequestMapping("updatePersonPromotion")
    public Result updatePersonPromotion(QsPersonalServiceStickLog personalServiceStickLog){
        try {
            if(personalServiceStickLog!=null){
                resumeService.updatePersonPromotion(personalServiceStickLog);
                return new Result(true,"修改成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"修改失败");
    }

    @RequestMapping("updateEducation")
    public Result updateEducation(QsAdvResumeEducation advResumeEducation){
        try {

                resumeService.updateEducation(advResumeEducation);
                return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"修改失败");
    }

   /* @RequestMapping("updateTuiGuang")
    public Result updateTuiGuang(QsAdvResumeEducation advResumeEducation){
        try {
                resumeService.updateTuiGuang(advResumeEducation);
                return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"修改失败");
    }
*/
    @RequestMapping("updateWork")
    public Result updateWork(QsAdvResumeWork advResumeWork){
        try {
                resumeService.updateWork(advResumeWork);
                return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"修改失败");
    }

    @RequestMapping("updatePeixunById")
    public Result updatePeixunById(QsAdvResumeTraining advResumeTraining){
        try {
                resumeService.updatePeixunById(advResumeTraining);
                return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"修改失败");
    }

    @RequestMapping("updateLanguageById")
    public Result updateLanguageById(QsAdvResumeLanguage advResumeLanguage){
        try {
                resumeService.updateLanguageById(advResumeLanguage);
                return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"修改失败");
    }

    @RequestMapping("updateCreById")
    public Result updateCreById(QsAdvResumeCredent advResumeCredent){
        try {
                resumeService.updateCreById(advResumeCredent);
                return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"修改失败");
    }


    @RequestMapping("exportResumeList")
    public void exportResumePhotoList(HttpServletResponse response){
        //获得数据信息
        List<QsResume> resumeList = resumeService.findAll();
        //标题
        String title = "内容信息";
        String[] rowsName = new String[]{"序号","姓名","出生日期","性别","教育","经历","简历完整度","委托开始时间","委托结束时间", "创建时间", "刷新时间"};

        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]>();

        Object[] obj = null;
        for (int i = 0; i < resumeList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = resumeList.get(i).getId();
            obj[1] = resumeList.get(i).getFullname();
            obj[2] = resumeList.get(i).getBirthdate();
            obj[3] = resumeList.get(i).getSexCn();
            obj[4] = resumeList.get(i).getEducationCn();
            obj[5] = resumeList.get(i).getExperienceCn();
            obj[6] = resumeList.get(i).getCompletePercent();
            obj[7] = resumeList.get(i).getAddtime();
            obj[8] = resumeList.get(i).getStime();
            obj[9] = resumeList.get(i).getAddtime();
            obj[10] = resumeList.get(i).getRefreshtime();
            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel(title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("exportMatchList")
    public void exportMatchList(HttpServletResponse response){
        //获得数据信息
        List<QsJobs> jobsList = resumeService.findJobsAll();
        //标题
        String title = "内容信息";
        String[] rowsName = new String[]{"序号","职位名称","公司名称","地区","行业","职位要求","薪资待遇","刷新时间"};

        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]>();

        Object[] obj = null;
        for (int i = 0; i < jobsList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = jobsList.get(i).getId();
            obj[1] = jobsList.get(i).getJobsName();
            obj[2] = jobsList.get(i).getCompanyname();
            obj[3] = jobsList.get(i).getDistrictCn();
            obj[4] = jobsList.get(i).getTradeCn();
            obj[5] = jobsList.get(i).getExperienceCn();
            obj[6] = jobsList.get(i).getMaxwage();
            obj[7] = jobsList.get(i).getRefreshtime();
            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel(title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  @RequestMapping("exportPersonalList")
    public void exportPersonalList(HttpServletResponse response){
        //获得数据信息
        List<QsPersonalServiceStickLog> stickList = resumeService.findStickAll();
        //标题
        String title = "内容信息";
        String[] rowsName = new String[]{"序号","姓名","会员ID","推广天数","开始时间","结束时间"};

        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]>();

        Object[] obj = null;
        for (int i = 0; i < stickList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = stickList.get(i).getId();
            //obj[1] = stickList.get(i).getFullname;
            obj[2] = stickList.get(i).getResumeUid();
            obj[3] = stickList.get(i).getPoints();
            obj[4] = stickList.get(i).getAddtime();
            obj[5] = stickList.get(i).getEndtime();
            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel(title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("importXLS")
    public Result importXLS(String filePath) {

        try {
            InputStream inputStream = new FileInputStream(filePath);
            //2、获取Excel工作簿对象
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            //3、得到Excel工作表对象
            HSSFSheet sheetAt = workbook.getSheetAt(0);
            //4、循环读取表格数据
            List<QsResumeWithBLOBs> qsResumes = new ArrayList<>();
            for (Row row : sheetAt) {
                //首行（即表头）不读取
                if (row.getRowNum() == 0 || row.getRowNum() == 1 || row.getRowNum() == 2) {
                    continue;
                }
                QsResumeWithBLOBs qsResume = new QsResumeWithBLOBs();
                //读取当前行中单元格数据，索引从0开始
                String fullname = row.getCell(1).getStringCellValue();
                String birthdate = row.getCell(2).getStringCellValue();
                String sexCn = row.getCell(3).getStringCellValue();
                String educationCn = row.getCell(4).getStringCellValue();
                String experienceCn = row.getCell(5).getStringCellValue();
                String completePercent = row.getCell(6).getStringCellValue();
                String addtime = row.getCell(7).getStringCellValue();
                String stime = row.getCell(8).getStringCellValue();
                String refreshtime = row.getCell(9).getStringCellValue();
                qsResume.setFullname(fullname);
                qsResume.setBirthdate(Short.parseShort(birthdate));
                qsResume.setSexCn(sexCn);
                qsResume.setEducationCn(educationCn);
                qsResume.setExperienceCn(experienceCn);
                qsResume.setCompletePercent(Byte.parseByte(completePercent));
                qsResume.setAddtime(Integer.parseInt(addtime));
                qsResume.setStime(Integer.parseInt(stime));
                qsResume.setRefreshtime(Integer.parseInt(refreshtime));
                resumeService.insert(qsResume);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"导入失败");
        }

        return new Result(true,"导入成功");
    }
}
