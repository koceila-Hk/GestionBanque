//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        // Affichage final
        System.out.println("--- Après virement ---");
        System.out.println(compteFrancois);
        System.out.println(compteMichel);

        System.out.println("==================== Banque =============================");

        Banque banque1 = new Banque("Crédit blésois");
        banque1.addCompte(compteMichel);

        // Recherche un compte
        banque1.rechercheCompte("Michel");
        banque1.rechercheCompte("MicheL");
    }
}