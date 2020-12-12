package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "workerhasworkspace")
@Table(name = "worker_has_workspace")
public class WorkerHasWorkspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;

    public WorkerHasWorkspace() {
    }

    public WorkerHasWorkspace(Worker worker, Workspace workspace) {
        this(-1, worker, workspace);
    }

    public WorkerHasWorkspace(Integer id, Worker worker, Workspace workspace) {
        this.id = id;
        this.worker = worker;
        this.workspace = workspace;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((worker == null) ? 0 : worker.hashCode());
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
        WorkerHasWorkspace other = (WorkerHasWorkspace) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (worker == null) {
            if (other.worker != null)
                return false;
        } else if (!worker.equals(other.worker))
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
        return "WorkerHasWorkspace [id=" + id + ", worker=" + worker + ", workspace=" + workspace + "]\n";
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

    public Workspace getWorkspace() {
        return workspace;
    }

    public void setWorkspace(Workspace workspace) {
        this.workspace = workspace;
    }

}
