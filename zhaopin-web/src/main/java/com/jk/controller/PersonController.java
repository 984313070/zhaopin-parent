package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.QsConfig;
import com.jk.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：zhaopin-parent
 * 类名称：QsConfigController
 * 类描述：
 * 创建人：马娇娇
 * 创建时间：2019-09-10 16:36
 * 修改人：马娇娇
 * 修改时间：2019-09-10 16:36
 * 修改备注：
 */
@RestController
@RequestMapping("/config")
public class PersonController {

    @Reference
    private PersonService personService;

    @RequestMapping("/updateSet")
    public int updateSet(QsConfig qsConfig){
        System.out.println(qsConfig);
      return  personService.updateSet(qsConfig);
    }

}
