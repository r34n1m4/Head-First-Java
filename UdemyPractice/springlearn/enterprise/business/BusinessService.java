package com.reanima.spring.springlearn.enterprise.business;

import com.reanima.spring.springlearn.enterprise.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    @Autowired
    public BusinessService(DataService dataService) {
        super();
        System.out.println("BusinessService: Constructor injection");
        this.dataService = dataService;
    }

    private DataService dataService;


    public DataService getDataService() {
        return dataService;
    }
    @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("BusinessService: Setter injection");
        this.dataService = dataService;
    }

    public long calculateSum() {
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
