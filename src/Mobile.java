//Composition
class OS{
	String version_name;
	double version_number;
	public OS(String version_name, double version_number) {
		super();
		this.version_name = version_name;
		this.version_number = version_number;
	}
	public String getVersion_name() {
		return version_name;
	}
	public double getVersion_number() {
		return version_number;
	}
	}
//aggregation
class Charger{
	String company;
	double voltage;
	public Charger(String company, double voltage) {
		super();
		this.company = company;
		this.voltage = voltage;
	}
	public String getCompany() {
		return company;
	}
	public double getVoltage() {
		return voltage;
	}
	
}
 class Mobile1 {
	OS os=new OS("Windows",12.7);
	void hasCharger(Charger c) {
		System.out.println(c.getCompany()); 
		System.out.println(c.getVoltage());
		}

}
public class Mobile {
	public static void main(String [] args) {
		Charger c= new Charger("HP",5.5);
		Mobile1 m=new Mobile1();
		
		System.out.println(m.os.getVersion_number()); 
		System.out.println(m.os.getVersion_name());
		m.hasCharger(c);
		
		m=null;
		
		//System.out.println(m.os.getVersion_number()); 
		//System.out.println(m.os.getVersion_name());
		
		System.out.println(c.getCompany()); 
		System.out.println(c.getVoltage());
}
}