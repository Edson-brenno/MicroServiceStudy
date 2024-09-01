package com.spring.Entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * Entity fot the table tb_room*/
@Entity(name = "tb_room")
public class Room implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private Long capacity;

    public Room(){}

    /**
     * Constructor method
     * @param name name of the room
     * @param capacity tells how many students the room accept*/
    public Room(String name, Long capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(name, room.name) && Objects.equals(capacity, room.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}

