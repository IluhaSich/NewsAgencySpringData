package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "journalist")
public class Journalist {
    private String fullName;
    private String contactInfo;
    private String specialization;

    public Journalist(String fullName, String contactInfo, String specialization) {
        this.fullName = fullName;
        this.contactInfo = contactInfo;
        this.specialization = specialization;
    }

    protected Journalist() {
    }

    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "contact_info")
    public String getContactInfo() {
        return contactInfo;
    }

    @Column(name = "specialization")
    public String getSpecialization() {
        return specialization;
    }
}
