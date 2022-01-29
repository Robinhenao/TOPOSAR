package utils;


public class producto {
private String name;
private String price;
private int nid;
private String description;

    public producto(String name, String price, int nid, String description) {
        this.name = name;
        this.price = price;
        this.nid = nid;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }
    
}
