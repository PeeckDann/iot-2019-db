package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "hardware")
@Table(name = "hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "processor", length = 45)
    private String processor;

    @Column(name = "motherboard", length = 45)
    private String motherboard;

    @Column(name = "RAM", length = 45)
    private String RAM;

    @Column(name = "hard_drive", length = 45)
    private String hardDrive;

    @Column(name = "video_card", length = 45)
    private String videoCard;

    @Column(name = "power_supply", length = 45)
    private String powerSupply;

    public Hardware() {
    }

    public Hardware(String processor, String motherboard, String rAM, String hardDrive, String videoCard,
            String powerSupply) {
        this(-1, processor, motherboard, rAM, hardDrive, videoCard, powerSupply);
    }

    public Hardware(Integer id, String processor, String motherboard, String rAM, String hardDrive, String videoCard,
            String powerSupply) {
        this.id = id;
        this.processor = processor;
        this.motherboard = motherboard;
        RAM = rAM;
        this.hardDrive = hardDrive;
        this.videoCard = videoCard;
        this.powerSupply = powerSupply;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((RAM == null) ? 0 : RAM.hashCode());
        result = prime * result + ((hardDrive == null) ? 0 : hardDrive.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((motherboard == null) ? 0 : motherboard.hashCode());
        result = prime * result + ((powerSupply == null) ? 0 : powerSupply.hashCode());
        result = prime * result + ((processor == null) ? 0 : processor.hashCode());
        result = prime * result + ((videoCard == null) ? 0 : videoCard.hashCode());
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
        Hardware other = (Hardware) obj;
        if (RAM == null) {
            if (other.RAM != null)
                return false;
        } else if (!RAM.equals(other.RAM))
            return false;
        if (hardDrive == null) {
            if (other.hardDrive != null)
                return false;
        } else if (!hardDrive.equals(other.hardDrive))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (motherboard == null) {
            if (other.motherboard != null)
                return false;
        } else if (!motherboard.equals(other.motherboard))
            return false;
        if (powerSupply == null) {
            if (other.powerSupply != null)
                return false;
        } else if (!powerSupply.equals(other.powerSupply))
            return false;
        if (processor == null) {
            if (other.processor != null)
                return false;
        } else if (!processor.equals(other.processor))
            return false;
        if (videoCard == null) {
            if (other.videoCard != null)
                return false;
        } else if (!videoCard.equals(other.videoCard))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Hardware [id=" + id + ", processor=" + processor + ", motherboard=" + motherboard + ", RAM=" + RAM
                + ", hardDrive=" + hardDrive + ", videoCard=" + videoCard + ", powerSupply=" + powerSupply + "]\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String rAM) {
        RAM = rAM;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }
}