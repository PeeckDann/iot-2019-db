package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;

    public Monitor() {
    }

    public Monitor(String name, String size, String resolution, String refreshRate, Workspace workspace) {
        this(-1, name, size, resolution, refreshRate, workspace);
    }

    public Monitor(Integer id, String name, String size, String resolution, String refreshRate, Workspace workspace) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.workspace = workspace;
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
        result = prime * result + ((workspace == null) ? 0 : workspace.hashCode());
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
        if (workspace == null) {
            if (other.workspace != null)
                return false;
        } else if (!workspace.equals(other.workspace))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Monitor [id=" + id + ", name=" + name + ", size=" + size + ", resolution=" + resolution
                + ", refreshRate=" + refreshRate + ", workspace=" + workspace + "]\n";
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

    public Workspace getWorkspace() {
        return workspace;
    }

    public void setWorkspace(Workspace workspace) {
        this.workspace = workspace;
    }

}