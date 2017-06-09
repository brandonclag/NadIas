package com.example.android.data.model;

/**
 * Created by Brandon on 6/8/2017.
 */

public class DataItem {

    private String itemId;
    private String itemName;
    private String descrioption;
    private String category;
    private int sortPosition;
    private double price;
    private String image;

    public DataItem() {
    }

    public DataItem( String itemId, String itemName, String descrioption, String category, int sortPosition, double price, String image) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.descrioption = descrioption;
        this.category = category;
        this.sortPosition = sortPosition;
        this.price = price;
        this.image = image;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescrioption() {
        return descrioption;
    }

    public void setDescrioption(String descrioption) {
        this.descrioption = descrioption;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSortPosition() {
        return sortPosition;
    }

    public void setSortPosition(int sortPosition) {
        this.sortPosition = sortPosition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", descrioption='" + descrioption + '\'' +
                ", category='" + category + '\'' +
                ", sortPosition=" + sortPosition +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
