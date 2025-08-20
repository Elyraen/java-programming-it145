public class Pet {
    // Basic info about the pet and its boarding details
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    // Default constructor - sets everything to some empty or zero state.
    public Pet() {
        petType = "";
        petName = "";
        petAge = 0;
        dogSpaces = 0;
        catSpaces = 0;
        daysStay = 0;
        amountDue = 0.0;
    }

    // Constructor that sets all the pet’s details upfront.
    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    // Getters and setters - just simple ways to get or update the pet’s info

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}
