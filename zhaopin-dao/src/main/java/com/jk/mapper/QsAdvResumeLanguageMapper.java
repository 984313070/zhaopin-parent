package com.jk.mapper;

import com.jk.pojo.QsAdvResumeLanguage;
import com.jk.pojo.QsAdvResumeLanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsAdvResumeLanguageMapper {
    int countByExample(QsAdvResumeLanguageExample example);

    int deleteByExample(QsAdvResumeLanguageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsAdvResumeLanguage record);

    int insertSelective(QsAdvResumeLanguage record);

    List<QsAdvResumeLanguage> selectByExample(QsAdvResumeLanguageExample example);

    QsAdvResumeLanguage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsAdvResumeLanguage record, @Param("example") QsAdvResumeLanguageExample example);

    int updateByExample(@Param("record") QsAdvResumeLanguage record, @Param("example") QsAdvResumeLanguageExample example);

    int updateByPrimaryKeySelective(QsAdvResumeLanguage record);

    int updateByPrimaryKey(QsAdvResumeLanguage record);
}