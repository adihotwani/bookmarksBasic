package com.aditya.bookmarksbasic.controller;


import com.aditya.bookmarksbasic.model.Folders;
import com.aditya.bookmarksbasic.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    public FolderService fService;

    @PostMapping("/createFolder")
    public Folders createFolder(@RequestBody Folders folders){
        return fService.createFolder(folders);
    }

    @GetMapping("/getFolders")
    public List<Folders> getFoldersAll(){
        return fService.getAllFolders();
    }

    @GetMapping("/getSubFolders/{parentId}")
    public List<Folders> getSubFolders(@PathVariable int parentId){
        return fService.getAllSubFolders(parentId);
    }

    @GetMapping("/getFolder/{id}")
    public Folders getFolder(@PathVariable int id){
        return fService.getFolder(id);
    }

    @PutMapping("/updateFolder")
    public Folders updateFolder(@RequestBody Folders folder){
        return fService.updateFolder(folder);
    }

    @DeleteMapping("/deleteFolder/{id}")
    public Folders deleteFolder(@PathVariable int id){
        return fService.deleteFolder(id);
    }
}
