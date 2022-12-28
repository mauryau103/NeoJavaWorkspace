public class Manager extends Employee{
    private String branch;
    public double fa;

    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public String toString(){
        return super.toString()+" branch :"+branch;
    }
    
    public double calGross() {
    	
    	System.out.println("in Manager");
    	fa=0.15*basicSalary;
    	grossSalary=super.calGross()+fa;
    	return grossSalary;
    }
}