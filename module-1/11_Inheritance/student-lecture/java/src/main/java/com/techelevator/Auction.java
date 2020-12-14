package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Auction {
//instance variables
	private Bid defaultBid = new Bid("Placeholder", 0);
	private String itemForSale;
	private Bid currentHighBid;
	private List<Bid> allBids;
	private boolean closed;
///constructor
	public Auction(String itemForSale) {
		this.itemForSale = itemForSale;
		this.currentHighBid = new Bid("", 0);
		allBids = new ArrayList<>();
		this.closed = false;
	}
///methods parent provided
	public boolean placeBid(Bid offeredBid) {
		if(this.isClosed()) {
			return false;
		}
		allBids.add(offeredBid);
		boolean isCurrentWinningBid = false;
		if (offeredBid.getBidAmount() > currentHighBid.getBidAmount()) {
			currentHighBid = offeredBid;
			isCurrentWinningBid = true;
		}
		return isCurrentWinningBid;
	}
	
	public boolean finishAuction() {
		if(this.isClosed()) {
			return false;
		}else{this.closed = true;
		return true;
		}
	}

	public Bid getHighBid() {
		return currentHighBid;
	}

	public List<Bid> getAllBids() {
		return new ArrayList<>(allBids);
	}

	public String getItemForSale() {
		return itemForSale;
	}
	public boolean isClosed() {
		return this.isClosed();
	}
	public Bid getWinningBid() {
		if(this.isClosed()) {
		return	this.getHighBid();
		}else {
			
			//you should think hard before doing this
			return defaultBid;
		}
	}
	
	
	
	
	
}
