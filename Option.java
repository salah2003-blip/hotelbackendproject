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