package io.zipcoder.viewcafe_application.repositories;

import io.zipcoder.viewcafe_application.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
}
