package T09InterfacesAndAbstraction.exercise.E06MilitaryElite.Soldiers;

import T09InterfacesAndAbstraction.exercise.E06MilitaryElite.Enum.Corps;
import T09InterfacesAndAbstraction.exercise.E06MilitaryElite.Interfaces.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public Corps getCorps() {
        return corps;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() +
                "Corps: " + getCorps();
    }
}