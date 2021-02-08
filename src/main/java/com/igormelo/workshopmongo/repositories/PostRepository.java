package com.igormelo.workshopmongo.repositories;

import com.igormelo.workshopmongo.domain.Post;
import com.igormelo.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
