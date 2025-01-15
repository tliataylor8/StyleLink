package com.StyleLink.StyleLink.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StyleLink.StyleLink.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}