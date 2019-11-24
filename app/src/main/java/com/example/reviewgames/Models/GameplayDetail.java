package com.example.reviewgames.Models;

public class GameplayDetail{

    private int id;

    private String nameGame;

    private String video1;
    private String video2;
    private String video3;
    private String video4;




    public GameplayDetail(int id, String nameGame, String video1, String video2, String video3, String video4) {
        this.id = id;
        this.nameGame = nameGame;
        this.video1 = video1;
        this.video2 = video2;
        this.video3 = video3;
        this.video4 = video4;
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

    public String getVideo1() {
        return video1;
    }

    public void setVideo1(String video1) {
        this.video1 = video1;
    }

    public String getVideo2() {
        return video2;
    }

    public void setVideo2(String video2) {
        this.video2 = video2;
    }

    public String getVideo3() {
        return video3;
    }

    public void setVideo3(String video3) {
        this.video3 = video3;
    }

    public String getVideo4() {
        return video4;
    }

    public void setVideo4(String video4) {
        this.video4 = video4;
    }

}
