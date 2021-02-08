package com.igormelo.workshopmongo.services;

import com.igormelo.workshopmongo.domain.Post;
import com.igormelo.workshopmongo.repositories.PostRepository;
import com.igormelo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
    }
}
