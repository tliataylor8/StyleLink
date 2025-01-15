package com.StyleLink.StyleLink.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StyleLink.StyleLink.Entity.Booking;
import com.StyleLink.StyleLink.Respository.PropertyRepository;

@Service
public class BookingService {

	@Autowired
	private Booking Repository bookingRepository;
	
	
	@Autowired
	private PropertyRepository propertyRepository;

	/**
	 * params propertyID
	 * params StartDate
	 * params endDate
	 * return param booking object
	 */
	public Booking createBooking(Long propertyId, LocalDate starDate, LocalDate endDate) {
		
		Property property = propertyRepository.findById(propertyId)
				.orElseThrow(()->new RuntimeException("Property Not Found"));
		
		Booking booking = new Booking();
		booking.setProperty(property);
		booking.setStartDate(starDate);
		booking.setEndDate(endDate);
		//save the booking 
		
		return bookingRepository.save(booking);
		
	}
	
	//get all bookings.
	
	public List<Booking> getAllBookings(){
		return bookingRepository.findAll();
	}
	
	//get booking by PropertyID
	public List<Booking> getBookingByProperty(Long propertyId){
		return bookingRepository.findByPropertyId(propertyId);
	}
	
	public void deleteBooking(Long id) {
		bookingRepository.deleteById(id);
	}
}
