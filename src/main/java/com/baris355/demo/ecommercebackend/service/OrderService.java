package com.baris355.demo.ecommercebackend.service;

import com.baris355.demo.ecommercebackend.model.LocalUser;
import com.baris355.demo.ecommercebackend.model.WebOrder;
import com.baris355.demo.ecommercebackend.model.dao.WebOrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private WebOrderDAO webOrderDAO;

    public OrderService(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    public List<WebOrder> getOrders(LocalUser user) {
        return webOrderDAO.findByUser(user);
    }


}
