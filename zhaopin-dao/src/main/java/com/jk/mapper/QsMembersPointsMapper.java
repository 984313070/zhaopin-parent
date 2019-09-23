package com.jk.mapper;

import com.jk.pojo.QsMembersPoints;
import com.jk.pojo.QsMembersPointsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsMembersPointsMapper {
    int countByExample(QsMembersPointsExample example);

    int deleteByExample(QsMembersPointsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsMembersPoints record);

    int insertSelective(QsMembersPoints record);

    List<QsMembersPoints> selectByExample(QsMembersPointsExample example);

    QsMembersPoints selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsMembersPoints record, @Param("example") QsMembersPointsExample example);

    int updateByExample(@Param("record") QsMembersPoints record, @Param("example") QsMembersPointsExample example);

    int updateByPrimaryKeySelective(QsMembersPoints record);

    int updateByPrimaryKey(QsMembersPoints record);
}