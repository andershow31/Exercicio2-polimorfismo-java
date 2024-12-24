package entities;

public class FisicalPerson extends Entity {
	private Double healthExpends;
	
	public FisicalPerson() {}// construtor vazio9
	

	public FisicalPerson(String name, Double yearIncome, Double healthExpends) {
		super(name, yearIncome);
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
		Double temporaryTax;
		if(yearIncome< 20000) {
			return yearIncome*0.15;
		}else {
			temporaryTax = (yearIncome-20000)*0.25 + 3000;//25 por cento é a partir de 20000 e 3k é o valor nos 20mil
			return temporaryTax - healthExpends/2;
			
		}
		
	}	
	
	
}
