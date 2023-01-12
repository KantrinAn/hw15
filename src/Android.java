public class Android implements Smartphone, LinuxOS {
    public static void main(String[] args) {

    }
    @Override
    public void android() {
        System.out.println("Hello android user!");

    }
    @Override
    public void call() {
        System.out.println("Please, type phone number for call");

    }

    @Override
    public void sms() {
        System.out.println("Please, type test message");

    }

    @Override
    public void internet() {
        System.out.println("Check your internet connect");

    }


}
