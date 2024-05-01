package com.example.M3PruebaTecnica.model.dto;

public class LenguageDTO {

    private int id;
    private String code;
    private String name;
    private boolean compilated;
    private int creationDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompilated() {
        return compilated;
    }

    public void setCompilated(boolean compilated) {
        this.compilated = compilated;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

}
