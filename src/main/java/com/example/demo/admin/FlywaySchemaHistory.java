package com.example.demo.admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class FlywaySchemaHistory {

    @Id
    private Integer installedRank;

    private String version;

    private String description;

    private LocalDateTime installedOn;

    public FlywaySchemaHistory() {
    }

    public Integer getInstalledRank() {
        return installedRank;
    }

    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getInstalledOn() {
        return installedOn;
    }

    public void setInstalledOn(LocalDateTime installedOn) {
        this.installedOn = installedOn;
    }

}
