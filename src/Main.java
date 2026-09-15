import java.time.LocalDate;
import java.util.ArrayList;

class main {

    void main() {

        Library library = new Library();
        Book book1 = new Book("Allan B. Downey",
                "Think Java",
                "9781492072508",
                1);

        Book book2 = new Book("Rachel Cusk",
                "Omrids",
                "9788763851664",
                2);

        Book book3 = new Book("Yuval Noah Harari",
                "Sapiens",
                "9780062316097",
                3);

        Member member1 = new Member("Thorkild Hansen", 111);
        Member member2 = new Member("Lise Andersen", 222);
        Member member3 = new Member("Anders Pedersen",333);

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        IO.println("\n");
        Book foundBook = library.getBook(1);
        IO.println(book1);
        Book notFoundBook = library.getBook(111);
        IO.println(notFoundBook);

        IO.println("\n");
        Member memberFound = library.getMember(111);
        IO.println(member1);
        Member memberNotFound = library.getMember(111);
        IO.println(memberNotFound);

        library.loanBook(1,111);
        ArrayList<Loan> loans = library.getLoans();
        IO.println(loans);


        IO.println(library.loanBook(1, 111));
        IO.println(library.loanBook(3, 32));
        IO.println(library.loanBook(5, 3));



        IO.println("\n-----Bøger-----");
        library.printBooks();
        IO.println("");
        IO.println("-----Medlemmer-----");
        library.printMembers();


    }

}