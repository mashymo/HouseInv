public class House {
    // attributes
    private String address;
    private String zipcode;
    private int numRooms;
    private int numBathrooms;
    private double area;
    private int numFloors;
    private double price;
    private double baseHousePrice;
    private char category;
    private boolean hasPool;

    // constructors
    public House() {

    }

    public House(String address, String zipcode, int numRooms, int numBathrooms, double area, int numFloors,
            double price, double baseHousePrice,
            char category, boolean hasPool) {
        this.address = address;
        this.zipcode = zipcode;
        this.numRooms = numRooms;
        this.numBathrooms = numBathrooms;
        this.area = area;
        this.numFloors = numFloors;
        this.price = price;
        this.baseHousePrice = baseHousePrice;
        this.category = category;
        this.hasPool = hasPool;
    }

    public House(int numRooms, int numBathrooms, double baseHousePrice, char category, boolean hasPool) { // constructor ex. based on annualTax
        this.numRooms = numRooms;
        this.numBathrooms = numBathrooms;
        this.baseHousePrice = baseHousePrice;
        this.category = category;
        this.hasPool = hasPool;
    }

    // setters & getters
    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode() {
        this.zipcode = zipcode;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms() {
        this.numRooms = numRooms;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms() {
        this.numBathrooms = numBathrooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = area;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors() {
        this.numFloors = numFloors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory() {
        this.category = category;
    }

    public boolean getHasPool() {
        return hasPool;
    }

    public void setHasPool() {
        this.hasPool = hasPool;
    }

    // helper to calculate final annual tax
    public double calculateAnnualTax(double baseHousePrice) {
        double annualTax = baseHousePrice * 0.025;
        if (category == 'B') {
            annualTax += baseHousePrice * 0.01;
        } else {
            if (category == 'A') {
                annualTax += baseHousePrice * 0.02;
            }
        }

        annualTax += numRooms * baseHousePrice * 0.005;
        annualTax += numBathrooms * baseHousePrice * 0.002;

        if (hasPool) {
            annualTax += baseHousePrice * 0.007;
        }
        return annualTax;
    }

    @Override // overriding toString
    public String toString() {
        return "Address: " + getAddress() + "\n" + "Zipcode: " + getZipcode() + "\n" + "Number of rooms: "
                + getNumRooms() + "\n" + "Number of bathrooms: " + getNumBathrooms() + "\n" + "Area: " + getArea()
                + "\n" + "Number of floors: " + getNumFloors() + "\n" + "Price: " + getPrice() + "\n" + "Category: "
                + getCategory() + "\n" + "Has pool?: " + getHasPool() + "\n" + "Annual Tax: " + calculateAnnualTax(baseHousePrice);

    }
}
