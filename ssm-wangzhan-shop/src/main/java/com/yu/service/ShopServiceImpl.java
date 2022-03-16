package com.yu.service;

import com.yu.dao.ShopMapper;
import com.yu.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;

    public void setShopMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Override
    public int add(Shop shop) {
        return shopMapper.add(shop);
    }

    @Override
    public int delete(int id) {
        return shopMapper.delete(id);
    }

    @Override
    public Shop query(int id) {
        return shopMapper.query(id);
    }

    @Override
    public Shop queryByName(String name) {
        return shopMapper.queryByName(name);
    }

    @Override
    public List<Shop> queryAll() {
        return shopMapper.queryAll();
    }

    @Override
    public int update(Shop shop) {
        return shopMapper.update(shop);
    }


}
