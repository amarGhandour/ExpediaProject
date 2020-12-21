
public class ConsumerView {

	private static ConsumerView consumerView;

	
	private ConsumerView() {
		
	}
	
	public static ConsumerView getConsumerView() {
		if (consumerView == null)
			consumerView = new ConsumerView();
		return consumerView;
	}
	
	public void showMainMenu() {
		User user = UsersManger.getUsersMangerInstance().getCurrentUser();
		System.out.printf("%nHello %s | Consumer view.%n%n", user.getName());
		
		String[] menu = {"View Profile.", "Make Itinerary.", "List my itineraries", "Logout"};
		
		while(true) {
			int choice = HelperMethod.showReadMenu(menu);
			
			if (choice == 1)
				viewProfile();
			else if (choice == 2)
				makeItinerary();
			else if (choice == 3)
				listMyItineraries();
			else 
				break;
		}
		UsersManger.getUsersMangerInstance().accessSystem();
		
	}

	private void listMyItineraries() {
		
		
	}

	private void makeItinerary() {
		
		String[] menu = {"Add Flight", "Add Hotel", "Done", "Cancel"};
		
		while(true) {
			int choice = HelperMethod.showReadMenu(menu);
			
			if (choice == 1)
				;
			else if (choice == 2)
				;
			else if (choice == 4)
				;
			else
				break;
		}
		
	}

	

	private void viewProfile() {
		User user = UsersManger.getUsersMangerInstance().getCurrentUser();
		System.out.println(user.toString());
	}
}
