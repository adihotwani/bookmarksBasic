package com.aditya.bookmarksbasic.repo;


import com.aditya.bookmarksbasic.model.bookmarks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<bookmarks,Integer> {
}
