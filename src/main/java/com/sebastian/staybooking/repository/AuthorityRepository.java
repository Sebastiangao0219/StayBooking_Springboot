package com.sebastian.staybooking.repository;

import com.sebastian.staybooking.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
