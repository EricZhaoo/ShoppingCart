package com.shop.ecommerce.service.implementation;

import com.shop.ecommerce.dao.AreaDao;
import com.shop.ecommerce.entity.Area;
import com.shop.ecommerce.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImplementation implements AreaService {
    @Autowired
    AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryAreaList();
    }

}
