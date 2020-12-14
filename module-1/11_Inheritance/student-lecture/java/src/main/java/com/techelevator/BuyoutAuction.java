package com.techelevator;

public class BuyoutAuction extends Auction {
	
	private int buyoutPrice;
	
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super(itemForSale);
		this.buyoutPrice = buyoutPrice;
	}

	public int getBuyoutPrice() {
		return buyoutPrice;
	}
	
	@Override
	public boolean placeBid(Bid offeredBid) {
		
		return false;
	}
}
