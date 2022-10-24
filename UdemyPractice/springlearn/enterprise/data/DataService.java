package com.reanima.spring.springlearn.enterprise.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    @Autowired
    public List<Integer> getData() {
        return Arrays.asList(10, 20, 30, 40);
    }
}
