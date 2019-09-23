package com.jk.mapper;

import com.jk.pojo.QsConfig;
import com.jk.pojo.QsConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsConfigMapper {
    int countByExample(QsConfigExample example);

    int deleteByExample(QsConfigExample example);

    int deleteByPrimaryKey(Short id);

    int insert(QsConfig record);

    int insertSelective(QsConfig record);

    List<QsConfig> selectByExampleWithBLOBs(QsConfigExample example);

    List<QsConfig> selectByExample(QsConfigExample example);

    QsConfig selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") QsConfig record, @Param("example") QsConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") QsConfig record, @Param("example") QsConfigExample example);

    int updateByExample(@Param("record") QsConfig record, @Param("example") QsConfigExample example);

    int updateByPrimaryKeySelective(QsConfig record);

    int updateByPrimaryKeyWithBLOBs(QsConfig record);

    int updateByPrimaryKey(QsConfig record);
}