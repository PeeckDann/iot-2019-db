package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "laptop")
public class Laptop {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "hardware_id")
    private Integer hardwareId;

    @Column(name = "worker_id")
    private Integer workerId;

    public Laptop() {
    }

    public Laptop(String name, Integer hardwareId, Integer workerId) {
        this(-1, name, hardwareId, workerId);
    }

    public Laptop(Integer id, String name, Integer hardwareId, Integer workerId) {
        this.id = id;
        this.name = name;
        this.hardwareId = hardwareId;
        this.workerId = workerId;
    }

    @Override
    public String toString() {
        return "Laptop [id=" + id + ", name=" + name + ", hardwareId=" + hardwareId + ", workerId=" + workerId + "]\n";
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

    public Integer getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(Integer hardwareId) {
        this.hardwareId = hardwareId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }
}
