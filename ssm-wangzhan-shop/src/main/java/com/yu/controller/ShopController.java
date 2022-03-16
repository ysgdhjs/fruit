package com.yu.controller;

import com.yu.pojo.Shop;
import com.yu.service.ShopService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    @Qualifier("ShopServiceImpl")
    private ShopService shopService;
    @RequestMapping("/allShop")
    public String list(Model model){
        List<Shop> list=shopService.queryAll();
        model.addAttribute("list",list);
        return "/allShop.jsp";
    }
    @RequestMapping("/toAddShop")
    public String toAddPaper() {
        return "/addShop.jsp";
    }

    @RequestMapping("/addShop")
    public String addPaper(Shop shop) {
        System.out.println(shop);
        shopService.add(shop);
        return "redirect:/shop/allShop";
    }

    @RequestMapping("/toUpdateShop")
    public String toUpdateBook(Model model, int id) {
        Shop shop = shopService.query(id);
        model.addAttribute("shop",shop );
        return "/updateShop.jsp";
    }

    @RequestMapping("/updateShop")
    public String updateBook(Shop shop) {
        shopService.update(shop);
//       Shop shops = shopService.query(shop.getId());
//        model.addAttribute("shops", shops);
        return "redirect:/shop/allShop";
    }

    @RequestMapping("/del/{id}")
    public String deleteShop(@PathVariable("id") int id) {
       shopService.delete(id);
        return "redirect:/shop/allShop";
    }
    @RequestMapping("/queryByName}")
    public String queryByName(String queryShopName,Model model) {
        System.out.println(queryShopName);
        Shop shop = shopService.queryByName(queryShopName);
        System.out.println(shop);
        List<Shop> shops = new ArrayList<>();
        shops.add(shop);
        if(shop==null){
            shops=shopService.queryAll();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",shops);
        return "/allShop.jsp";
    }
}
