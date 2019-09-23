package com.cuddlepuddle.cuddlePuddle.PagePrograms;

public class BathProducts {
    private String bathCategory;
    private String productTitle;
    private String bathItemDescription;
    private double price;
    private int inStock;
    private int id;

    public BathProducts(int id, String productTitle, String bathItemDescription, String category, double price, int inStock) {
        this.id = id;
        this.bathCategory = category;
        this.productTitle = productTitle;
        this.bathItemDescription = bathItemDescription;
        this.price = price;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return productTitle;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public String getBathCategory() {
        return bathCategory;
    }

    public double getPrice() {
        return price;
    }

    public String getBathItemDescription() {
        return bathItemDescription;
    }

    public int getInStock() {
        return inStock;
    }


    public int getId() {
        return id;
    }



}
