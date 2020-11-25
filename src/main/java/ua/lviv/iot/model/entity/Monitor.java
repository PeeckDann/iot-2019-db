package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "monitor")
public class Monitor {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "size", length = 45)
    private String size;

    @Column(name = "resolution", length = 45)
    private String resolution;

    @Column(name = "refresh_rate", length = 45)
    private String refreshRate;

    @Column(name = "workspace_id")
    private Integer workspaceId;

    public Monitor() {
    }

    public Monitor(String name, String size, String resolution, String refreshRate, Integer workspaceId) {
        this(-1, name, size, resolution, refreshRate, workspaceId);
    }

    public Monitor(Integer id, String name, String size, String resolution, String refreshRate, Integer workspaceId) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.workspaceId = workspaceId;
    }

    @Override
    public String toString() {
        return "Monitor [id=" + id + ", name=" + name + ", size=" + size + ", resolution=" + resolution
                + ", refreshRate=" + refreshRate + ", workspaceId=" + workspaceId + "]\n";
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
    }

    public Integer getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
    }
}