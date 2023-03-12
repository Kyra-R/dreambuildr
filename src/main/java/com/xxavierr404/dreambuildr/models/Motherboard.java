package com.xxavierr404.dreambuildr.models;

import com.xxavierr404.dreambuildr.misc.enums.PlatformType;
import com.xxavierr404.dreambuildr.misc.enums.RAMType;
import com.xxavierr404.dreambuildr.misc.enums.SocketType;
import jakarta.persistence.*;

@Entity
public class Motherboard {

    public Motherboard () {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private RAMType ramType;
    private int ramSlotsCount;
    private PlatformType platformType;
    private SocketType socketType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public void setRamType(RAMType ramType) {
        this.ramType = ramType;
    }

    public int getRamSlotsCount() {
        return ramSlotsCount;
    }

    public void setRamSlotsCount(int ramSlotsCount) {
        this.ramSlotsCount = ramSlotsCount;
    }

    public PlatformType getPlatformType() {
        return platformType;
    }

    public void setPlatformType(PlatformType platformType) {
        this.platformType = platformType;
    }

    public SocketType getSocketType() {
        return socketType;
    }

    public void setSocketType(SocketType socketType) {
        this.socketType = socketType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
