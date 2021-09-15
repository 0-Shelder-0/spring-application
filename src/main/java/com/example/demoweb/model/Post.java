package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private final Long _id;
    private final String _text;
    private final Date _creationDate;
    private Integer _likes;

    public Post(Long id, String text, Date creationDate) {
        _id = id;
        _text = text;
        _creationDate = creationDate;
        _likes = 0;
    }

    public Long getId() {
        return _id;
    }

    public String getText() {
        return _text;
    }

    public Integer getLikes() {
        return _likes;
    }

    public void setLikes(Integer likes) {
        _likes = likes;
    }

    public Date getCreationDate() {
        return _creationDate;
    }
}
