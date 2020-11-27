package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "router")
@Table(name = "router")
public class Router {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((WAN == null) ? 0 : WAN.hashCode());
        result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((officeId == null) ? 0 : officeId.hashCode());
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
        Router other = (Router) obj;
        if (WAN == null) {
            if (other.WAN != null)
                return false;
        } else if (!WAN.equals(other.WAN))
            return false;
        if (frequencyRange == null) {
            if (other.frequencyRange != null)
                return false;
        } else if (!frequencyRange.equals(other.frequencyRange))
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
        if (officeId == null) {
            if (other.officeId != null)
                return false;
        } else if (!officeId.equals(other.officeId))
            return false;
        return true;
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
