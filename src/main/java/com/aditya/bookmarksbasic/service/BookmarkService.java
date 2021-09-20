package com.aditya.bookmarksbasic.service;

import com.aditya.bookmarksbasic.model.bookmarks;
import com.aditya.bookmarksbasic.repo.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkService {

    @Autowired
    public BookmarkRepository repo;

    //create
    public bookmarks create(bookmarks bm){
        return repo.save(bm);
    }

    //read all
    public List<bookmarks> getBookmarks(){
        return repo.findAll();
    }
    //read single
    public bookmarks getBookmark(int id){
        return repo.findById(id).orElse(null);
    }

    public List<bookmarks> getBookmarksbyFolderId(int folderId){
        return repo.findByFolderId(folderId);
    }

    // update
    public bookmarks update(bookmarks bm){
        bookmarks exists = repo.findById(bm.getId()).orElse(null);
        exists.setName(bm.getName());
        exists.setFolderId(bm.getFolderId());
        exists.setUrl(bm.getUrl());
        exists.setDate(bm.getDate());
        return repo.save(exists);
    }
    //delete
    public bookmarks delete(int id){
        repo.deleteById(id);
        return repo.getById(id);
    }
}
