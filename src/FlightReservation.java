import java.time.LocalDate;

public class FlightReservation implements IReservation {

	private LocalDate dateTimeFrom; // Departure date
	private LocalDate dateTimeTo;	// Arrival date
	private String from;
	private String to;
	private double cost;

	public FlightReservation() {
		 
	}
	
	public FlightReservation(FlightReservation anotherFlightReservation) {
		setCost(anotherFlightReservation.getTotalCost());
		setDateTimeFrom(anotherFlightReservation.getDateTimeFrom());
		setDateTimeTo(anotherFlightReservation.getDateTimeTo());
		setFrom(anotherFlightReservation.getFrom());
		setTo(anotherFlightReservation.getTo());
	}
	
	public LocalDate getDateTimeFrom() {
		return dateTimeFrom;
	}

	public void setDateTimeFrom(LocalDate dateTimeFrom) {
		this.dateTimeFrom = dateTimeFrom;
	}

	public LocalDate getDateTimeTo() {
		return dateTimeTo;
	}

	public void setDateTimeTo(LocalDate dateTimeTo) {
		this.dateTimeTo = dateTimeTo;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public double getTotalCost() {
		return cost;
	}

	@Override
	public IReservation cloneObject() {
		return new FlightReservation(this);
	}

}
