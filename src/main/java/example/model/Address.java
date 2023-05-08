package example.model;

import java.io.Serializable;

public class Address implements Serializable {
    int house;
    String name;

    public Address() {
    }

    public Address(int house, String name, String organization) {
        this.house = house;
        this.name = name;
        this.organization = organization;
    }

    String organization;

    public void setHouse(int house) {
        this.house = house;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getHouse() {
        return house;
    }

    public String getName() {
        return name;
    }

    public String getOrganization() {
        return organization;
    }
}
