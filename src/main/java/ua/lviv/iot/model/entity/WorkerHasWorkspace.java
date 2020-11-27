package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "worker_has_workspace")
@Table(name = "worker_has_workspace")
public class WorkerHasWorkspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "worker_id")
    private Integer workerId;

    @Column(name = "workspace_id")
    private Integer workspaceId;

    public WorkerHasWorkspace() {
    }

    public WorkerHasWorkspace(Integer workerId, Integer workspaceId) {
        this(-1, workerId, workspaceId);
    }

    public WorkerHasWorkspace(Integer id, Integer workerId, Integer workspaceId) {
        this.id = id;
        this.workerId = workerId;
        this.workspaceId = workspaceId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((workerId == null) ? 0 : workerId.hashCode());
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
        WorkerHasWorkspace other = (WorkerHasWorkspace) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (workerId == null) {
            if (other.workerId != null)
                return false;
        } else if (!workerId.equals(other.workerId))
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
        return "WorkerHasWorkspace [id=" + id + ", workerId=" + workerId + ", workspaceId=" + workspaceId + "]\n";
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

    public Integer getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
    }

}
