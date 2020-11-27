package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "laptop")
@Table(name = "laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hardwareId == null) ? 0 : hardwareId.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((workerId == null) ? 0 : workerId.hashCode());
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
        Laptop other = (Laptop) obj;
        if (hardwareId == null) {
            if (other.hardwareId != null)
                return false;
        } else if (!hardwareId.equals(other.hardwareId))
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
        if (workerId == null) {
            if (other.workerId != null)
                return false;
        } else if (!workerId.equals(other.workerId))
            return false;
        return true;
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
