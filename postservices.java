package com.smma.service;

import com.smma.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();

    public void schedulePost(Post post) {
        posts.add(post);
    }

    public List<Post> getAllPosts() {
        return posts;
    }
}
