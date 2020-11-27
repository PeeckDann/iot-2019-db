package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "worker_has_office")
@Table(name = "worker_has_office")
public class WorkerHasOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "worker_id")
    private Integer workerId;

    @Column(name = "office_id")
    private Integer officeId;

    public WorkerHasOffice() {
    }

    public WorkerHasOffice(Integer workerId, Integer officeId) {
        this(-1, workerId, officeId);
    }

    public WorkerHasOffice(Integer id, Integer workerId, Integer officeId) {
        this.id = id;
        this.workerId = workerId;
        this.officeId = officeId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((officeId == null) ? 0 : officeId.hashCode());
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
        WorkerHasOffice other = (WorkerHasOffice) obj;
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
        if (workerId == null) {
            if (other.workerId != null)
                return false;
        } else if (!workerId.equals(other.workerId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "WorkerHasOffice [id=" + id + ", workerId=" + workerId + ", officeId=" + officeId + "]\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

}
