package com.aditya.bookmarksbasic.service;

import com.aditya.bookmarksbasic.model.Folders;
import com.aditya.bookmarksbasic.model.bookmarks;
import com.aditya.bookmarksbasic.repo.BookmarkRepository;
import com.aditya.bookmarksbasic.repo.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolderService {

    @Autowired
    public FolderRepository repo;
    public BookmarkRepository repository;

    public Folders createFolder(Folders folders){
        return repo.save(folders);
    }

    public List<Folders> getAllFolders(){
        return repo.findAll();
    }

    public List<Folders> getAllSubFolders(int parentId){
        return repo.findAllSubFolders(parentId);
    }

    public Folders getFolder(int id){
        return repo.findById(id).orElse(null);
    }

    public Folders updateFolder(Folders folders){
        Folders fold = repo.findById(folders.getId()).orElse(null);
        fold.setName(folders.getName());
        fold.setParentId(folders.getParentId());
        return repo.save(fold);
    }

    public Folders deleteFolder(int id){
        BookmarkService bms = new BookmarkService();
        List<bookmarks> list = bms.getBookmarksbyFolderId(id);
        for(com.aditya.bookmarksbasic.model.bookmarks i : list){
            if(i.getFolderId()==id){
                bms.delete(i.getId());
            }
        }
        repo.deleteById(id);
        return repo.getById(id);
    }
}
