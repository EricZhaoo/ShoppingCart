package com.shop.ecommerce.controller;

import com.shop.ecommerce.entity.Area;
import com.shop.ecommerce.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping(value = "/listarea")
    @ResponseBody
    private Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> areaList = new ArrayList<>();
        try {
            areaList = areaService.getAreaList();
            modelMap.put("data", areaList);
            modelMap.put("total", areaList.size());
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("errorMessage", e.toString());
        }

        return modelMap;
    }
}
