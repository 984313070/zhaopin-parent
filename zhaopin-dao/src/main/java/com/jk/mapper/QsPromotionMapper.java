package com.jk.mapper;

import com.jk.pojo.QsPromotion;
import com.jk.pojo.QsPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsPromotionMapper {
    int countByExample(QsPromotionExample example);

    int deleteByExample(QsPromotionExample example);

    int deleteByPrimaryKey(Integer cpId);

    int insert(QsPromotion record);

    int insertSelective(QsPromotion record);

    List<QsPromotion> selectByExample(QsPromotionExample example);

    QsPromotion selectByPrimaryKey(Integer cpId);

    int updateByExampleSelective(@Param("record") QsPromotion record, @Param("example") QsPromotionExample example);

    int updateByExample(@Param("record") QsPromotion record, @Param("example") QsPromotionExample example);

    int updateByPrimaryKeySelective(QsPromotion record);

    int updateByPrimaryKey(QsPromotion record);
}