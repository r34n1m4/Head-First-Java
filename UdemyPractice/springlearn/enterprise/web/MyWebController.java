package com.reanima.spring.springlearn.enterprise.web;

import com.reanima.spring.springlearn.enterprise.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    public MyWebController(BusinessService businessService) {
        super();
        System.out.println("MyWebController: Constructor injection");
        this.businessService = businessService;
    }

    @Autowired
    private BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}

