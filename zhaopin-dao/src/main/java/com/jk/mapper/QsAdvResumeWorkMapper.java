package com.jk.mapper;

import com.jk.pojo.QsAdvResumeWork;
import com.jk.pojo.QsAdvResumeWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsAdvResumeWorkMapper {
    int countByExample(QsAdvResumeWorkExample example);

    int deleteByExample(QsAdvResumeWorkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsAdvResumeWork record);

    int insertSelective(QsAdvResumeWork record);

    List<QsAdvResumeWork> selectByExample(QsAdvResumeWorkExample example);

    QsAdvResumeWork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsAdvResumeWork record, @Param("example") QsAdvResumeWorkExample example);

    int updateByExample(@Param("record") QsAdvResumeWork record, @Param("example") QsAdvResumeWorkExample example);

    int updateByPrimaryKeySelective(QsAdvResumeWork record);

    int updateByPrimaryKey(QsAdvResumeWork record);
}