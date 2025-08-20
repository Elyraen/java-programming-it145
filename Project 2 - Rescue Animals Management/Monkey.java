public class Monkey extends RescueAnimal {

    // Monkey-specific attributes
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // Constructor
    public Monkey(String name, String species, String gender, String age, String weight,
                  String acquisitionDate, String acquisitionCountry, String trainingStatus,
                  boolean reserved, String inServiceCountry, String tailLength,
                  String height, String bodyLength) {
        // Call RescueAnimal constructor methods to set inherited attributes
        setName(name);
        setAnimalType("Monkey"); // Hardcoded to "Monkey"
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

        // Set Monkey-specific attributes
        this.species = species;
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
    }

    // Accessor and mutator methods

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }
}
