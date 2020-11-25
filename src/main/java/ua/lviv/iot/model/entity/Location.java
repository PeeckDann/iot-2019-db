package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "location")
public class Location {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "building_number")
    private Integer buildingNumber;

    @Column(name = "street", length = 45)
    private String street;

    @Column(name = "city", length = 45)
    private String city;

    @Column(name = "country", length = 45)
    private String country;

    public Location() {
    }

    public Location(Integer buildingNumber, String street, String city, String country) {
        this(-1, buildingNumber, street, city, country);
    }

    public Location(Integer id, Integer buildingNumber, String street, String city, String country) {
        this.id = id;
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location [id=" + id + ", buildingNumber=" + buildingNumber + ", street=" + street + ", city=" + city
                + ", country=" + country + "]\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}