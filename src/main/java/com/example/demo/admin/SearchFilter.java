package com.example.demo.admin;

import java.util.Objects;

public class SearchFilter {

    private String name;

    public SearchFilter(String name) {
        setName(name);
    }

    public SearchFilter() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects
                .requireNonNullElse(name, "")
                .trim();
    }
}
