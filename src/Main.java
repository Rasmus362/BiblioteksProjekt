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

        IO.println("");
        IO.println(book1);
        IO.println("");
        IO.println(book2);
        IO.println("");
        IO.println(book3);
    }

}