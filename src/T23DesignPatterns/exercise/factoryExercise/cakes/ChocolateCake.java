package T23DesignPatterns.exercise.factoryExercise.cakes;

public class ChocolateCake extends Cake{
    public ChocolateCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chocolate Cake");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chocolate Cake");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chocolate Cake");
    }
}
