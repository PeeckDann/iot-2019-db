package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "router")
public class Router {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "frequency_range", length = 45)
    private String frequencyRange;

    @Column(name = "WAN", length = 45)
    private String WAN;

    @Column(name = "office_id")
    private Integer officeId;

    public Router() {
    }

    public Router(String name, String frequencyRange, String wAN, Integer officeId) {
        this(-1, name, frequencyRange, wAN, officeId);
    }

    public Router(Integer id, String name, String frequencyRange, String wAN, Integer officeId) {
        this.id = id;
        this.name = name;
        this.frequencyRange = frequencyRange;
        WAN = wAN;
        this.officeId = officeId;
    }

    @Override
    public String toString() {
        return "Router [id=" + id + ", name=" + name + ", frequencyRange=" + frequencyRange + ", WAN=" + WAN
                + ", officeId=" + officeId + "]\n";
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

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public String getWAN() {
        return WAN;
    }

    public void setWAN(String wAN) {
        WAN = wAN;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

}
