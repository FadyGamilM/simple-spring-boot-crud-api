package com.crudApi;

import java.util.Objects;

public class User {
    private int Id;
    private String username;

    public User(int id, String username) {
        Id = id;
        this.username = username;
    }

    public User() {
    }

    public int getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Id == user.Id && username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, username);
    }
}
