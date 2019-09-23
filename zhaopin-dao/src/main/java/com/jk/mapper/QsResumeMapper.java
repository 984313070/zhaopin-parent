package com.jk.mapper;

import com.jk.pojo.QsPersonalResume;
import com.jk.pojo.QsResume;
import com.jk.pojo.QsResumeExample;
import com.jk.pojo.QsResumeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsResumeMapper {
    int countByExample(QsResumeExample example);

    int deleteByExample(QsResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsResumeWithBLOBs record);

    int insertSelective(QsResumeWithBLOBs record);

    List<QsResumeWithBLOBs> selectByExampleWithBLOBs(QsResumeExample example);

    List<QsResume> selectByExample(QsResumeExample example);

    QsResumeWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsResumeWithBLOBs record, @Param("example") QsResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") QsResumeWithBLOBs record, @Param("example") QsResumeExample example);

    int updateByExample(@Param("record") QsResume record, @Param("example") QsResumeExample example);

    int updateByPrimaryKeySelective(QsResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QsResumeWithBLOBs record);

    int updateByPrimaryKey(QsResume record);

    QsPersonalResume selectById(Integer id);
}