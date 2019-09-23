package com.jk.mapper;

import com.jk.pojo.QsAdminLog;
import com.jk.pojo.QsAdminLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsAdminLogMapper {
    int countByExample(QsAdminLogExample example);

    int deleteByExample(QsAdminLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(QsAdminLog record);

    int insertSelective(QsAdminLog record);

    List<QsAdminLog> selectByExample(QsAdminLogExample example);

    QsAdminLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") QsAdminLog record, @Param("example") QsAdminLogExample example);

    int updateByExample(@Param("record") QsAdminLog record, @Param("example") QsAdminLogExample example);

    int updateByPrimaryKeySelective(QsAdminLog record);

    int updateByPrimaryKey(QsAdminLog record);
}