package com.mellivora.pundit.controller;

import com.mellivora.pundit.service.MiShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: mellivora-pundit
 * @description: 商店基本信息
 * @author: jin.rao@sunyard.com
 * @create: 2019-03-12 20:21
 **/
@RestController
@RequestMapping(value = {"/shop"})
public class MiShopController {
    @Autowired
    private MiShopService miShopService;

    @RequestMapping(value = {"/finAll"}, method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List finAllShop(){
        List list = miShopService.finAllShop();
        return list;
    }

    @GetMapping(value = "/Test")
    public String say(){
        return "我爱你！";
    }



}
