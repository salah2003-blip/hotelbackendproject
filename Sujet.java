
public class Sujet {
    protected Question[] questions;
    protected double noteGlobale;

    public Sujet() {
        // Remplissage automatique du tableau
        questions = new Question[2];
        questions[0] = new Question(1);
        questions[1] = new Question(2);

        calculerNoteGlobale();
    }

    private void calculerNoteGlobale() {
        noteGlobale = 0;
        for (Question q : questions) {
            noteGlobale += q.getNote();
        }
    }

    public void afficherSujet() {
        System.out.println("----- SUJET -----");
        for (Question q : questions) {
            q.afficher();
        }
        System.out.println("Note globale : " + noteGlobale);
    }
}