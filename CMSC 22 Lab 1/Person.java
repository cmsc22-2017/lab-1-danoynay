
class Person {
	String name;
	int age;
	String gender;
	Address address;
	
	Person(String name, int age, String gender, Address address){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
}

class Address{
	String city;
	String state;
	
	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
}

class ExamplesPerson {
	ExamplesPerson(){}
		Address atim = new Address("Warwick", "RI");  
		Person tim = new Person("Tim", 20, "M", atim);
		
		Address apat = new Address("Boston", "MA");
		Person pat = new Person("Pat", 19, "F", apat);
		
		Address akim = new Address("Boston", "MA");
		Person kim = new Person("Kim", 17, "F", akim);
		
		Address adan = new Address("Nashua", "NH");
		Person dan = new Person("Dan", 22, "M", adan);
		
		Address anig = new Address("Pasadena", "CA");
		Person nig = new Person("Nigell", 53, "F", anig);
		
		Address acan = new Address("Los Angeles", "CA");
		Person can = new Person("Candace", 10, "F", acan);
}