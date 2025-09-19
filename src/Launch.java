class Brain{
	double weight;
	float iq;
	public Brain(double weight, float iq) {
		super();
		this.weight = weight;
		this.iq = iq;
	}
	public double getWeight() {
		return weight;
	}
	public float getIq() {
		return iq;
	}
}
class Heart{
	double size;
	int valves;
	public Heart(double size, int valves) {
		super();
		this.size = size;
		this.valves = valves;
	}
	public double getSize() {
		return size;
	}
	public int getValves() {
		return valves;
	}
}
class Human{
	Brain bn=new Brain(30.1,72.2f);
	Heart h=new Heart(42,4);
}

class Book{
	String book_name;
	int cost;
	public Book(String book_name, int cost) {
		super();
		this.book_name = book_name;
		this.cost = cost;
	}
	public String getBook_name() {
		return book_name;
	}
	public int getCost() {
		return cost;
	}
	
}

class Mobile2{
	String company;
	String mobile_name;
	public Mobile2(String company, String mobile_name) {
		super();
		this.company = company;
		this.mobile_name = mobile_name;
	}
	public String getCompany() {
		return company;
	}
	public String getMobile_name() {
		return mobile_name;
	}
	
}
class Student extends Human{
	void hasBook(Book bk) {
		System.out.println(bk.getBook_name()); 
		System.out.println(bk.getCost());
		}
	
	void hasMobile2(Mobile2 m){
		System.out.println(m.getCompany()); 
		System.out.println(m.getMobile_name());
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Book bk=new Book("I TOO HAD A LOVE STORY",160);
		Mobile2 m= new Mobile2("Apple","Iphone15");
		
		System.out.println(s.bn.getWeight());
		System.out.println(s.bn.getIq());
		System.out.println("----------------------------");
		
		System.out.println(s.h.getSize());
		System.out.println(s.h.getValves());
		System.out.println("----------------------------");
		s.hasBook(bk);
		System.out.println("----------------------------");
		s.hasMobile2(m);
	}

}
