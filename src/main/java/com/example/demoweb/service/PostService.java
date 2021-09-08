package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public Post[] listAllPosts() {
        return new Post[]{
                new Post("Post #1", 55),
                new Post("Post #2", 68),
                new Post("Post #3", 130),
        };
    }
}
