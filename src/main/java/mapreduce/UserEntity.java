package mapreduce;

public class UserEntity {

	private int id;
	private String telphone;
	private String name;
	private Double monthIncome;
	private String address;
	private Double yearIncome;
	
	public UserEntity() {}

	public UserEntity(int id, String telphone, String name, Double income, String address, Double param) {
		this.id = id;
		this.telphone = telphone;
		this.name = name;
		this.monthIncome = income;
		this.address = address;
		this.yearIncome = param;
	}
	
	public void set(int id, String telphone, String name, Double income, String address, Double param) {
		this.id = id;
		this.telphone = telphone;
		this.name = name;
		this.monthIncome = income;
		this.address = address;
		this.yearIncome = param;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getMonthIncome() {
		return monthIncome;
	}

	public void setMonthIncome(Double monthIncome) {
		this.monthIncome = monthIncome;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Double getYearIncome() {
		return yearIncome;
	}

	public void setYearIncome(Double yearIncome) {
		this.yearIncome = yearIncome;
	}

	
}
