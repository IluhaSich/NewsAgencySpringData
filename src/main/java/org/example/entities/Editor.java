package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "editor")
public class Editor {
    private String fullName;
    private String contactInfo;

    public Editor(String fullName, String contactInfo) {
        this.fullName = fullName;
        this.contactInfo = contactInfo;
    }

    private Editor() {
    }

    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    @Column(name = "contact_info")
    public String getContactInfo() {
        return contactInfo;
    }
}
