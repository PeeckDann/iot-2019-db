package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "workspace")
@Table(name = "workspace")
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cabinet_number")
    private Integer cabinetNumber;

    @Column(name = "office_id")
    private Integer officeId;

    public Workspace() {
    }

    public Workspace(Integer cabinetNumber, Integer officeId) {
        this(-1, cabinetNumber, officeId);
    }

    public Workspace(Integer id, Integer cabinetNumber, Integer officeId) {
        this.id = id;
        this.cabinetNumber = cabinetNumber;
        this.officeId = officeId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cabinetNumber == null) ? 0 : cabinetNumber.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Workspace other = (Workspace) obj;
        if (cabinetNumber == null) {
            if (other.cabinetNumber != null)
                return false;
        } else if (!cabinetNumber.equals(other.cabinetNumber))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
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
        return "Workspace [id=" + id + ", cabinetNumber=" + cabinetNumber + ", officeId=" + officeId + "]\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(Integer cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }
}
