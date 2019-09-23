package com.jk.mapper;

import com.jk.pojo.QsAdvResume;
import com.jk.pojo.QsAdvResumeExample;
import com.jk.pojo.QsAdvResumeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsAdvResumeMapper {
    int countByExample(QsAdvResumeExample example);

    int deleteByExample(QsAdvResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsAdvResumeWithBLOBs record);

    int insertSelective(QsAdvResumeWithBLOBs record);

    List<QsAdvResumeWithBLOBs> selectByExampleWithBLOBs(QsAdvResumeExample example);

    List<QsAdvResume> selectByExample(QsAdvResumeExample example);

    QsAdvResumeWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsAdvResumeWithBLOBs record, @Param("example") QsAdvResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") QsAdvResumeWithBLOBs record, @Param("example") QsAdvResumeExample example);

    int updateByExample(@Param("record") QsAdvResume record, @Param("example") QsAdvResumeExample example);

    int updateByPrimaryKeySelective(QsAdvResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QsAdvResumeWithBLOBs record);

    int updateByPrimaryKey(QsAdvResume record);
}