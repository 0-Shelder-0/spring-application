package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long _id;
    private String _text;
    private Date _creationDate;
    private Integer _likes;

    public Post() {
    }

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
