package tmi.tmi_hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tmi.tmi_hotel.entity.Guest;

@Repository
public interface IGuestRepository extends JpaRepository<Guest, Integer> {
}
