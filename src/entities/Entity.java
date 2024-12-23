package entities;

public abstract class  Entity {
	private Double yearIncome;
	private String name;	
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
