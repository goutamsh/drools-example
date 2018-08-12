package com.example.droolsexample.service;

import com.example.droolsexample.model.Product;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicShopService {

    private KieContainer kieContainer;

    @Autowired
    public MusicShopService(KieContainer kieContainer){
        this.kieContainer = kieContainer;
    }

    public Product getProductDiscount(Product product) {

        KieSession kieSession = kieContainer.newKieSession("ProductSession");
        kieSession.insert(product);
        kieSession.fireAllRules();
        kieSession.dispose();
        return product;
    }
}
