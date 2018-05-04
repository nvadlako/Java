package OOPS;

public class Bike extends Vehicle {

	
	Bike(String lpModelName) {	
		setVehicleType("2 Wheeler");
		
		ModelName = lpModelName;
	}

	@Override
	public void setVehicleType(String vehicleType) {
		// TODO Auto-generated method stub
		VehicleType=vehicleType;
	} 

}
