package com.spring.Controller;

import com.spring.Dto.RoomDto;
import com.spring.Dto.RoomRegisterDto;
import com.spring.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    public ResponseEntity<List<RoomDto>> getAllRooms(){
        return ResponseEntity.ok(roomService.getAllRooms());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RoomDto> getRoomById(@PathVariable("id") Long id){
        return ResponseEntity.ok(roomService.getRoomById(id));
    }

    @PostMapping
    public ResponseEntity<RoomDto> createRoom(@RequestBody RoomRegisterDto roomDto){
        return ResponseEntity.ok().body(roomService.registerRoom(roomDto));
    }
}
