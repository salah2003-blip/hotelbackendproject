import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Test t = new Test("12/12/2025", "10:00", "Salle 14");

        t.afficherInfosTest();

        double noteObtenue = 0;

        System.out.println("===== RÉPONDEZ AU TEST =====");

        for (Question q : t.getQuestions()) {
            q.afficher();
            System.out.print("Votre réponse : ");
            int rep = sc.nextInt();

            if (q.verifier(rep)) {
                System.out.println("✔ Bonne réponse !\n");
                noteObtenue += q.getNote();
            } else {
                System.out.println("✘ Mauvaise réponse.\n");
            }
        }

        System.out.println("===== RÉSULTAT FINAL =====");
        System.out.println("Votre note : " + noteObtenue + " / " + t.noteGlobale);

        sc.close();
    }
}
