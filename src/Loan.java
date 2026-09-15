import java.time.LocalDate;

public class Loan {

    final Book book;
    final Member member;
    final LocalDate borrowedDate;

    Loan(Book book, Member member, LocalDate borrowedDate) {

        this.book = book;
        this.member = member;
        this.borrowedDate = borrowedDate;

        // Loan komposition / "has-a"
        // Loan har en "book"
        // Loan har et "member"

    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getDueDate() {
        return borrowedDate.plusDays(14);
    }

    public boolean isOverDue() {
        if (LocalDate.now().isAfter(getDueDate())) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return String.format("\n%s\n%s\nAfleveringsfrist: %s", book, member, getDueDate());
    }
}
