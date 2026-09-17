import java.util.ArrayList;
import java.time.LocalDate;

public class Library {

    //Library holder styr på samlingen af  bøger medlemmer og lån, herudover indeholder Libraryklassen også metoderne
    //til at finde en bog, registrere et lån og aflevere en bog tilbage gennem ConsoleUI.

    //"Opret en privat variabel ved navn books, som er en liste af Book-objekter, og giv den en ny tom ArrayList."
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    //"For hver Book i books: kald den aktuelle bog book, og udfør koden."
    public void printBooks() {
        for (Book book : books) {
            IO.println(book);
        }
    }

    public void printMembers() {
        for (Member member : members) {
            IO.println(member);
        }
    }

    public Book getBook(int bookId) {
//Gennemgå books → kig på én book ad gangen → sammenlign dens ID med bookId → hvis de matcher, returnér bogen → hvis ingen matcher, returnér null.
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    public Member getMember(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

    public boolean loanBook(int bookId, int memberId) {
        Book foundBook = getBook(bookId);
        Member foundMember = getMember(memberId);
        if (foundBook != null && foundMember != null) {
            for (Loan loan : loans) {
                if (loan.getBook().getBookId() == bookId) {
                    return false;
                }
            }
            Loan loan = new Loan(foundBook, foundMember, LocalDate.now());
            loans.add(loan);
            return true;
        } else {
            return false;
        }

    }

    public boolean returnBook(int bookId) {
        for (int i = 0; i < loans.size(); i++) {
            Loan loan = loans.get(i);

            if (loan.getBook().getBookId() == bookId) {
                loans.remove(i);
                return true;
            }
        }

        return false;
    }

    ArrayList<Loan> findLoansByMemberId(int memberId) {
        ArrayList<Loan> memberLoans = new ArrayList<>();
        for (Loan loan : loans) {
            if (loan.getMember().getMemberId() == memberId) {
                memberLoans.add(loan);
            }

        }
        return memberLoans;

    }

}
