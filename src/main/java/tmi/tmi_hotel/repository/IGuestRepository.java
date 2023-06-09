package tmi.tmi_hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tmi.tmi_hotel.entity.Guest;

import java.util.List;

@Repository
public interface IGuestRepository extends JpaRepository<Guest, Integer> {

    Guest getGuestByEmail(String email);


    List<Guest> getAllByLastName(String lastName);

    Guest getGuestByIdGuest(Long id);

}
