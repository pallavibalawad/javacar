package com.dlithe.car.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ProductDetailsResponce {

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public class ReviewResponce {
        private String productName;
        private String description;
        private double price;
        private int ratings;

        private com.dlithe.car.dto.ReviewResponce reviewResponce;
    }
}
