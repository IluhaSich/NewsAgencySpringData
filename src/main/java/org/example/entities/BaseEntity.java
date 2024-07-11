package org.example.entities;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    private int id;

    @Id
    @Column(insertable = false, name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
}
