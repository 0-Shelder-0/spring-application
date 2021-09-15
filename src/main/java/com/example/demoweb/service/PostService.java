package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class PostService {
    public Post[] listAllPosts() {
        return new Post[]{
                new Post("Post #1", new Date(), 55),
                new Post("Post #2", new Date(), 68),
                new Post("Post #3", new Date(), 130),
        };
    }
}
