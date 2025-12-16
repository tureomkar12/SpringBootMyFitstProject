package com.CarproSaas.myfirstproject.entity;

public class JournalEntity {

    private int Id;
    private String Name;
    private String Desc;
    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
