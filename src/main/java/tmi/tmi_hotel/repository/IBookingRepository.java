package tmi.tmi_hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tmi.tmi_hotel.entity.Booking;

import java.util.List;

@Repository
public interface IBookingRepository extends JpaRepository<Booking, Integer> {

}
