package OOPS;

public abstract class Vehicle implements IDealerInterface {

	protected String ModelName;
	protected String VehicleType;
	

	@Override
	public String getVehicleModel() {
		// TODO Auto-generated method stub
		return ModelName;
	}

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return VehicleType;
	}
	
	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public abstract void setVehicleType(String vehicalType);

}
