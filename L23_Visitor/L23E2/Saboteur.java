package L23_Visitor.L23E2;

public class Saboteur extends Spy {

    @Override
    public void visit(GeneralStaff generalStaff) {
        generalStaff.setSecretPaper(0);
        generalStaff.setGenerals(0);
        System.out.println("Saboteur damaged general staff");
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        militaryBase.setOfficers(0);
        militaryBase.setSoldiers(0);
        militaryBase.setJeeps(0);
        militaryBase.setTanks(0);
        System.out.println("Saboteur damaged military base");
    }
}