package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        ///this line is an example of polymorphism
        //the variable is type Auction - the type used was ReserveAuction
        Auction reserveAuction = new ReserveAuction("Shelby Mustang", 20000);
        Bid lowBall = new Bid("Andrew", 5);
        System.out.println(lowBall);
        
        
    }
}
