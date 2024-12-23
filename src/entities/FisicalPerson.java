package entities;

public class FisicalPerson extends Entity {
	private Double healthExpends;
	
	public FisicalPerson() {}// construtor vazio
	
	

	public FisicalPerson(Double healthExpends) {
		super();
		this.healthExpends = healthExpends;
	}



	public Double getHealthExpends() {
		return healthExpends;
	}


	public void setHealthExpends(Double healthExpends) {
		this.healthExpends = healthExpends;
	}


	@Override
	public Double tax() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	
}
