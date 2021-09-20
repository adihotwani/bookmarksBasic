package com.aditya.bookmarksbasic.repo;

import com.aditya.bookmarksbasic.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
}
