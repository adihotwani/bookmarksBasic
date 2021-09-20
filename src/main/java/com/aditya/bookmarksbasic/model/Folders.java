package com.aditya.bookmarksbasic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "folder")
public class Folders {

    String name;
    @Id
    @GeneratedValue
    Integer id;
    Integer parentId;

}
