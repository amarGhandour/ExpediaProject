import java.util.ArrayList;
import java.util.List;

public class ItineraryReservation implements IReservation {

	private List<IReservation> reservations;

	public ItineraryReservation() {
		reservations = new ArrayList<>();
	}

	public ItineraryReservation(ItineraryReservation anothorItineraryReservation) {
		for (IReservation reservation : anothorItineraryReservation.getReservations()) {
			addReservation(reservation);
		}
	}

	public void addReservation(IReservation reservation) {
		reservations.add(reservation.cloneObject());
	}

	public List<IReservation> getReservations() {
		return reservations;
	}

	@Override
	public double getTotalCost() {
		double cost = 0;

		for (IReservation reservation : getReservations()) {
			cost += reservation.getTotalCost();
		}

		return cost;
	}

	@Override
	public IReservation cloneObject() {
		return new ItineraryReservation(this);
	}

}
