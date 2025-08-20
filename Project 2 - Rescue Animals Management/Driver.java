import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();

        String choice = "";

        while (!choice.equals("q")) {
        displayMenu();
        choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "1":
                intakeNewDog(scanner);
                break;
            case "2":
                intakeNewMonkey(scanner);
                break;
            case "3":
                reserveAnimal(scanner);
                break;
            case "4":
                printAnimals("dog");
                break;
            case "5":
                printAnimals("monkey");
                break;
            case "6":
                printAnimals("available");
                break;
            case "q":
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;
        }
        }
    }

    // Displays the main menu options to the user
    public static void displayMenu() {
        System.out.println("\nRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.print("Enter a menu selection: ");
    }

    // Initializes dogList with some default Dog objects for testing purposes
    public static void initializeDogList() {
        dogList.add(new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "USA", "intake", false, "USA"));
        dogList.add(new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "USA", "Phase I", false, "USA"));
        dogList.add(new Dog("Bella", "Chihuahua", "female", "4", "12.3", "12-12-2019", "Canada", "in service", true, "Canada"));
    }

    public static void initializeMonkeyList() {
        monkeyList.add(new Monkey("Kiki", "Capuchin", "female", "2", "14", "03-02-2021", "Brazil", "in service", false, "USA", "15", "18", "22"));
    }

    /**
    * Create a new Dog object and add it to the dogList 
    * after asking the user for input on each attribute..
    */
    public static void intakeNewDog(Scanner scanner) {
        System.out.print("Enter dog's name: ");
        String name = scanner.nextLine();

        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("This dog is already in our system.");
                return;
            }
        }

        System.out.print("Breed: ");
        String breed = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Age: ");
        String age = scanner.nextLine();
        System.out.print("Weight: ");
        String weight = scanner.nextLine();
        System.out.print("Acquisition Date: ");
        String date = scanner.nextLine();
        System.out.print("Acquisition Country: ");
        String country = scanner.nextLine();
        System.out.print("Training Status: ");
        String status = scanner.nextLine();
        System.out.print("In Service Country: ");
        String serviceCountry = scanner.nextLine();

        Dog newDog = new Dog(name, breed, gender, age, weight, date, country, status, false, serviceCountry);
        dogList.add(newDog);
        System.out.println("Dog added.");
    }

    public static void intakeNewMonkey(Scanner scanner) {
        System.out.print("Enter monkey's name: ");
        String name = scanner.nextLine();

        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("This monkey is already in our system.");
                return;
            }
        }

        System.out.print("Species (Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin): ");
        String species = scanner.nextLine();
        if (!species.equalsIgnoreCase("Capuchin") && !species.equalsIgnoreCase("Guenon") &&
            !species.equalsIgnoreCase("Macaque") && !species.equalsIgnoreCase("Marmoset") &&
            !species.equalsIgnoreCase("Squirrel monkey") && !species.equalsIgnoreCase("Tamarin")) {
            System.out.println("Invalid species.");
            return;
        }

        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Age: ");
        String age = scanner.nextLine();
        System.out.print("Weight: ");
        String weight = scanner.nextLine();
        System.out.print("Acquisition Date: ");
        String date = scanner.nextLine();
        System.out.print("Acquisition Country: ");
        String country = scanner.nextLine();
        System.out.print("Training Status: ");
        String status = scanner.nextLine();
        System.out.print("In Service Country: ");
        String serviceCountry = scanner.nextLine();
        System.out.print("Tail Length: ");
        String tail = scanner.nextLine();
        System.out.print("Height: ");
        String height = scanner.nextLine();
        System.out.print("Body Length: ");
        String bodyLength = scanner.nextLine();

        Monkey newMonkey = new Monkey(name, species, gender, age, weight, date, country, status, false, serviceCountry, tail, height, bodyLength);
        monkeyList.add(newMonkey);
        System.out.println("Monkey added.");
    }

    public static void reserveAnimal(Scanner scanner) {
    System.out.print("Enter animal type (dog or monkey): ");
    String type = scanner.nextLine().toLowerCase();

    System.out.print("Enter service country: ");
    String country = scanner.nextLine();

    boolean found = false;

    if (type.equals("dog")) {
        for (Dog dog : dogList) {
            if (dog.getInServiceCountry().equalsIgnoreCase(country) &&
                dog.getTrainingStatus().equalsIgnoreCase("in service") &&
                !dog.getReserved()) {
                dog.setReserved(true);
                System.out.println("Dog " + dog.getName() + " has been reserved.");
                found = true;
                break;
            }
        }
    } else if (type.equals("monkey")) {
        for (Monkey monkey : monkeyList) {
            if (monkey.getInServiceCountry().equalsIgnoreCase(country) &&
                monkey.getTrainingStatus().equalsIgnoreCase("in service") &&
                !monkey.getReserved()) {
                monkey.setReserved(true);
                System.out.println("Monkey " + monkey.getName() + " has been reserved.");
                found = true;
                break;
            }
        }
    } else {
        System.out.println("Invalid animal type.");
        return;
    }

    if (!found) {
        System.out.println("No available and qualified animal found in " + country + ".");
    }
}


    public static void printAnimals(String listType) {
        if (listType.equals("dog")) {
            for (Dog dog : dogList) {
                System.out.println(dog.getName() + " | " + dog.getTrainingStatus() + " | " + dog.getAcquisitionLocation() + " | Reserved: " + dog.getReserved());
            }
        } else if (listType.equals("monkey")) {
            for (Monkey monkey : monkeyList) {
                System.out.println(monkey.getName() + " | " + monkey.getTrainingStatus() + " | " + monkey.getAcquisitionLocation() + " | Reserved: " + monkey.getReserved());
            }
        } else if (listType.equals("available")) {
            System.out.println("Available Dogs:");
            for (Dog dog : dogList) {
                if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                    System.out.println(dog.getName() + " | " + dog.getInServiceCountry());
                }
            }
            System.out.println("Available Monkeys:");
            for (Monkey monkey : monkeyList) {
                if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                    System.out.println(monkey.getName() + " | " + monkey.getInServiceCountry());
                }
            }
        }
    }
}
