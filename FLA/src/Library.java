import java.util.ArrayList;
import java.util.List;

public class Library {
	private Database database;
    private List<BookingObserver> observers;

    public Library() {
        this.database = Database.getInstance();
        this.observers = new ArrayList<>();
    }

    public void addObserver(BookingObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (BookingObserver observer : observers) {
            observer.update(message);
        }
    }

    public Book createBook(BookType type, String title, String author) {
        Book book;
        switch (type) {
            case NOVEL:
                book = new NovelBook(title, author);
                break;
            case SELF_IMPROVEMENT:
                book = new Self_ImprovementBook(title, author);
                break;
            case FINANCIAL:
                book = new FinancialBook(title, author);
                break;
            default:
                throw new IllegalArgumentException("Tipe buku tidak valid");
        }
        
        database.addBook(book);
        return book;
    }

    public void bookBook(String memberName, Book book) {
        notifyObservers("Buku " + book.getTitle() + " dibooking oleh " + memberName);
    }
}
