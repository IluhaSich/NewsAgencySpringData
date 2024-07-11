package org.example.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "journalist")
public class Journalist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer journalist_id;
    @Column(nullable = false)
    private String full_name;
    @Column(nullable = false)
    private String contact_info;
    @Column(nullable = false)
    private String specialization;

    public Integer getJournalist_id() {
        return journalist_id;
    }

    public void setJournalist_id(Integer journalist_id) {
        this.journalist_id = journalist_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
