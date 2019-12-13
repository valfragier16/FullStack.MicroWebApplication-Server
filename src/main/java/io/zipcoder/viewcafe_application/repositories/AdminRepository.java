package io.zipcoder.viewcafe_application.repositories;

import io.zipcoder.viewcafe_application.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
    Admin findByAdminName(String adminName);
}
