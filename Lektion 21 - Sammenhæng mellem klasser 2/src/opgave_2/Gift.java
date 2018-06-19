package opgave_2;

public class Gift {
    private String description;
    private double price = 0.0;

    public Gift(String description) {
        this.setDescription(description);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
