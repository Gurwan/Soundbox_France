/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.net.Uri;

public class SoundObject {
    //nom
    private String itemName;
    //lien pour son externe
    private String itemSon;
    //catégorie
    private Category itemCategory;
    private String key;
    //son interne
    private Integer itemID;
    //image
    private Integer itemImage;
    private Uri itemUri;
    private Integer like;
    private Integer ecoutes;
    private Integer isNews;

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

    public SoundObject(String name,String son,String key,Integer like,Integer ecoutes){
        this.itemName = name;
        this.itemSon = son;
        this.key = key;
        this.like = like;
        this.ecoutes = ecoutes;
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

    public SoundObject(String itemName, Integer itemID, Integer itemImage,Category itemCategory){
        this.itemName = itemName;
        this.itemID = itemID;
        this.itemImage = itemImage;
        this.itemCategory = itemCategory;
    }

    public SoundObject(String itemName, Integer itemID, Integer itemImage,Category itemCategory,Integer isNews){
        this.itemName = itemName;
        this.itemID = itemID;
        this.itemImage = itemImage;
        this.itemCategory = itemCategory;
        this.isNews = isNews;
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

    public Category getItemCategory() {
        return itemCategory;
    }

    public Integer getEcoutes() {
        return ecoutes;
    }

    public Integer getIsNews() {
        return isNews;
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

    public void setEcoutes(Integer ecoutes) {
        this.ecoutes = ecoutes;
    }
}

