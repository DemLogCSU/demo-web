package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;
    @Autowired
    PostRepository postRepository;

    {
        posts.add(new Post((long) posts.size(), "В Африканском союзе объяснили, почему делегацию Израиля выгнали с саммита",
                new Date(2454545564L),
                34));
        posts.add(new Post((long) posts.size(), "В Вашингтоне началась акция против поддержки Украины",
                new Date(245456766564L),
                54));
        posts.add(new Post((long) posts.size(), "Пекин отказался мириться с попытками США надавить на отношения России и КНР",
                new Date(6576743564L),
                57));
    }

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
        long newId = posts.size();
        posts.add(new Post(newId, text, new Date()));
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
