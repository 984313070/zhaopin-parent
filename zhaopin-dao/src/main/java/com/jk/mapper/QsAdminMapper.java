package com.jk.mapper;

import com.jk.pojo.QsAdmin;
import com.jk.pojo.QsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsAdminMapper {
    int countByExample(QsAdminExample example);

    int deleteByExample(QsAdminExample example);

    int deleteByPrimaryKey(Short id);

    int insert(QsAdmin record);

    int insertSelective(QsAdmin record);

    List<QsAdmin> selectByExample(QsAdminExample example);

    QsAdmin selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") QsAdmin record, @Param("example") QsAdminExample example);

    int updateByExample(@Param("record") QsAdmin record, @Param("example") QsAdminExample example);

    int updateByPrimaryKeySelective(QsAdmin record);

    int updateByPrimaryKey(QsAdmin record);
}