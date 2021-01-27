package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;


import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;




@RestController

public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDAO.get(id);
    }
    /**
     * 
     * @return all info for any reservation in the system
     * 
     */
    
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations(){
    	return this.reservationDAO.findAll();
    }
    /**
     * 
     * @param ReservationID
     * @return all reservations by a specific id
     * 
     */

    @RequestMapping(path = "/reservations/{reservationID}", method = RequestMethod.GET)
    public Reservation getReservationById(@PathVariable int reservationID) {
    	return this.reservationDAO.get(reservationID);
    }
    /**
     * 
     * 
     * @param hotelID
     * @return reservations of a specific hotel
     */
    
    @RequestMapping(path="/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationByHotel(@PathVariable("id") int hotelID){
    	return this.reservationDAO.findByHotel(hotelID);
    }
    
    
    // TODO add a new reservation
    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation, @PathVariable("id") int hotelID) {
    	return reservationDAO.create(reservation, hotelID);
    }
    
    /**
     * 
     * @param @requited state to filter on
     * @param city to filter on @Optional
     * @return a list of hotels that match the provided state and optional city
     */
    
    @RequestMapping(path="hotels/filter", method = RequestMethod.GET)
    public List<Hotel> filterByStateAndCity(@RequestParam String state, @RequestParam(required = false) String city){
    	List<Hotel> filteredHotels = new ArrayList<>();
    	List<Hotel> allHotels = this.list();
    	for(Hotel hotel : allHotels) {
    		if(city != null) {
    			if(hotel.getAddress() != null && hotel.getAddress().getCity().equalsIgnoreCase(city) && hotel.getAddress().getState().equalsIgnoreCase(state)) {
    				filteredHotels.add(hotel);
    			}
    		}else if(hotel.getAddress() != null && hotel.getAddress().getState().equals(state)) {
    			filteredHotels.add(hotel);
    		}
    	}
    	
    	
    	
    	return filteredHotels;
    }
    
    
    
    
    

}
