package utils;

public class cliente {
    private int id;
    private String name;
    private String lastname;
    private int cc;
    private int cell;
    private String email;

    public cliente(int id, String name, String lastname, int cc, int cell, String email) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.cc = cc;
        this.cell = cell;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
}