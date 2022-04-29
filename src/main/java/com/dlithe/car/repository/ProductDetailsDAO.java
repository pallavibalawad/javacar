package com.dlithe.car.repository;

import com.dlithe.car.dto.ProductDetailsResponce;

import java.util.List;

public interface ProductDetailsDAO {
    List<ProductDetailsResponce> findAll();
}
