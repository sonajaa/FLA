import java.util.ArrayList;
import java.util.List;

public class Database {
	private static Database instance;
    private List<Book> books;
    private List<Member> members;


    private Database() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public List<Member> getMembers() {
        return new ArrayList<>(members);
    }
}
