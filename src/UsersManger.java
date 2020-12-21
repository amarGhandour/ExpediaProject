import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UsersManger {

	private List<User> users;
	private Map<String, User> usersUsernameObjectMap;
	private User currentUser;
	private static Scanner input = new Scanner(System.in);
	private static UsersManger usersManger;

	private UsersManger() {
		users = new ArrayList<>();
		usersUsernameObjectMap = new TreeMap<>();
	}

	public static UsersManger getUsersMangerInstance() {
		if (usersManger == null)
			usersManger = new UsersManger();
		return usersManger;
	}

	private void freeLoadedData() {
		getUsers().clear();
		getUsersUsernameObjectMap().clear();
	}

	public List<User> getUsers() {
		return users;
	}

	public Map<String, User> getUsersUsernameObjectMap() {
		return usersUsernameObjectMap;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currnetUser) {
		this.currentUser = currnetUser;
	}

	public void accessSystem() {
		String[] menu = { "Login", "SignUp"};

		int choice = HelperMethod.showReadMenu(menu);

		if (choice == 1)
			doLogin();
		else if (choice == 2)
			doSignup();

	}

	private void doSignup() {
		String username = "";
		while (true) {
			System.out.print("Enter Username: ");
			username = input.nextLine();

			if (!usersUsernameObjectMap.containsKey(username))
				break;

			System.out.println("Error::Username already exist..Try another one.");

		}
		currentUser = new Consumer();
		currentUser.read(username);
		getUsersUsernameObjectMap().put(currentUser.getUsername(), currentUser);

	}

	private void doLogin() {

		while (true) {

			System.out.print("Enter username: ");
			String username = input.nextLine();

			System.out.print("Enter password: ");
			String password = input.nextLine();

			if (!usersUsernameObjectMap.containsKey(username)) {
				System.out.println("Error::Invalid username or password..Try again.");
				continue;
			}

			User userExist = usersUsernameObjectMap.get(username);

			if (!userExist.getPassword().equals(password)) {
				System.out.println("Error::Invalid username or password..Try again.");
				continue;
			}
			currentUser = userExist;

			break;
		}

	}

	public void loadDatabase() {
		freeLoadedData();
		User user1 = new Consumer();
		user1.setName("amar ghandour");
		user1.setUsername("amar");
		user1.setPassword("111");
		user1.setEmail("amar@gamil.com");

		getUsersUsernameObjectMap().put(user1.getUsername(), user1);
		getUsers().add(user1);
	}

}
