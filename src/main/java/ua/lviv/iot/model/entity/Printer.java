package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "printer")
@Table(name = "printer")
public class Printer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((design == null) ? 0 : design.hashCode());
        result = prime * result + ((format == null) ? 0 : format.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((workspaceId == null) ? 0 : workspaceId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Printer other = (Printer) obj;
        if (design == null) {
            if (other.design != null)
                return false;
        } else if (!design.equals(other.design))
            return false;
        if (format == null) {
            if (other.format != null)
                return false;
        } else if (!format.equals(other.format))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (workspaceId == null) {
            if (other.workspaceId != null)
                return false;
        } else if (!workspaceId.equals(other.workspaceId))
            return false;
        return true;
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
