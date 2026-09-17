import java.util.ArrayList;

public class ConsoleUI {

    //ConsoleUI, står for brugergrænseoverfladen, viser menuen og modtager input og sender brugerens ønsker videre.

    private Library library;

    public ConsoleUI(Library library) {
        this.library = library;
    }

    public void run() {
        boolean running = true;
        while (running) {
            showMenu();
            int choice = Integer.parseInt(IO.readln("Indtast Choice: "));
            IO.println("Valgt: " + choice);
            switch (choice) {
                case 1 -> borrowBook();
                case 2 -> returnBook();
                case 3 -> showLoans();
                case 0 -> running = false;
                default -> IO.println("Ugyldigt valg.\nprøv igen");

            }
        }

    }

    public void showMenu() {
        IO.println();
        IO.println("1. Lån");
        IO.println("2. Aflever");
        IO.println("3. Vis alle lån");
        IO.println("0. Afslut");
        IO.println("");
    }

    public void borrowBook() {

        int bookId = Integer.parseInt(IO.readln("Indtast venligst bookID: "));
        int memberId = Integer.parseInt(IO.readln("Indtast venligst memberID: "));
        boolean lånLykkedes = library.loanBook(bookId, memberId);
        if (lånLykkedes) {
            IO.println("Lån registreret");
        }else {
            IO.println("Bogen er desværre udlånt.");
        }
    }
    public void returnBook(){
        int bookId = Integer.parseInt(IO.readln("Indtast venligst bookID: "));
        boolean afleveringLykkedes = library.returnBook(bookId);
        if (afleveringLykkedes) {
            IO.println("Aflevering registreret");
        }else {
            IO.println("Bogen er desværre udlånt.");
        }
    }
    public void showLoans(){
        int memberId = Integer.parseInt(IO.readln("Indtast memberID: "));
        ArrayList<Loan> medlemsLån = library.findLoansByMemberId(memberId);
        for (Loan loan : medlemsLån){
            IO.println(loan);
        }

    }
}
