package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "workerhasoffice")
@Table(name = "worker_has_office")
public class WorkerHasOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

    public WorkerHasOffice() {
    }

    public WorkerHasOffice(Worker worker, Office office) {
        this(-1, worker, office);
    }

    public WorkerHasOffice(Integer id, Worker worker, Office office) {
        this.id = id;
        this.worker = worker;
        this.office = office;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((office == null) ? 0 : office.hashCode());
        result = prime * result + ((worker == null) ? 0 : worker.hashCode());
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
        if (office == null) {
            if (other.office != null)
                return false;
        } else if (!office.equals(other.office))
            return false;
        if (worker == null) {
            if (other.worker != null)
                return false;
        } else if (!worker.equals(other.worker))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "WorkerHasOffice [id=" + id + ", worker=" + worker + ", office=" + office + "]\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

}
