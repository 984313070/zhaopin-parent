package com.jk.mapper;

import com.jk.pojo.QsPersonalServiceStickLog;
import com.jk.pojo.QsPersonalServiceStickLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsPersonalServiceStickLogMapper {
    int countByExample(QsPersonalServiceStickLogExample example);

    int deleteByExample(QsPersonalServiceStickLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsPersonalServiceStickLog record);

    int insertSelective(QsPersonalServiceStickLog record);

    List<QsPersonalServiceStickLog> selectByExample(QsPersonalServiceStickLogExample example);

    QsPersonalServiceStickLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsPersonalServiceStickLog record, @Param("example") QsPersonalServiceStickLogExample example);

    int updateByExample(@Param("record") QsPersonalServiceStickLog record, @Param("example") QsPersonalServiceStickLogExample example);

    int updateByPrimaryKeySelective(QsPersonalServiceStickLog record);

    int updateByPrimaryKey(QsPersonalServiceStickLog record);
}