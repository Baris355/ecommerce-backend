package com.baris355.demo.ecommercebackend.model.dao;

import com.baris355.demo.ecommercebackend.model.LocalUser;
import com.baris355.demo.ecommercebackend.model.WebOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder,Long> {
    List<WebOrder> findByUser(LocalUser user);

}
