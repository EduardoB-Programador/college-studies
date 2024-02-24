package model;

public class Reptile extends Animal implements IAnimal {
    private boolean regenerationCapability;

    public Reptile() {
        super();
    }

    public Reptile(String nomenclature, String coveredBy, String reproduction, String dietType, int legAmount, boolean regenerationCapability) {

        super(nomenclature, coveredBy, reproduction, dietType, legAmount);
        this.regenerationCapability = regenerationCapability;
    }

    public void setRegenerationCapability (boolean regenerationCapability) {
        this.regenerationCapability = regenerationCapability;
    }

    public boolean getRegenerationCapability() {
        return this.regenerationCapability;
    }

    @Override
    public void respirationType() {
        super.respirationType();
        System.out.println("Tracheal");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("\nRegeneration capability: " + this.regenerationCapability);
        respirationType();
        bodyTemperature();
    }

    @Override
    public void bodyTemperature() {
        System.out.println("Body Temperature: poikilothermic");
    }
}
