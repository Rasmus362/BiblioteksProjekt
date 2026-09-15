public class Member {

    final String fuldeNavn;
    final int medlemsNummer;

    Member(String fuldeNavn, int medlemsNummer){

        this.fuldeNavn = fuldeNavn;
        this.medlemsNummer = medlemsNummer;

    } public String toString(){
        return String.format("%s (Lånersnummer: %d)", fuldeNavn, medlemsNummer);

    }
    public int getMemberId(){
        return medlemsNummer;
    }



}
