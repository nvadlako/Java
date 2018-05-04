package OOPS;

public class Car extends Vehicle {

	private boolean hasABS;
	private boolean allwheelDrive;
	
	Car(String lpModelName) {	
		
		ModelName = lpModelName;
		setVehicleType("4 wheeler");
	}
	
	public boolean IsABS() {
		return hasABS;
	}

	public void setHasABS(boolean hasABS) {
		this.hasABS = hasABS;
	}

	public boolean isAllwheelDrive() {
		return allwheelDrive;
	}

	public void setAllwheelDrive(boolean allwheelDrive) {
		this.allwheelDrive = allwheelDrive;
	}

	@Override
	public void setVehicleType(String vehicleType) {
		// TODO Auto-generated method stub
		VehicleType= vehicleType; 
		
	}

}
