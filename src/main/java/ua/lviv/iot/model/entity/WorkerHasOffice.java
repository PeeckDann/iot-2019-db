package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "worker_has_office")
public class WorkerHasOffice {

    @PrimaryKey
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
