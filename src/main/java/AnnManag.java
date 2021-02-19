import Modules.Annuitator;

public class AnnManag {

    public static void main(String[] args) {

        // тест расчета платежа по аннуитетному кредиту
        Annuitator annuitator = new Annuitator();
//        System.out.println(annuitator.annPayment(12,12,100));

        // тест процесса поиска суммы кредита под сумму платежа и ставку и число периодов - СТАНДАРТНЫЙ ГРАФИК
//        System.out.println("NEAREST LIMIT IS "+annuitator.getAmountStnd(405,123,60));

        // тест процесса поиска суммы кредита под сумму платежа и ставку и число периодов - АННУИТЕТ
        System.out.println("NEAREST ANNUITY LIMIT IS "+annuitator.getAmountAn(202,12,12));


    }
}
