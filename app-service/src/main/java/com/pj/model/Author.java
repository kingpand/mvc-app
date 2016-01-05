package com.pj.model;

/**
 * @author pengjin
 * @date 1/4/16 3:07 PM
 * @description: <br>
 * <br>
 */
public class Author {
    private String id;
    private String description;

    public Author(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
