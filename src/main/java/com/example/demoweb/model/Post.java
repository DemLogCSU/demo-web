package com.example.demoweb.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String _text) {
        this(_text, new Date(), 0);
    }

    public Post(String _text, Date _createDate, Integer _likes) {
        this.text = _text;
        this.creationDate = _createDate;
        this.likes = _likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public String getCreationDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return formatter.format(this.creationDate);
    }
}
