package io.zipcoder.viewcafe_application.services;

import io.zipcoder.viewcafe_application.repositories.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private CommentRepository repository;

    public CommentService(CommentRepository repository){
        this.repository = repository;
    }
}
