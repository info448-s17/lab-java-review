package edu.info498.review;

/**
 * A class representing a gift box containing an object
 */
public class GiftBox {

	private TeddyBear gift; //what is inside the box

	//makes a new gift box containing the gift
	public GiftBox(TeddyBear gift){
		this.gift = gift;
	}

	//unwraps the gift and returns what's inside
	public TeddyBear openGift() {
		return this.gift;
	}
}