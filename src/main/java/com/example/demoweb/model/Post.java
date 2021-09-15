package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private final String _text;
    private final Integer _likes;
    private final Date _creationDate;

    public Post(String text, Date creationDate, Integer likes) {
        _text = text;
        _creationDate = creationDate;
        _likes = likes;
    }

    public String getText() {
        return _text;
    }

    public Integer getLikes() {
        return _likes;
    }

    public Date getCreationDate() {
        return _creationDate;
    }
}
