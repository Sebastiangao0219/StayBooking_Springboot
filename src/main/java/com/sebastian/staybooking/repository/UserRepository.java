package com.sebastian.staybooking.repository;

import com.sebastian.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                        // user, id 类型
public interface UserRepository extends JpaRepository<User, String> {
}
