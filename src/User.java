import java.util.Scanner;

public abstract class User {
	private String username;
	private String password;
	private String name;
	private String email;
	private static Scanner input = new Scanner(System.in);
	
	
	public User() {
		
	}
	
	public User(User anotherUser) {
		setName(anotherUser.getName());
		setUsername(anotherUser.getUsername());
		setPassword(anotherUser.getPassword());
		setEmail(anotherUser.getEmail());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void read(String username) {
		setUsername(username);
		
		System.out.print("Enter name: ");
		setName(input.nextLine());
		
		System.out.print("Enter password: ");
		setPassword(input.nextLine());
		
		System.out.print("Enter email: ");
		setEmail(input.nextLine());
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nName: ").append(name).append("\nUsername: ").append(username).append("\nEmail: ").append(email);
		
		sb.trimToSize();
		return sb.toString();
	}
	
	
}
