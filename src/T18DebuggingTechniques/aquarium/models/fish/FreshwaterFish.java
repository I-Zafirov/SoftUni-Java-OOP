package T18DebuggingTechniques.aquarium.models.fish;

public class FreshwaterFish extends BaseFish {

    private static final int INITIAL_SIZE = 3;
    private static final int VALUE_TO_ADD = 3;

    public FreshwaterFish(String name, String species, double price) {
        super(name, species, price);
        this.setSize(INITIAL_SIZE);
    }

    @Override
    public void eat() {
        this.setSize(this.getSize() + VALUE_TO_ADD);
    }
}
