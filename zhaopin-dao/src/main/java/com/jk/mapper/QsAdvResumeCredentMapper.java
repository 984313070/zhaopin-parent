package com.jk.mapper;

import com.jk.pojo.QsAdvResumeCredent;
import com.jk.pojo.QsAdvResumeCredentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsAdvResumeCredentMapper {
    int countByExample(QsAdvResumeCredentExample example);

    int deleteByExample(QsAdvResumeCredentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsAdvResumeCredent record);

    int insertSelective(QsAdvResumeCredent record);

    List<QsAdvResumeCredent> selectByExample(QsAdvResumeCredentExample example);

    QsAdvResumeCredent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsAdvResumeCredent record, @Param("example") QsAdvResumeCredentExample example);

    int updateByExample(@Param("record") QsAdvResumeCredent record, @Param("example") QsAdvResumeCredentExample example);

    int updateByPrimaryKeySelective(QsAdvResumeCredent record);

    int updateByPrimaryKey(QsAdvResumeCredent record);
}