package com.dlithe.car.service;

import com.dlithe.car.dto.UserDetails;
import com.dlithe.car.entity.ProductDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductService {

    //List<UserDetails> getUserDetails();

    List<ProductDetails> getProductDetails();
}
