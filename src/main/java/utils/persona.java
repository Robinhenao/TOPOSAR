package utils;

public class persona {

    private String name;
    private String lastname;
    private int id;
    private String cell;
    private String email;

    public persona(String name, String lastname, int id, String cell, String email) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.cell = cell;
        this.email = email;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
}