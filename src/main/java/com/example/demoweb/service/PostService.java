package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    ArrayList<Post> posts = new ArrayList<Post>();

    public PostService() {
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

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }
}
