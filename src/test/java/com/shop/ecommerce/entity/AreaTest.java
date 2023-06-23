package com.shop.ecommerce.entity;

import org.junit.Assert;
import org.junit.Test;

public class AreaTest {
    @Test
    public void testArea() {
        Area area = new Area();
        String areaName = "Test Area Name";
        area.setAreaName(areaName);
        Assert.assertEquals(areaName, area.getAreaName());
    }
}
