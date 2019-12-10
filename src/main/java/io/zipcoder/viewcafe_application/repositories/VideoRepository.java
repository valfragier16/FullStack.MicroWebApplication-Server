package io.zipcoder.viewcafe_application.repositories;

import io.zipcoder.viewcafe_application.models.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {

}
