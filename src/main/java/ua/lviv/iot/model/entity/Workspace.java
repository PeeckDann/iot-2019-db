package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "workspace")
public class Workspace {

    @PrimaryKey
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
