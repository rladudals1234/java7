package j0129_01;

public class Person {
	long id;
	String name = "유관순";
	
	Person(){}
	
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	Person(Person p){
		this.id = p.id;
		this.name = p.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name.equals(((Person)obj).name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		//return ""+id+","+name;
		return String.format("%d,%s",id,name);
	}
}
