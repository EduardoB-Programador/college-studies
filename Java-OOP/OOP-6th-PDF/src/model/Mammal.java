package model;

public class Mammal extends Animal implements IAnimal {

    private String habitat;
    // Terrestrial, Aquatic

    public Mammal() {
        super();
    }

    public Mammal(String nomenclature, String coveredBy, String reproduction, String dietType, int legAmount, String habitat) {

        super(nomenclature, coveredBy, reproduction, dietType, legAmount);
        this.habitat = habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    @Override
    public void respirationType() {
        super.respirationType();
        System.out.println("Pulmonary");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("\nHabitat: " + this.habitat);
        respirationType();
        bodyTemperature();
    }

    @Override
    public void bodyTemperature() {
        System.out.println("Body Temperature: Homeothermic");
    }
}
