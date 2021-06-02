package com.example.cafe.models;

public class HotCoffee {
    String type;
    String imageURL;
    String name;
    String description;
    Float price;

    public HotCoffee(String type, String imageURL, String name, String description, Float price) {
        this.type = type;
        this.imageURL = imageURL;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}
