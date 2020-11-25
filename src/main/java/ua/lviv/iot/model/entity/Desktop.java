package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "desktop")
public class Desktop {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "hardware_id")
    private Integer hardwareId;

    @Column(name = "workspace_id")
    private Integer workspaceId;

    public Desktop() {
    }

    public Desktop(String name, Integer hardwareId, Integer workspaceId) {
        this(-1, name, hardwareId, workspaceId);
    }

    public Desktop(Integer id, String name, Integer hardwareId, Integer workspaceId) {
        this.id = id;
        this.name = name;
        this.hardwareId = hardwareId;
        this.workspaceId = workspaceId;
    }

    @Override
    public String toString() {
        return "Desktop [id=" + id + ", name=" + name + ", hardwareId=" + hardwareId + ", workspaceId=" + workspaceId
                + "]\n";
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

    public Integer getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
    }
}