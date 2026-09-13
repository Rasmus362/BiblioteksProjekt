import java.time.LocalDate;

class main {

    void main() {
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

        Loan loan1 = new Loan(book1, member1, LocalDate.of(2026, 9, 13));

        IO.println(loan1);





    }

}