package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "printer")
public class Printer {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "format", length = 45)
    private String format;

    @Column(name = "design", length = 45)
    private String design;

    @Column(name = "workspace_id")
    private Integer workspaceId;

    public Printer() {
    }

    public Printer(String name, String format, String design, Integer workspaceId) {
        this(-1, name, format, design, workspaceId);
    }

    public Printer(Integer id, String name, String format, String design, Integer workspaceId) {
        this.id = id;
        this.name = name;
        this.format = format;
        this.design = design;
        this.workspaceId = workspaceId;
    }

    @Override
    public String toString() {
        return "Printer [id=" + id + ", name=" + name + ", format=" + format + ", design=" + design + ", workspaceId="
                + workspaceId + "]\n";
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public Integer getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
    }
}
