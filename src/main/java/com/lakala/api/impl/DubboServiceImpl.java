package com.lakala.api.impl;

import com.lakala.api.DubboService;

public class DubboServiceImpl implements DubboService {
    public String printWorld(String world) {
        System.out.println("hello " + world);
        return world;
    }
}
