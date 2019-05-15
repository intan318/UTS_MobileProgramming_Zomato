package com.intanyoshanaoewen.utszomato.Model;

public class Categories {
    private String title;
    private String places;
    private String keterangan;
    private String imgSource;

    public Categories(String title, String places, String keterangan, String imgSource) {
        this.title = title;
        this.places = places;
        this.keterangan = keterangan;
        this.imgSource = imgSource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }
}

