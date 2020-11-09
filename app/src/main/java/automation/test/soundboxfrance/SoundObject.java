/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;


public class SoundObject {
    private String itemName;
    private Integer itemID;
    private Integer itemImage;

    public SoundObject(String itemName, Integer itemID){
        this.itemName = itemName;
        this.itemID = itemID;
    }

    public SoundObject(String itemName, Integer itemID, Integer itemImage){

        this.itemName = itemName;
        this.itemID = itemID;
        this.itemImage = itemImage;

    }

    public SoundObject(String itemName){
        this.itemName = itemName;
    }

    public String getItemName(){
        return itemName;
    }

    public Integer getItemID(){
        return itemID;
    }

    public Integer getItemImage(){
        return itemImage;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }
    public void setID(Integer itemID) {
        this.itemID = itemID;
    }
    public void setImage(Integer image) {
        this.itemImage = image;
    }
}

