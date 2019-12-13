package io.zipcoder.viewcafe_application.services;

import io.zipcoder.viewcafe_application.models.Comment;
import io.zipcoder.viewcafe_application.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private CommentRepository repository;
    @Autowired
    public CommentService(CommentRepository repository){
        this.repository = repository;
    }
    public Iterable<Comment> index() { return repository.findAll();}
        // posting a new comment
    public Comment postComment (Comment comment){
        return repository.save(comment);
    }
    // getting a single comment by single user
    public Comment getUserComment(Long userId){
        return repository.findOne(userId);
    }
    // getting all comments by a single user
    public Comment getAllUserComments(Long userId){
        //return (Comment) repository.findAll();
        return repository.findAllByUserId(userId);
    }
    // getting comments on a single video
    public Comment getVideoComments(Long videoId){
        return repository.findOne(videoId);
    }
    //deleting a comment
    public Boolean deleteComment(Long commentId){
         repository.delete(commentId);
         return true;
    }

}
