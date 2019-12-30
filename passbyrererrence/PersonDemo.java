
public class PersonDemo {

	public static void main(String[] args) {

		Person p1 = new Person("Russel", 30);
		
		Person p2;
		
		p2 = p1;
		
		p2.changeDetails("Mary", 20);
		
		System.out.println(p1);
		
	}

}

class Person{
	String name;
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;		
	}
	
	public String toString(){
		return "name: " + name + ", age: " + age;
	}
	
	public void changeDetails(String name, int age){
		this.name = name;
		this.age = age;			
	}	
	
}
