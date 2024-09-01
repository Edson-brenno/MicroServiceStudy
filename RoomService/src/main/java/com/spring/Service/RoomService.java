package com.spring.Service;

import com.spring.Dto.RoomDto;
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
}
