
public class EmailNotificationObserver implements BookingObserver{
	private String email;

    public EmailNotificationObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email dikirim ke " + email + ": " + message);
    }
}
