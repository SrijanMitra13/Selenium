package Interface;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic ct = new AustralianTraffic();
		ct.greenGo();
		ct.redStop();
		ct.flashYellow();
		walkOnSymbol();
		
//		AustralianTraffic at = new AustralianTraffic();
//		at.walkOnSymbol();
		
		ContinentalTraffic cntr = new AustralianTraffic();
		cntr.TrainSymbol();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation");		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashingYellow implementation");		
	}
	
	public static void walkOnSymbol() {
		System.out.println("walking");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("TrainSymbol implementation");
		
	}

}
