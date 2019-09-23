package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.QsConfigMapper;
import com.jk.pojo.QsConfig;
import com.jk.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 项目名称：zhaopin-parent
 * 类名称：PersonServiceImpl
 * 类描述：
 * 创建人：马娇娇
 * 创建时间：2019-09-10 16:33
 * 修改人：马娇娇
 * 修改时间：2019-09-10 16:33
 * 修改备注：
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private QsConfigMapper configMapper;


    @Override
    public int updateSet(QsConfig qsConfig) {
        return configMapper.updateByPrimaryKey(qsConfig);
    }


}
