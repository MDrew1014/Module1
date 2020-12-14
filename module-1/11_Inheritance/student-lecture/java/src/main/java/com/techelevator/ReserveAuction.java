package com.techelevator;



//this class models an auction in which bidder has to pay a minimum amount to have their bid
//accepted. This amount is set in advance and is called the reserve price. if the 
//item does not meet the minimum amount the item remains unsold



//   		 this class inherits this
public class ReserveAuction extends Auction{
	
	private int reservePrice;
	
	public ReserveAuction(String itemForSale, int reservePrice) {
		super(itemForSale);
		
		this.reservePrice = reservePrice;
	}
	
	//this class overrides the default bid method 
	//it checks the provided bid against the bid and only accepts
	//the bid if the reserve price is met
	// replacing parent method
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		if(offeredBid.getBidAmount() >= this.reservePrice) {
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		return isCurrentWinningBid;
	}
	
	
	
	
}
