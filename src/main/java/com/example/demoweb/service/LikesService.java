package com.example.demoweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoweb.model.Post;

@Service
public class LikesService {

    @Autowired
    PostService postService;

    public Integer like(Long postId) {
        Post post = postService.listAllPosts().get(postId.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }
}
