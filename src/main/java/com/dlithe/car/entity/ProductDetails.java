package com.dlithe.car.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Setter
@Getter
@ToString
@Entity
@Table(name="product")
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column()
    private String productName;
    @Column()
    private String description;
    @Column()
    private int price;
    @Column()
    private int ratings;


}
