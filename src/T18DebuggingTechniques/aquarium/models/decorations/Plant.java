package T18DebuggingTechniques.aquarium.models.decorations;

public class Plant extends BaseDecoration {

    private static final int COMFORT = 5;
    private static final double PRICE = 10.0;

    public Plant() {
        super(COMFORT, PRICE);
    }
}
