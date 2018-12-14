package com.hss.boot5.controller;

import com.hss.boot5.bean.GoodInfoBean;
import com.hss.boot5.bean.GoodTypeBean;
import com.hss.boot5.datamapper.GoodInfoMapper;
import com.hss.boot5.dto.GoodInfoDTO;
import com.hss.boot5.jpa.GoodInfoJPA;
import com.hss.boot5.jpa.GoodTypeJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GoodInfoController {
    /**
     * 注入商品基本信息jpa
     */
    @Autowired
    private GoodInfoJPA goodInfoJPA;

    /**
     * 注入商品类型jpa
     */
    @Autowired
    private GoodTypeJPA goodTypeJPA;

    /**
     * 注入mapStruct转换Mapper
     */
    @Autowired
    private GoodInfoMapper goodInfoMapper;

//  http://127.0.0.1:8080/detail/1
    @RequestMapping(value = "/detail/{id}")
    public GoodInfoDTO detail(@PathVariable("id") Long id){
        //查询商品基本信息
        Optional<GoodInfoBean> goodInfoBean = goodInfoJPA.findById(id);

        //查询商品类型基本信息
        Optional<GoodTypeBean> typeBean = goodTypeJPA.findById(goodInfoBean.get().getId());

        //返回转换dto
        return goodInfoMapper.from(goodInfoBean.get(),typeBean.get());
    }

}
