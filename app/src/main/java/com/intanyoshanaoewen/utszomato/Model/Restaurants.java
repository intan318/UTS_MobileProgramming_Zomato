package com.intanyoshanaoewen.utszomato.Model;

public class Restaurants {
    private String namaRestaurant;
    private String lokasiRestaurant;
    private String jenisRestaurant;
    private String rangeHarga;
    private String rating;
    private String jamOperasional;
    private String imgSource;

    public Restaurants(String namaRestaurant, String lokasiRestaurant, String jenisRestaurant, String rangeHarga, String rating, String jamOperasional, String imgSource){
        this.namaRestaurant = namaRestaurant;
        this.lokasiRestaurant = lokasiRestaurant;
        this.jenisRestaurant = jenisRestaurant;
        this.rangeHarga = rangeHarga;
        this.rating = rating;
        this.jamOperasional = jamOperasional;
        this.imgSource = imgSource;
    }

    public String getNamaRestaurant() {
        return namaRestaurant;
    }

    public void setNamaRestaurant(String namaRestaurant) {
        this.namaRestaurant = namaRestaurant;
    }

    public String getLokasiRestaurant() {
        return lokasiRestaurant;
    }

    public void setLokasiRestaurant(String lokasiRestaurant) {
        this.lokasiRestaurant = lokasiRestaurant;
    }

    public String getJenisRestaurant() {
        return jenisRestaurant;
    }

    public void setJenisRestaurant(String jenisRestaurant) {
        this.jenisRestaurant = jenisRestaurant;
    }

    public String getRangeHarga() {
        return rangeHarga;
    }

    public void setRangeHarga(String rangeHarga) {
        this.rangeHarga = rangeHarga;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getJamOperasional() {
        return jamOperasional;
    }

    public void setJamOperasional(String jamOperasional) {
        this.jamOperasional = jamOperasional;
    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }


}
