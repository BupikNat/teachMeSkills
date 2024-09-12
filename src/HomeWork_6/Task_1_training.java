package HomeWork_6;

public class Task_1_training {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("#1");
        CreditCard card2 = new CreditCard("#2");
        CreditCard card3 = new CreditCard("#3");



        card1.firstInfoCard();
        card2.firstInfoCard();
        card3.firstInfoCard();

        card1.addingToCard(100);
        card2.addingToCard(200);
        card3.takingFromCard(300);

        card1.currentInfoCard();
        card2.currentInfoCard();
        card3.currentInfoCard();
    }


}
