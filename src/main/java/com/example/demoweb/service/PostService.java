package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final ArrayList<Post> _posts;

    public PostService() {
        this._posts = new ArrayList<>();
        _posts.add(new Post(0L, "Post #1", new Date()));
        _posts.add(new Post(1L, "Post #2", new Date()));
        _posts.add(new Post(2L, "Post #3", new Date()));
    }

    public ArrayList<Post> listAllPosts() {
        return _posts;
    }

    public void create(String text) {
        long size = _posts.size();
        _posts.add(new Post(size + 1, text, new Date()));
    }
}
