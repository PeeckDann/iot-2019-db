package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "ip_phone")
public class IpPhone {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "number", length = 45)
    private String number;

    @Column(name = "workspace_id")
    private Integer workspaceId;

    public IpPhone() {
    }

    public IpPhone(String name, String number, Integer workspaceId) {
        this(-1, name, number, workspaceId);
    }

    public IpPhone(Integer id, String name, String number, Integer workspaceId) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.workspaceId = workspaceId;
    }

    @Override
    public String toString() {
        return "IpPhone [id=" + id + ", name=" + name + ", number=" + number + ", workspaceId=" + workspaceId + "]\n";
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
    }
}