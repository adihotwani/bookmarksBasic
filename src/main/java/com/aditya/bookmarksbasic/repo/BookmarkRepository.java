package com.aditya.bookmarksbasic.repo;


import com.aditya.bookmarksbasic.model.bookmarks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<bookmarks,Integer> {
    List<bookmarks> findByFolderId(int folderId);
}
