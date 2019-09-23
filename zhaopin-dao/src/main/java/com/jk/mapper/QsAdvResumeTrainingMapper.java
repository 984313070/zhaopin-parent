package com.jk.mapper;

import com.jk.pojo.QsAdvResumeTraining;
import com.jk.pojo.QsAdvResumeTrainingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsAdvResumeTrainingMapper {
    int countByExample(QsAdvResumeTrainingExample example);

    int deleteByExample(QsAdvResumeTrainingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsAdvResumeTraining record);

    int insertSelective(QsAdvResumeTraining record);

    List<QsAdvResumeTraining> selectByExample(QsAdvResumeTrainingExample example);

    QsAdvResumeTraining selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsAdvResumeTraining record, @Param("example") QsAdvResumeTrainingExample example);

    int updateByExample(@Param("record") QsAdvResumeTraining record, @Param("example") QsAdvResumeTrainingExample example);

    int updateByPrimaryKeySelective(QsAdvResumeTraining record);

    int updateByPrimaryKey(QsAdvResumeTraining record);
}