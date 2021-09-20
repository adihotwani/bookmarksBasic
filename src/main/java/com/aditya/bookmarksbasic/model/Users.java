package com.aditya.bookmarksbasic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
@Data
public class Users {

    @Id
    @GeneratedValue
    int id;
    String name;
    String email;
    String password;
    boolean status;

    @Override
    public boolean equals(Object o){
        if (this == o) {return true;}
        if(!(o instanceof User)) {return false;}
        Users users = (Users) o;
        return Objects.equals(email, users.email) &&
        Objects.equals(password, users.password);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,name,email,password,status);
    }

    @Override
    public String toString(){
        return "Users{" + "id=" + id +
                ", name=" + name + '\'' +
                ", email=" + email + '\'' +
                ". status=" + status +
                '}';
    }

}
