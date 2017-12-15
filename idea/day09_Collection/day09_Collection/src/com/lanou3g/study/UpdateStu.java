package com.lanou3g.study;

public class UpdateStu implements Comparable {
    private String name;
    private int id;

    public UpdateStu() {
    }

    public UpdateStu(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
