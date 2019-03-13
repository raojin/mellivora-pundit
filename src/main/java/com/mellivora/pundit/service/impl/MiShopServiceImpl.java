package com.mellivora.pundit.service.impl;

import com.mellivora.pundit.mapper.MiShopMapper;
import com.mellivora.pundit.service.MiShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mellivora-pundit
 * @description:
 * @author: jin.rao@sunyard.com
 * @create: 2019-03-12 20:34
 **/
@Service(value = "miShopService")
public class MiShopServiceImpl implements MiShopService {
    @Autowired
    private MiShopMapper miShopDao;
    @Override
    public List finAllShop() {
        return miShopDao.findAllShop();
    }
}
