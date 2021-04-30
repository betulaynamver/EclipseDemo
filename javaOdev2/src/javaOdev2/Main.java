package javaOdev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setid(1);
		instructor.setfirstName("Engin");
		instructor.setlastName("Demiroð");
		instructor.seteMail("engindemirog@gmail.com");
		instructor.setinstructorInformation("MCT,PMP,ITIL");
		instructor.getpassword();
		
		Student student1 = new Student();
		student1.setid(100);
		student1.setfirstName("Betülay");
		student1.setlastName("Namver");
		student1.seteMail("betulay.namver@gmail.com");
		student1.setcoursesAttended("Yazýlým Geliþtiric Yetiþtime Kampý (C# + ANGULAR) + Yazýlým Geliþtiric Yetiþtime Kampý (JAVA + REACT) + Programlamaya Giriþ Ýçin Temel Kurs");
		student1.getpassword();
		
		Student student2 = new Student();
		student2.setid(101);
		student2.setfirstName("Can");
		student2.setlastName("Yüksel");
		student2.seteMail("can.yuksel@gmail.com");
		student2.setcoursesAttended("Yazýlým Geliþtiric Yetiþtime Kampý (C# + ANGULAR)");
		student2.getpassword();
		
		UserManager userManager = new UserManager();
		userManager.add(student2);
		userManager.editProfile();
		StudentManager studentManager = new StudentManager();
		studentManager.logIn();
		studentManager.add(student1);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logOut();
		

	}

}
