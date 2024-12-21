enum BookType {
    NOVEL, SELF_IMPROVEMENT, FINANCIAL
}

class NovelBook extends Book {
    public NovelBook(String title, String author) {
        super(title, author);
    }
}

class Self_ImprovementBook extends Book {
    public Self_ImprovementBook(String title, String author) {
        super(title, author);
    }
}

class FinancialBook extends Book {
    public FinancialBook(String title, String author) {
        super(title, author);
    }
}


public class Main {
    public static void main(String[] args) {
        Library librarySystem = new Library();

        librarySystem.addObserver(new EmailNotificationObserver("user@example.com"));
        librarySystem.addObserver(new SMSNotificationObserver("+62123456789"));

        Book novelBook = librarySystem.createBook(
            BookType.FINANCIAL, 
            "The Psychology of Money", 
            "Morgan Housel"
        );

        Book financialBook = librarySystem.createBook(
            BookType.NOVEL, 
            "The Alchemist", 
            "Paulo Coelho"
        );
        
        Book self_improvementBook = librarySystem.createBook(
                BookType.SELF_IMPROVEMENT, 
                "Man's Search For Meaning", 
                "Viktor Frankl"
            );

        librarySystem.bookBook("Johan", financialBook);
    }
}