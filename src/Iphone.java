public class Iphone implements Smartphone, IOS{
    @Override
    public void iphone() {
        System.out.println("Hello user iPhone!");

    }
    @Override
    public void call() {
        System.out.println("Let's make call");

    }

    @Override
    public void sms() {
        System.out.println("Let's type massage!");

    }

    @Override
    public void internet() {
        System.out.println("You are connect to Vodafone internet.");

    }


}
