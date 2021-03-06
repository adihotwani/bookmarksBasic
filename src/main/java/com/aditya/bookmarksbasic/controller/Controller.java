package com.aditya.bookmarksbasic.controller;

import com.aditya.bookmarksbasic.model.bookmarks;
import com.aditya.bookmarksbasic.service.BookmarkService;
import com.aditya.bookmarksbasic.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    public BookmarkService service;

    @PostMapping("/addBookmark")
    public bookmarks addBookmark(@RequestBody bookmarks bm) {
        return service.create(bm);
    }

    @GetMapping("/getBookmark/{id}")
    public bookmarks getBookmark(@PathVariable int id){
        return service.getBookmark(id);
    }
    @GetMapping("/getBookmarks")
    public List<bookmarks> getBookmarks(){
        return service.getBookmarks();
    }

    @GetMapping("/getBookmarksinFolder/{folderId}")
    public List<bookmarks> getBookmarksbyFolder(@PathVariable int folderId){
        return service.getBookmarksbyFolderId(folderId);
    }

    @PutMapping("/updateBookmark")
    public bookmarks updateBookmark(@RequestBody bookmarks bm){
        return service.update(bm);
    }

    @DeleteMapping("/deleteBookmark/{id}")
    public bookmarks deleteBookmarks(@PathVariable int id){
        return service.delete(id);
    }

}
