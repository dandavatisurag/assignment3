package problem3;

public class TestCard {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCard tc=new TravelCard();
		System.out.println("The reward points you earned are "+tc.getRewardPoints(100));
		System.out.println("Congratulations,you have successfully recharged with "+tc.rechrgeCard(5000));
		System.out.println(tc.swipeCard(20));
		System.out.println(tc.travelSwipe(10));
		
		tc.setCardNo(1000000000);
		tc.setSwipeLimit(50000);
	
		System.out.println("Your Card Number is "+tc.getCardNo());
		System.out.println("Your Daily Swipe limit is "+tc.getSwipeLimit());
	}

}
	

