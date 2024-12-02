package com.crud.springbootmybatis.control;

import com.crud.springbootmybatis.pojo.City;
import com.crud.springbootmybatis.service.VisitCityService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/visit")
public class CityController {

    @Autowired
    VisitCityService VisitCityServiceImpl;


    @PostMapping("/area")
    public City viewCity(@RequestBody City cityInformation) {
        City allInformation = new City();
        if (cityInformation != null) {
             allInformation = VisitCityServiceImpl.getCityInformationByName(cityInformation.getName());
        }
        return allInformation;
    }
}
