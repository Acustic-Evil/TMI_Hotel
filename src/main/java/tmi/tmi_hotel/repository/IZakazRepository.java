package tmi.tmi_hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tmi.tmi_hotel.entity.Employee;
import tmi.tmi_hotel.entity.Guest;
import tmi.tmi_hotel.entity.Zakaz;

import java.util.List;

@Repository
public interface IZakazRepository extends JpaRepository<Zakaz, Integer> {
}
