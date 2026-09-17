
//    Book book1 = new Book(...);
//      │    │       │   └── constructor        | Dette er konstruktøren der sammen med "new" bliver fodret information,
//      │    │       └────── opret nyt objekt   | som bliver sat ind i skabelonen.
//      │    └────────────── variabel/reference | Dette er Classtype, som referer til den class koden er lavet,
//      └─────────────────── klasse/datatype    | i dette tilfælde er det "Book", Book1 er alt den data vi giver
//                                              | skabelonen, og bliver referet efter sin egen variabel.
//
// En klasse er en skabelon, der bestemmer hvilke egenskaber objekter af den klasse har.
// Et objekt er en konkret instans af klassen, som har sine egne værdier/data.


class Book {
    // final = uforanderlige værdier (immutable)

    //book# object bliver behandlet i bookklassens konstruktør.

    final String author;
    final String title;
    final String isbn;
    final int id;

    Book(String author, String title, String isbn, int id) { //konstruktør parametrer

        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.id = id;

    }
    @Override
    public boolean equals(Object otherObj){
        if(otherObj == null || getClass() != otherObj.getClass()){
            return false;
        }
        Book book = (Book) otherObj;
        return id == book.id;
    }


    public String toString() {
        return String.format("%s: %s; ISBN: %s; (%d)", author, title, isbn, id);
    }
    public int getBookId(){
        return id;
    }


}

