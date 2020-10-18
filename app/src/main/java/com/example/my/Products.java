package com.example.my;

import android.widget.ImageView;

public class Products {
        public String image;
        public String foodname;
        public Integer price;


        public Products(String foodname, Integer price, String image) {
            this.foodname = foodname;
            this.price = price;
            this.image = image;
        }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
