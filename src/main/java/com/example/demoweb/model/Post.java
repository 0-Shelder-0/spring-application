package com.example.demoweb.model;

public class Post {
    private final String _text;
    private final Integer _likes;

    public Post(String text, Integer likes) {
        _text = text;
        _likes = likes;
    }

    public String getText() {
        return _text;
    }

    public Integer getLikes() {
        return _likes;
    }
}
