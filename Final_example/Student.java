package final1;

class Student{
	//final variable cannot be modified  
	final int id;
	//once id initialized it cannot be changed
	Student(int id){
		this.id =id;
	}	
		
	
	public void f(final int marks) {
		
		//marks cannot be modified inside the function
		System.out.println("Id = "+id);
		System.out.println("Marks = "+marks);
		
		//IF you modify final variable complier will flash error
	int	id =2345;
		//marks = 1000;
	
	}
	

 

 
	public static void main(String[] args) {
 
		int marks = 500;
		int id = 12341;
		Student s = new Student(id);
		s.f(marks);
	}
}
