package javaOdev2;

public class UserManager {
	
	public void logIn() {
		System.out.println("myTeachable hesab�yla giri� yap.");
	}
	
    public void logOut() {
		System.out.println("��k�� yap�ld�.");
	}

	public void add(User user) {
		System.out.println(user.getfirstName() + " " + user.getlastName() + " isimli kullan�c� eklendi");
	}
	
	public void editProfile() {
		System.out.println("Profil g�ncellendi.");
	}
	
	
	
	

}
