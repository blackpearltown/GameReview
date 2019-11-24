package com.example.reviewgames.Models;

public class GameItems {

    private int id;
    private String nameGame;
    private String urlPhotos;
    private String shortDesc;
    private String fullDesc;
    private float ratings;
    private String urlVideo;

    public GameItems(int id, String nameGame, String urlPhotos, String shortDesc, float ratings) {
        this.id = id;
        this.nameGame = nameGame;
        this.urlPhotos = urlPhotos;
        this.shortDesc = shortDesc;
        this.ratings = ratings;
    }

    public GameItems(int id, String nameGame, String urlPhotos,
                     String shortDesc, String fullDesc,
                     float ratings, String urlVideo) {
        this.id = id;
        this.nameGame = nameGame;
        this.urlPhotos = urlPhotos;
        this.shortDesc = shortDesc;
        this.fullDesc = fullDesc;
        this.ratings = ratings;
        this.urlVideo = urlVideo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameGame() {
        return nameGame;
    }

    public void setNameGame(String nameGame) {
        this.nameGame = nameGame;
    }

    public String getUrlPhotos() {
        return urlPhotos;
    }

    public void setUrlPhotos(String urlPhotos) {
        this.urlPhotos = urlPhotos;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getFullDesc() {
        return fullDesc;
    }

    public void setFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }
}
