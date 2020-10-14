package com.innovativetecnologia.springboot2mongodb.services;

import com.innovativetecnologia.springboot2mongodb.domain.Post;
import com.innovativetecnologia.springboot2mongodb.repository.PostRepository;
import com.innovativetecnologia.springboot2mongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }
}
