package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;

@Table(name = "hardware")
public class Hardware {

    @PrimaryKey
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