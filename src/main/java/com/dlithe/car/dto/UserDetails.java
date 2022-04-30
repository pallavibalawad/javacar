package com.dlithe.car.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserDetails {

    private int id;
    private String name;
    private String age;
    //private ProductDetails> productReview;
    private List<ProductDetails> productReview;

}
