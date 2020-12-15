package com.techelevator;

public class SecondPriceAuction extends ReserveAuction{
	
	public SecondPriceAuction(String itemForSale, int reservePrice) {
		super(itemForSale, reservePrice);
	}
	@Override
	public Bid getWinningBid() {
		if(!this.isClosed()) {
			return super.getWinningBid();
		}
		
		Bid secondPrice = null;
		for(Bid bid : this.getAllBids()) {
			if(bid.getBidAmount()< this.getHighBid().getBidAmount()) {
				if(secondPrice == null) {
					secondPrice = bid;
				}else if(bid.getBidAmount() > secondPrice.getBidAmount()) {
					secondPrice = bid;
				}
			}
		}
		if(secondPrice == null) {
			return this.getHighBid();
		}else {
			int newPrice = secondPrice.getBidAmount() + 1;
			String winningBidder= this.getHighBid().getBidder();
		}
		return secondPrice;
	}
	
	
}
