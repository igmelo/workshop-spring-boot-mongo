package com.igormelo.workshopmongo.resources;

import com.igormelo.workshopmongo.domain.Post;
import com.igormelo.workshopmongo.services.PostService;
import com.igormelo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id){

        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}