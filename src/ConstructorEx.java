//class object{
//object(){
// ----------
// -----------
//---------- 
//}
//}
//Orphan class 
class Dog{  //extends object
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	
	//zero parameterized constructor
	public Dog() {
		super();
		System.out.println("inside the zero parameterized constructor ");
		this.name="ramu";
		this.color="Brown";
		this.cost=7000;
		this.age=3;
		this.breed="pomerain";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("----------------------");
		
	}
		//one parameterized constructor
	//chintul
		public Dog(String name) {
			this();
			System.out.println("inside the one parameterized constructor ");
			this.name=name;
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.cost);
			System.out.println(this.age);
			System.out.println(this.breed);
			System.out.println("----------------------");
		}
		
		//two parameterized constructor
		//tomy
		//blue
		public Dog(String name,String color) {
			this("chintu");
			System.out.println("inside the two parameterized constructor ");
			this.name=name;
			this.color=color;
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.cost);
			System.out.println(this.age);
			System.out.println(this.breed);
			System.out.println("----------------------");
		
	}
		//three parameterized constructor
		//dobby
		//orange
		//9000
	
		public Dog(String name,String color,int cost) {
			this("tomy","blue");
			System.out.println("inside the three parameterized constructor ");
			this.name=name;
			this.color=color;
			this.cost=cost;
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.cost);
			System.out.println(this.age);
			System.out.println(this.breed);
			System.out.println("----------------------");
		}
		//four parameterized constructor
		//jimmy,purple,7500,7
				public Dog(String name,String color,int cost,int age) {
					this("dobby","orange",9000);
					System.out.println("inside the four parameterized constructor ");
					this.name=name;
					this.color=color;
					this.cost=cost;
					this.age=age;
					System.out.println(this.name);
					System.out.println(this.color);
					System.out.println(this.cost);
					System.out.println(this.age);
					System.out.println(this.breed);
					System.out.println("----------------------");
				}
				//five parameterized constructor
				//"Rockey","white",8000,8,"GR"
				public Dog(String name,String color,int cost,int age,String breed) {
					
					this("jimmy","purple",7500,7);
					System.out.println("inside the five parameterized constructor ");
					this.name=name;
					this.color=color;
					this.cost=cost;
					this.age=age;
					this.breed=breed;
					System.out.println(this.name);
					System.out.println(this.color);
					System.out.println(this.cost);
					System.out.println(this.age);
					System.out.println(this.breed);
					System.out.println("----------------------");
				}
}
public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1= new Dog("Rockey","white",8000,8,"GR");
	}

}
