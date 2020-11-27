package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "monitor")
@Table(name = "monitor")
public class Monitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((refreshRate == null) ? 0 : refreshRate.hashCode());
        result = prime * result + ((resolution == null) ? 0 : resolution.hashCode());
        result = prime * result + ((size == null) ? 0 : size.hashCode());
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
        Monitor other = (Monitor) obj;
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
        if (refreshRate == null) {
            if (other.refreshRate != null)
                return false;
        } else if (!refreshRate.equals(other.refreshRate))
            return false;
        if (resolution == null) {
            if (other.resolution != null)
                return false;
        } else if (!resolution.equals(other.resolution))
            return false;
        if (size == null) {
            if (other.size != null)
                return false;
        } else if (!size.equals(other.size))
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