package com.spring.Dto;

import com.spring.Entity.Room;
import com.spring.Repository.RoomRepository;

/**
 * Dto to return information about the room
 * @param id id of the room
 * @param name name of the room
 * @param capacity tells how many students can be fit on the room*/
public record RoomDto (Long id, String name, Long capacity) {
    /**
     * Constructor method
     * @param room room entity*/
    public RoomDto(Room room){
        this(room.getId(),room.getName(),room.getCapacity());
    }
}
