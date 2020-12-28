/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.net.Uri;

/**
 * Created by gurwa on 16/02/2018.
 */

public class SoundObject {
    private String itemName;
    private Integer itemID;
    private Integer itemImage;
    private Uri itemUri;

    public SoundObject(String itemName, Integer itemID){
        this.itemName = itemName;
        this.itemID = itemID;
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

    public void setName(String itemName) {
        this.itemName = itemName;
    }
    public void setID(Integer itemID) {
        this.itemID = itemID;
    }
    public void setImage(Integer image) {
        this.itemImage = image;
    }

    public Uri getItemUri() {
        return itemUri;
    }
}

