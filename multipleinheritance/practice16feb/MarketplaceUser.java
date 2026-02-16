package com.practice16feb;

public class MarketplaceUser implements Seller, Buyer {

	@Override
	public void buyProduct() {
		System.out.println("Buying product..!");

	}

	@Override
	public void sellProduct() {
		System.out.println("Seeling poduct..!");

	}

	public static void main(String[] args) {
		MarketplaceUser m = new MarketplaceUser();
		m.buyProduct();
		m.sellProduct();
	}

}
