package HomeWork_8_1;

public class Call {

    public static void main(String[] args) {

        Phone firstCall = new Phone("375(29)111-11-11","SamsungA52",300);
        Phone secondCall = new Phone("375(29)222-22-22","HuaweiMaxPro",350);
        Phone thirdCall = new Phone("375(29)333-33-33","GooglePixel4",400);

        System.out.println("The first phone is " + firstCall.getModel()+ " " + firstCall.getNumber()+ " " + firstCall.getWeight());
        System.out.println("The second phone is " + secondCall.getModel()+ " " + secondCall.getNumber()+ " " + secondCall.getWeight());
        System.out.println("The third phone is " + thirdCall.getModel()+ " " + thirdCall.getNumber()+ " " + thirdCall.getWeight());

        System.out.println("=======================================================");  //Отбивка для красивого вывода в консоль

        firstCall.receiveCall("Абонент_1");
        secondCall.receiveCall("Абонент_2");
        thirdCall.receiveCall("Абонент_3");

        System.out.println("=======================================================");  //Отбивка для красивого вывода в консоль

        firstCall = new Phone("375(29)111-11-11","SamsungA52");
        secondCall = new Phone("375(29)222-22-22","HuaweiMaxPro");
        thirdCall = new Phone("375(29)333-33-33","GooglePixel4");

        firstCall.receiveCall("Абонент_1","375(29)111-11-11");
        secondCall.receiveCall("Абонент_2","375(29)222-22-22");
        thirdCall.receiveCall("Абонент_3","375(29)333-33-33");

        System.out.println("=======================================================");  //Отбивка для красивого вывода в консоль

        String[] allNumbers = {"375(29)111-11-11","375(29)222-22-22", "375(29)333-33-33"};
        firstCall.sendMessage(allNumbers);
    }
}

