package com.jk.mapper;

import com.jk.pojo.QsMembersSetmeal;
import com.jk.pojo.QsMembersSetmealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface QsMembersSetmealMapper {
    int countByExample(QsMembersSetmealExample example);

    int deleteByExample(QsMembersSetmealExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsMembersSetmeal record);

    int insertSelective(QsMembersSetmeal record);

    List<QsMembersSetmeal> selectByExample(QsMembersSetmealExample example);

    QsMembersSetmeal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsMembersSetmeal record, @Param("example") QsMembersSetmealExample example);

    int updateByExample(@Param("record") QsMembersSetmeal record, @Param("example") QsMembersSetmealExample example);

    int updateByPrimaryKeySelective(QsMembersSetmeal record);

    int updateByPrimaryKey(QsMembersSetmeal record);

    @Select ("select count(1) from qs_members_setmeal where setmeal_id = #{value}")
    int findcounthuiyuanAll(int i);

    @Select ("select count(1) from qs_members_setmeal where endtime < #{value}")
    int findcounthuiyuanyidaoqi(long dangqianshijian);

    @Select ("select count(1) from qs_members_setmeal where endtime > #{value}")
    int findcounthuiyuanweidaoqi(long dangqianshijian);
}