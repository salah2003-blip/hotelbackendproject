public class Test extends Sujet {
    private String date;
    private String heure;
    private String salle;

    public Test(String date, String heure, String salle) {
        super();
        this.date = date;
        this.heure = heure;
        this.salle = salle;
    }

    public void afficherInfosTest() {
        System.out.println("===== TEST PROGRAMMÉ =====");
        System.out.println("Date : " + date);
        System.out.println("Heure : " + heure);
        System.out.println("Salle : " + salle);
        System.out.println("Note totale : " + noteGlobale);
        System.out.println("---------------------------\n");
    }

    public Question[] getQuestions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQuestions'");
    }
}
