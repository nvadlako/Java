package OOPS;

public class MainGeneral {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDealerInterface lpVehicle = new Car("Toyota");
		System.out.println("Type is: " + lpVehicle.getVehicleType());
		System.out.println("Model is: " + lpVehicle.getVehicleModel());
		
		lpVehicle = new Bike("Yamaha");
		System.out.println("Type is: " + lpVehicle.getVehicleType());
		System.out.println("Model Name: " + lpVehicle.getVehicleModel());
	}

}
