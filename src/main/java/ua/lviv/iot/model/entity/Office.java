package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "office")
public class Office {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "location_id")
    private Integer locationId;

    public Office() {
    }

    public Office(String name, Integer locationId) {
        this(-1, name, locationId);
    }

    public Office(Integer id, String name, Integer locationId) {
        this.id = id;
        this.name = name;
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "Office [id=" + id + ", name=" + name + ", locationId=" + locationId + "]\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
}
