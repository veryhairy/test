package com.lanou3g.study;

import java.io.Serializable;

public class Pet implements Serializable{
    private String name;
    private String gender;

    public Pet(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}
