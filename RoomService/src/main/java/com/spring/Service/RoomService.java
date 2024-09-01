package com.spring.Service;

import com.spring.Dto.RoomDto;
import com.spring.Dto.RoomRegisterDto;
import com.spring.Entity.Room;
import com.spring.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    /**
     * Return all the rooms that are registered
     * @return all the rooms that are registered*/
    public List<RoomDto> getAllRooms() {
        return roomRepository.findAll()
                .stream()
                .map(RoomDto::new).toList();
    }

    /**
     * Return a room by the id
     * @param id id of the room
     * @return the room by the id*/
    public RoomDto getRoomById(Long id) {
        return new RoomDto(roomRepository.findById(id).get());
    }

    /**
     * Register a new room
     * @param roomRegisterDto dto with needed information to register a room*/
    public RoomDto registerRoom(RoomRegisterDto roomRegisterDto) {
        Room room = new Room(roomRegisterDto.name(), roomRegisterDto.capacity());

        return new RoomDto(roomRepository.save(room));
    }
}
