package com.jk.mapper;

import com.jk.pojo.OrderMembersJobsResult;
import com.jk.pojo.QsOrder;
import com.jk.pojo.QsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface QsOrderMapper {
    int countByExample(QsOrderExample example);

    int deleteByExample(QsOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsOrder record);

    int insertSelective(QsOrder record);

    List<QsOrder> selectByExampleWithBLOBs(QsOrderExample example);

    List<QsOrder> selectByExample(QsOrderExample example);

    QsOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsOrder record, @Param("example") QsOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") QsOrder record, @Param("example") QsOrderExample example);

    int updateByExample(@Param("record") QsOrder record, @Param("example") QsOrderExample example);

    int updateByPrimaryKeySelective(QsOrder record);

    int updateByPrimaryKeyWithBLOBs(QsOrder record);

    int updateByPrimaryKey(QsOrder record);

    @Select ("select count(1) from qs_order where is_paid=#{value}")
    int countfukuanAll(int i);
}