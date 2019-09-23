package com.jk.mapper;

import com.jk.pojo.QsAdvResumeEducation;
import com.jk.pojo.QsAdvResumeEducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsAdvResumeEducationMapper {
    int countByExample(QsAdvResumeEducationExample example);

    int deleteByExample(QsAdvResumeEducationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsAdvResumeEducation record);

    int insertSelective(QsAdvResumeEducation record);

    List<QsAdvResumeEducation> selectByExample(QsAdvResumeEducationExample example);

    QsAdvResumeEducation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsAdvResumeEducation record, @Param("example") QsAdvResumeEducationExample example);

    int updateByExample(@Param("record") QsAdvResumeEducation record, @Param("example") QsAdvResumeEducationExample example);

    int updateByPrimaryKeySelective(QsAdvResumeEducation record);

    int updateByPrimaryKey(QsAdvResumeEducation record);
}