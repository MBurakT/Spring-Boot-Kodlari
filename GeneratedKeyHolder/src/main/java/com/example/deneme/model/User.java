package com.example.deneme.model;

import java.util.Objects;
import java.util.StringJoiner;

public class User {

    private Long id;
    private String name;
    private MaritalStatus maritalStatus;

    public User(){}

    public User(Long id, String name, MaritalStatus maritalStatus){
        this.id = id;
        this.name = name;
        this.maritalStatus = maritalStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                maritalStatus == user.maritalStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, maritalStatus);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("maritalStatus=" + maritalStatus)
                .toString();
    }

}
