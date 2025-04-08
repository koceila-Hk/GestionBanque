import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Compte compteFrancois = new Compte("Francois", 1000);

        // le compte de Michel
        Compte compteMichel = new Compte("Michel");

        // Affichage avec toString
        System.out.println(compteFrancois);
        System.out.println(compteMichel);

        // Créditer Michel de 200 €
        compteMichel.credit(200);

        // Débiter François de 150 €
        compteFrancois.debit(150);

        // Affichage après opérations
        System.out.println("--- Après opérations ---");
        System.out.println(compteFrancois);
        System.out.println(compteMichel);

        //virement de François vers Michel
        compteFrancois.virement(compteMichel, 300);

        // Affichage final après virement
        System.out.println("--- Après virement ---");
        System.out.println(compteFrancois);
        System.out.println(compteMichel);

        System.out.println("==================== Banque =============================");

        // Création de la banque
        Banque banque1 = new Banque("Crédit blésois");
        banque1.addCompte(compteMichel);

        // Recherche d'un compte dans la banque
        System.out.println("Recherche compte Michel : " + banque1.rechercheCompte("Michel"));
        System.out.println("Recherche compte MicheL (avec une faute) : " + banque1.rechercheCompte("MicheL"));

        System.out.println("==================== Banque BNP =============================");

        // Création d'une autre banque
        Banque banque = new Banque("BNP PARIBAS");

        // Scanner pour lire les entrées
        Scanner scanner = new Scanner(System.in);

        // Boucle pour l'interaction
        while (true) {
            // Affichage du menu
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 -> Ajouter un compte");
            System.out.println("2 -> Consulter votre compte");
            System.out.println("3 -> Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            // 1. Ajouter un compte
            if (choix == 1) {
                System.out.println("Vous souhaitez ajouter un compte.");
                System.out.print("A quel nom ? ");
                String nom = scanner.nextLine();
                // Ajouter un nouveau compte avec un solde de 0
                Compte nouveauCompte = new Compte(nom, 0);
                banque.addCompte(nouveauCompte);
                System.out.println("Compte ajouté pour " + nom + " avec un solde de 0.");
            }
            // 2. Consulter un compte
            else if (choix == 2) {
                System.out.println("Vous souhaitez consulter un compte.");
                System.out.print("Quel compte voulez-vous consulter ? ");
                String nom = scanner.nextLine();
                Compte compteRecherche = banque.rechercheCompte(nom);

                if (compteRecherche != null) {
                    System.out.println("Compte trouvé : " + compteRecherche);
                    System.out.println("Solde du compte : " + compteRecherche.getSolde() + " euros.");
                } else {
                    System.out.println("Compte non trouvé.");
                }
            }
            // 3. Quitter
            else if (choix == 3) {
                System.out.println("Merci d'avoir utilisé notre banque.");
                break; // Sortir de la boucle infinie
            }
            // Choix invalide
            else {
                System.out.println("Choix invalide, veuillez réessayer.");
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}
