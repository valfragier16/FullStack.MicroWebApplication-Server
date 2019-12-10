package io.zipcoder.viewcafe_application.repositories;

import io.zipcoder.viewcafe_application.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
