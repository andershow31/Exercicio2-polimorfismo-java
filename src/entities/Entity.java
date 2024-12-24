package entities;

public abstract class  Entity {
	protected Double yearIncome;
	protected String name;	
	public Entity() {
	}
	
	public Entity(String name, Double yearIncome) {// n�o esquecer do construtor, mesmo abstrata precisa de construtor
		
		this.yearIncome = yearIncome;
		this.name = name;
	}

	public Double getIncome() {
		return yearIncome;
	}
	public void setIncome(Double income) {
		this.yearIncome = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract Double tax();//para que o m�todo seja de implementa��o obrigat�ria devemos colocar o abstract no nome
	// como � abstrato n�o possui "MIOLO" o miolo ser� colocado nas classes filhas
	

}
