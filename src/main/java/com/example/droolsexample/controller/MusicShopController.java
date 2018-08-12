package com.example.droolsexample.controller;

import com.example.droolsexample.model.Product;
import com.example.droolsexample.service.MusicShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("music")
public class MusicShopController {

    @Autowired
    private MusicShopService musicShopService;

    @GetMapping("shop")
    public Product getProductDetails(@RequestParam(required = true) String type){

        Product product = new Product();
        product.setType(type);
        musicShopService.getProductDiscount(product);
        return product;

    }
}
