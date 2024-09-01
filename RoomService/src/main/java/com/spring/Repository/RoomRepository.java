package com.spring.Repository;

import com.spring.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for the room*/
public interface RoomRepository extends JpaRepository<Room, Long> {
}
