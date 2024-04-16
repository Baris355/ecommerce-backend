package com.baris355.demo.ecommercebackend.model.dao;

import com.baris355.demo.ecommercebackend.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {

}
