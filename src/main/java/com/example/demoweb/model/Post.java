package com.example.demoweb.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {

    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(Long _id, String _text, Date _createDate) {
        this(_id, _text, _createDate, 0);
    }

    public Post(Long _id, String _text, Date _createDate, Integer _likes) {
        this.id = _id;
        this.text = _text;
        this.creationDate = _createDate;
        this.likes = _likes;
    }

    public Long getId() { return this.id; }

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
