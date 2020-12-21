
public class HotelReservation implements IReservation {

	private String hotelName;
	private double pricePerNight;
	private int numberOfNights;
	private String roomType;

	public HotelReservation() {
		
	}

	public HotelReservation(HotelReservation anotherHotelReservation) {
		setHotelName(anotherHotelReservation.getHotelName());
		setPricePerNight(anotherHotelReservation.getPricePerNight());
		setNumberOfNights(anotherHotelReservation.getNumberOfNights());
		setRoomType(anotherHotelReservation.getRoomType());
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	@Override
	public double getTotalCost() {

		return getNumberOfNights() * getPricePerNight();
	}

	@Override
	public IReservation cloneObject() {
		return new HotelReservation(this);
	}

}
