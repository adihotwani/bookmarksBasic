package com.aditya.bookmarksbasic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bookmarks")
public class bookmarks {

    @Id
    @GeneratedValue
    Integer id;
    String name;
    String url;
    Integer folderId;
    LocalDate date;
}
