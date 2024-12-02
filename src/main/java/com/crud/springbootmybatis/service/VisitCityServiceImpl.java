package com.crud.springbootmybatis.service;

import com.crud.springbootmybatis.mapper.CityMapper;
import com.crud.springbootmybatis.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitCityServiceImpl implements VisitCityService {

    @Autowired
    private CityMapper cityMapper;


    public City getCityInformationByName(String name) {
        City cityInformation = cityMapper.visitCityByName(name);
        return cityInformation;
    }
}
