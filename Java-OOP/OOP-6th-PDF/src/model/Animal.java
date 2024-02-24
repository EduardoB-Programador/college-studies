package model;

public abstract class Animal {

    private String nomenclature, coveredBy, reproduction, dietType;
    private int legAmount;

    public Animal() {
        super();
    }

    public Animal(String nomenclature, String coveredBy, String reproduction, String dietType, int legAmount) {

        super();
        this.nomenclature = nomenclature;
        this.coveredBy = coveredBy;
        this.reproduction = reproduction;
        this.dietType = dietType;
        this.legAmount = legAmount;
    }

    public void setNomenclature(String nomenclature) {
        this.nomenclature = nomenclature;
    }

    public void setCoveredBy(String coveredBy) {
        this.coveredBy = coveredBy;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public void setLegAmount(int legAmount) {
        this.legAmount = legAmount;
    }

    public String getNomenclature() {
        return this.nomenclature;
    }

    public String getCoveredBy() {
        return this.coveredBy;
    }

    public String getReproduction() {
        return this.reproduction;
    }

    public String getDietType() {
        return this.dietType;
    }

    public int getLegAmount() {
        return this.legAmount;
    }

    public void respirationType() {
        System.out.print("This animal's respiration type is: ");
    }

    public void showInfo() {
        System.out.print("\n---------------------------------------------" +
                "\nNomenclature: " + this.nomenclature +
                "\nCovered by: " + this.coveredBy +
                "\nReproduction: " + this.reproduction +
                "\nDiet type: " + this.dietType +
                "\nAmount of legs: " + this.legAmount);
    }

}
