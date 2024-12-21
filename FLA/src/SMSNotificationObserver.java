public class SMSNotificationObserver implements BookingObserver{
    private String phoneNumber;

    public SMSNotificationObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS dikirim ke " + phoneNumber + ": " + message);
    }
}
