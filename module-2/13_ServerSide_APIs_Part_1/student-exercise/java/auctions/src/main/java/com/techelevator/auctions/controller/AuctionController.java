package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    /**
     * 
     * @return a list of auctions
     */
	@RequestMapping(method = RequestMethod.GET)
	public List<Auction> list(@RequestParam(name = "title_like", defaultValue = "") String title,
			@RequestParam(name = "currentBid_lte", defaultValue = "0") double price) {
		if (!title.isEmpty() && price > 0) {
			return dao.searchByTitleAndPrice(title, price);
		}if (title.isEmpty() && price > 0) {
				return dao.searchByPrice(price);
			}if (!title.isEmpty() && price == 0) {
					return dao.searchByTitle(title);
				}return dao.list();
			}
					
				
			
		
		
	
    /**
     * 
     * @param id of the auction
     * @return auction with a specific id
     */
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
    	return dao.get(id);
    }
    /**
     * 
     * @param auction
     * @return a new auction added to the list
     */
    @RequestMapping(method = RequestMethod.POST)
    public Auction add(@RequestBody Auction auction) {
    	return dao.create(auction);
    }
    
}
