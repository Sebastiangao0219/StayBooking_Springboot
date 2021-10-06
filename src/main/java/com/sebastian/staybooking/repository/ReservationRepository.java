package com.sebastian.staybooking.repository;

import com.sebastian.staybooking.model.Reservation;
import com.sebastian.staybooking.model.Stay;
import com.sebastian.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByGuest(User guest);
    List<Reservation> findByStay(Stay stay);
    List<Reservation> findByStayAndCheckoutDateAfter(Stay stay, LocalDate date);
}
