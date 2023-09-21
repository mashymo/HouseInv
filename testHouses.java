import java.util.Scanner;
public class testHouses {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // num scanner
        Scanner sScanner = new Scanner(System.in); // string scanner

        System.out.println("How many houses do you have in your inventory?: ");
        int numHouses = iScanner.nextInt();

        // House class from House.java
        House[] houses = new House[numHouses]; // initializing array of House objects determined by numHouses

        for (int houseIndex = 0; houseIndex < numHouses; houseIndex++) { // iterates through each element of the "houses" array
            System.out.println("Please enter the following information for house #" + (houseIndex + 1) + ": ");

            System.out.println("Address: ");
            String address = sScanner.nextLine();

            System.out.println("Zipcode: ");
            String zipcode = sScanner.nextLine();

            System.out.println("Number of rooms: ");
            int numRooms = iScanner.nextInt();

            System.out.println("Number of bathrooms: ");
            int numBathrooms = iScanner.nextInt();

            System.out.println("Area of house #" + (houseIndex + 1) + " (square feet): ");
            double area = iScanner.nextDouble();
            iScanner.nextLine();

            System.out.println("Number of floors: ");
            int numFloors = iScanner.nextInt();

            System.out.println("Price: ");
            double price = iScanner.nextDouble();

            System.out.println("Category (A, B, or C): ");
            char category = sScanner.next().charAt(0);
            sScanner.nextLine();

            System.out.println("Does house #" + (houseIndex + 1) + " have a pool? (True/False): ");
            boolean hasPool = sScanner.nextBoolean();
            sScanner.nextLine();

            System.out.println();
            System.out.println("Please enter the initial price set by the county: ");
            double baseHousePrice = iScanner.nextDouble();

            House house = new House(address, zipcode, numRooms, numBathrooms, area, numFloors, price, baseHousePrice, category, hasPool); // new object with parameters of specified attributes
            houses[houseIndex] = house; // object stored in array at current index
            System.out.println();

            double annualTax = house.calculateAnnualTax(baseHousePrice); // calculating annual tax using helper method
        }

        System.out.println("Database created!");

        System.out.println("Which house do you want to display the information for?: ");
        int houseIndex = iScanner.nextInt();

        if (houseIndex >= 1 && houseIndex <= numHouses) {
            House house = houses[houseIndex - 1]; // retrieves House object at the specified index in houses array
            System.out.println(house.toString()); // toString override
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and " + numHouses + ".");
        }
    }
}
