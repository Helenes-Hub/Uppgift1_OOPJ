public class Carnivorous extends Plants implements PlantNutriNeed{
    final String type="CARNIVOROUS";
    private String name;

    public Carnivorous(double height) {
        super(height);
        this.name=name;
    }
    public Carnivorous() {}

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void fetchNeed(double height) {
        PlantCalculationCenter.valueOf(this.type).fetchNeed(height);
    }

    @Override
    public void fetchNeed() {

    }
}