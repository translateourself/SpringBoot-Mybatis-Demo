package com.crud.springbootmybatis.mapper;

import com.crud.springbootmybatis.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
@Select("select * from city where name = #{name}")
    City visitCityByName(String name);
}
