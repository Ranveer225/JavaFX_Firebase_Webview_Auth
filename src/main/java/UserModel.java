package com.mycompany.mvvmexample;

public class UserModel {
    private static UserModel instance;

    private String name;

    private UserModel() {
    }

    public static synchronized UserModel getInstance() {
        if (instance == null) {
            instance = new UserModel();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
