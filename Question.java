public class Question {
    private String enonce;
    private Option[] options;
    private double note;

    public Question(int numero) {
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
        System.out.println(enonce);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ") " + options[i].getTexte());
        }
    }

    // Vérifier si la réponse choisie est correcte
    public boolean verifier(int choix) {
        if (choix < 1 || choix > options.length) return false;
        return options[choix - 1].isCorrecte();
    }

    public double getNote() {
        return note;
    }
}
