
public class ExpediaSite {

	UsersManger usersManger;

	public ExpediaSite() {
		usersManger = UsersManger.getUsersMangerInstance();
	}

	public void run() {
		UsersManger.getUsersMangerInstance().loadDatabase();
		UsersManger.getUsersMangerInstance().accessSystem();
		
		if (usersManger.getCurrentUser() instanceof Consumer) {
			ConsumerView.getConsumerView().showMainMenu();
		} else {
			// Admin view here.
		}
		
	}
}
