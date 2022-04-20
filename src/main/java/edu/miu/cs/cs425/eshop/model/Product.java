package edu.miu.cs.cs425.eshop.model;

import java.util.List;

public class Product {
    private Long productId;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    private List<Category> category;
}
