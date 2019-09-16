package com.jk.mapper;

import com.jk.pojo.QsMembers;
import com.jk.pojo.QsMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsMembersMapper {
    int countByExample(QsMembersExample example);

    int deleteByExample(QsMembersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(QsMembers record);

    int insertSelective(QsMembers record);

    List<QsMembers> selectByExample(QsMembersExample example);

    QsMembers selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") QsMembers record, @Param("example") QsMembersExample example);

    int updateByExample(@Param("record") QsMembers record, @Param("example") QsMembersExample example);

    int updateByPrimaryKeySelective(QsMembers record);

    int updateByPrimaryKey(QsMembers record);
}