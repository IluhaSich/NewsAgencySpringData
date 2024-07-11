package org.example.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "editor")
public class Editor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer editor_id ;
    @Column(nullable = false)
    private String full_name;
    @Column(nullable = false)
    private String contact_info;

    public Integer getEditor_id() {
        return editor_id;
    }

    public void setEditor_id(Integer editor_id) {
        this.editor_id = editor_id;
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
}
