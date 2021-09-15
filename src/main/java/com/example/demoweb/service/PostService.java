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
        _posts.add(new Post("Post #1", new Date(), 55));
        _posts.add(new Post("Post #2", new Date(), 68));
        _posts.add(new Post("Post #3", new Date(), 130));
    }

    public Post[] listAllPosts() {
        return _posts.toArray(new Post[0]);
    }

    public void create(String text) {
        _posts.add(new Post(text, new Date(), 0));
    }
}
