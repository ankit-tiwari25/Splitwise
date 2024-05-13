package dev.ankit.splitwise.model.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "splitwise_user")
@Getter
@Setter
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
    @ManyToMany
     private List<Group> groups;
    @ManyToMany
     private List<User> friends;
}
