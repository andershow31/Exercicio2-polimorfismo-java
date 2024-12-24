package entities;

public abstract class  Entity {
	protected Double yearIncome;
	protected String name;	
	public Entity() {
	}
	
	public Entity(String name, Double yearIncome) {// não esquecer do construtor, mesmo abstrata precisa de construtor
		
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
	public abstract Double tax();//para que o método seja de implementação obrigatória devemos colocar o abstract no nome
	// como é abstrato não possui "MIOLO" o miolo será colocado nas classes filhas
	

}
