public class Cactus extends Plants implements PlantNutriNeed{
    final String type="CACTUS";
    //inkapsling
    private String name;

    public Cactus(double height) {
        super(height);
    }
    public Cactus(){}

    public Cactus(String name, double height) {
        super(height);
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
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
    //polymorphism
    @Override
    public void fetchNeed(double height) {
        PlantCalculationCenter.valueOf(this.type).fetchNeed(height);
    }

    @Override
    public void fetchNeed() {
        PlantCalculationCenter.valueOf(this.type).fetchNeed(this.getHeight());
    }
}
