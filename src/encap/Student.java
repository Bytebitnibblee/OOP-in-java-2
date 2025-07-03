package encap;

public class Student {
	private int roll;
	private String name;
	private String address;
	
	public Student(int roll, String name, String address) {
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	
	public int getRoll() {
		System.out.println("your roll number is:");
		return roll;
	}
	
	public void setRoll(int roll) {
		if(roll>1000 && roll<2000){
			this. roll=roll;		
	}
		else {
			this.roll=0;
			System.out.println("Invalid Roll");
		}
}
	public String getName() {
		return name ;	
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}
