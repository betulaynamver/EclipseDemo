package javaOdev2;

public class UserManager {
	
	public void logIn() {
		System.out.println("myTeachable hesabýyla giriþ yap.");
	}
	
    public void logOut() {
		System.out.println("Çýkýþ yapýldý.");
	}

	public void add(User user) {
		System.out.println(user.getfirstName() + " " + user.getlastName() + " isimli kullanýcý eklendi");
	}
	
	public void editProfile() {
		System.out.println("Profil güncellendi.");
	}
	
	
	
	

}
