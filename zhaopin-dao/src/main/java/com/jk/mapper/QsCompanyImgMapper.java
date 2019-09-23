package com.jk.mapper;

import com.jk.pojo.QsCompanyImg;
import com.jk.pojo.QsCompanyImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsCompanyImgMapper {
    int countByExample(QsCompanyImgExample example);

    int deleteByExample(QsCompanyImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QsCompanyImg record);

    int insertSelective(QsCompanyImg record);

    List<QsCompanyImg> selectByExample(QsCompanyImgExample example);

    QsCompanyImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QsCompanyImg record, @Param("example") QsCompanyImgExample example);

    int updateByExample(@Param("record") QsCompanyImg record, @Param("example") QsCompanyImgExample example);

    int updateByPrimaryKeySelective(QsCompanyImg record);

    int updateByPrimaryKey(QsCompanyImg record);
}