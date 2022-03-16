package com.yu.dao;


import com.yu.pojo.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
//    增
    int add(Shop shop);

//    删
    int delete(@Param("id") int id);



//    查一条数据
    Shop query(@Param("id") int id);
    Shop queryByName(String name);
//    查全部数据
    List<Shop>queryAll();


//    改
    int update(Shop shop);





}
