package T09InterfacesAndAbstraction.lab.L04SayHelloExtended;

public abstract class BasePerson implements Person {

    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
