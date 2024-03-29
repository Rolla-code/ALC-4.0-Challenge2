package com.example.travelmantics;/*
import java.io.Serializable;*/

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String description;
    private String price;
    private String imageURL;

    public TravelDeal(){}
    public TravelDeal(String title, String description, String price, String imageURL){
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);
        this.setPrice(price);
        this.setImageURL(imageURL);
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public String getImageURL() {

        return imageURL;
    }

    public void setImageURL(String imageURL) {

        this.imageURL = imageURL;
    }
}
