import Modules.Annuitator;

public class AnnManag {

    public static void main(String[] args) {

        Annuitator annuitator = new Annuitator();
        System.out.println(annuitator.annPayment(12,12,100));

        System.out.println("NEAREST LIMIT IS "+annuitator.getAmountStnd(219,64,36));

    }
}
