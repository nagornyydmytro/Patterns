package L23_Visitor.L23E2;

public class SecretAgent extends Spy {

    @Override
    public void visit(GeneralStaff generalStaff) {
        System.out.println("Secret agent stole " + generalStaff.getSecretPaper() + " secret papers from general staff");
        generalStaff.setSecretPaper(0);
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        System.out.println("Secret agent visited military base");
    }
}