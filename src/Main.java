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

        IO.println("Skibidi");

        //library.loanBook(1, 111);
        //library.loanBook(1, 222);

        library.loanBook(1, 111);

        IO.println(library.getLoans());

        IO.println(library.returnBook(1));

        IO.println(library.getLoans());

        IO.println("\n-----Bøger-----");
        library.printBooks();
        IO.println("");
        IO.println("-----Medlemmer-----");
        library.printMembers();


    }

}