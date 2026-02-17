public class Personne {
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void afficherNomPrenom() {
    
        System.out.println("Nom: " + nom + ", Prénom: " + prenom);
    }

    public static void main(String[] args) {
        Personne personne = new Personne("aa", "bbbb");
        personne.afficherNomPrenom();
        System.out.println(personne);
        
        
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", toString()=" + super.toString() + "]";
    }
}