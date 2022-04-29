package com.dlithe.car.dto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductDetails {

    private String productName;
    private String description;
    private int price;
    private int ratings;
}
