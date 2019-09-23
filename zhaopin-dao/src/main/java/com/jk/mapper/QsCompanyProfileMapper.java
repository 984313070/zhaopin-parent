package com.jk.mapper;

import com.jk.pojo.QsCompanyProfile;
import com.jk.pojo.QsCompanyProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsCompanyProfileMapper {
    int countByExample(QsCompanyProfileExample example);

    int deleteByExample(QsCompanyProfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsCompanyProfile record);

    int insertSelective(QsCompanyProfile record);

    List<QsCompanyProfile> selectByExampleWithBLOBs(QsCompanyProfileExample example);

    List<QsCompanyProfile> selectByExample(QsCompanyProfileExample example);

    QsCompanyProfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsCompanyProfile record, @Param("example") QsCompanyProfileExample example);

    int updateByExampleWithBLOBs(@Param("record") QsCompanyProfile record, @Param("example") QsCompanyProfileExample example);

    int updateByExample(@Param("record") QsCompanyProfile record, @Param("example") QsCompanyProfileExample example);

    int updateByPrimaryKeySelective(QsCompanyProfile record);

    int updateByPrimaryKeyWithBLOBs(QsCompanyProfile record);

    int updateByPrimaryKey(QsCompanyProfile record);
}