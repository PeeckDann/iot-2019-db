package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "hardware_id")
    private Hardware hardware;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    public Laptop() {
    }

    public Laptop(String name, Hardware hardware, Worker worker) {
        this(-1, name, hardware, worker);
    }

    public Laptop(Integer id, String name, Hardware hardware, Worker worker) {
        this.id = id;
        this.name = name;
        this.hardware = hardware;
        this.worker = worker;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hardware == null) ? 0 : hardware.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Laptop other = (Laptop) obj;
        if (hardware == null) {
            if (other.hardware != null)
                return false;
        } else if (!hardware.equals(other.hardware))
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
        if (worker == null) {
            if (other.worker != null)
                return false;
        } else if (!worker.equals(other.worker))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [id=" + id + ", name=" + name + ", hardware=" + hardware + ", worker=" + worker + "]/n";
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

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

}
