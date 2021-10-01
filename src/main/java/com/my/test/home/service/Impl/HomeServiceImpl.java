package com.my.test.home.service.Impl;

import com.my.test.home.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public String Text(String text){
        return text;
    }
}
