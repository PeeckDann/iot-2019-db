package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "worker_has_workspace")
public class WorkerHasWorkspace {

    @PrimaryKey
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
