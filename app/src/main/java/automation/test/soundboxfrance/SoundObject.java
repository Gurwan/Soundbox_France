/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.net.Uri;

public class SoundObject {
    private String itemName;
    private String itemSon;
    private String key;
    private Integer itemID;
    private Integer itemImage;
    private Uri itemUri;
    private Integer like;

    public SoundObject(){}

    public SoundObject(String itemName, Integer itemID){
        this.itemName = itemName;
        this.itemID = itemID;
    }

    public SoundObject(String name,String son,String key,Integer like){
        this.itemName = name;
        this.itemSon = son;
        this.key = key;
        this.like = like;
    }

    public SoundObject(String itemName, Uri itemUri){
        this.itemName = itemName;
        this.itemUri = itemUri;
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
    public String getKey() {
        return key;
    }
    public Integer getLike() {
        return like;
    }
    public String getItemSon() {
        return itemSon;
    }
    public Uri getItemUri() {
        return itemUri;
    }

    public void setLike(Integer like) {
        this.like = like;
    }
    public void setName(String itemName) {
        this.itemName = itemName;
    }
    public void setImage(Integer image) {
        this.itemImage = image;
    }
}

