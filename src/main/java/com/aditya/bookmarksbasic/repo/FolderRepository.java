package com.aditya.bookmarksbasic.repo;

import com.aditya.bookmarksbasic.model.Folders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folders, Integer> {
    List<Folders> findAllSubFolders(int parentId);
}
