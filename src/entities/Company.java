package entities;

public class Company extends Entity {
	public int employenumber;
	
	public Company() {
	}
	public Company(String name, Double yearIncome, int employenumber) {
		super(name, yearIncome);
		this.employenumber = employenumber;
	}
	

	public int getEmployenumber() {
		return employenumber;
	}
	public void setEmployenumber(int employenumber) {
		this.employenumber = employenumber;
	}
	@Override
	public Double tax() {
		if(employenumber > 10) {
			return yearIncome*0.14;
		}else {
			return yearIncome*0.16;
		}
	}

}

