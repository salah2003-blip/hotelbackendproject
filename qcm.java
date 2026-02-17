public class Option {
    private String texte;
    private boolean correcte;

    public Option(String texte, boolean correcte) {
        this.texte = texte;
        this.correcte = correcte;
    }

    public void afficher() {
        System.out.println(" - " + texte + " (correcte: " + correcte + ")");
    }

    public boolean isCorrecte() {
        return correcte;
    }
}
public class Question {
    private String enonce;
    private Option[] options;
    private double note;

    public Question(int numero) {
        // Remplir automatiquement selon le numéro
        switch (numero) {
            case 1:
                enonce = "Capitale de l'Algérie ?";
                options = new Option[] {
                    new Option("Paris", false),
                    new Option("Alger", true),
                    new Option("Madrid", false)
                };
                note = 2;
                break;

            case 2:
                enonce = "Combien de côtés a un carré ?";
                options = new Option[] {
                    new Option("5", false),
                    new Option("4", true),
                    new Option("3", false)
                };
                note = 1;
                break;

            default:
                enonce = "Question par défaut";
                options = new Option[] {
                    new Option("Aucune", false)
                };
                note = 0;
        }
    }

    public void afficher() {
        System.out.println("Question : " + enonce);
        System.out.println("Note : " + note);
        for (Option op : options) {
            op.afficher();
        }
        System.out.println();
    }

    public double getNote() {
        return note;
    }
}
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
public class Test extends Sujet {
    private String date;
    private String heure;
    private String salle;

    public Test(String date, String heure, String salle) {
        super();  // construit automatiquement les questions
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
public class Main {
    public static void main(String[] args) {
        
        Test t = new Test("12/12/2025", "10:00", "Salle 14");

        t.afficherInfosTest();
        t.afficherSujet();
    }
}
