package com.seeyon.apps.autonum;


import com.seeyon.ctp.common.AbstractSystemInitializer;

public class AutoNumberInitializer extends AbstractSystemInitializer {

    public void destroy() {
        System.out.println("销毁autonum模块");
    }

    public void initialize() {
        System.out.println("初始化autonum模块");
    }
    
}