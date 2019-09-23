package com.jk.mapper;

import com.jk.pojo.QsJobs;
import com.jk.pojo.QsJobsExample;
import com.jk.pojo.QsJobsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface QsJobsMapper {
    int countByExample(QsJobsExample example);

    int deleteByExample(QsJobsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsJobsWithBLOBs record);

    int insertSelective(QsJobsWithBLOBs record);

    List<QsJobsWithBLOBs> selectByExampleWithBLOBs(QsJobsExample example);

    List<QsJobs> selectByExample(QsJobsExample example);

    QsJobsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsJobsWithBLOBs record, @Param("example") QsJobsExample example);

    int updateByExampleWithBLOBs(@Param("record") QsJobsWithBLOBs record, @Param("example") QsJobsExample example);

    int updateByExample(@Param("record") QsJobs record, @Param("example") QsJobsExample example);

    int updateByPrimaryKeySelective(QsJobsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QsJobsWithBLOBs record);

    int updateByPrimaryKey(QsJobs record);

    @Update("update  qs_jobs set audit=#{audit} where id=#{id}")
    void updateJobs(QsJobs qsJobs);

}