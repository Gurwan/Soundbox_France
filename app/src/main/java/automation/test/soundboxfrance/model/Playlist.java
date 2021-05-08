/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.model;

public class Playlist {
    private String name;
    private int id;

    public Playlist(String name,int id){
        this.name = name;
        this.id = id;
    }

    public Playlist(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
