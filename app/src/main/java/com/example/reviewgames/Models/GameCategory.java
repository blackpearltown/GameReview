package com.example.reviewgames.Models;

public class GameCategory {

    private int idCategory;
    private String nameCategory;
    private String urlPhotoCategory;

    public GameCategory(int idCategory, String nameCategory, String urlPhotoCategory) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.urlPhotoCategory = urlPhotoCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getUrlPhotoCategory() {
        return urlPhotoCategory;
    }

    public void setUrlPhotoCategory(String urlPhotoCategory) {
        this.urlPhotoCategory = urlPhotoCategory;
    }
}
