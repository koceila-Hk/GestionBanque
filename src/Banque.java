public class Banque {
    private String libelle;
    private int nbComptes;
    private Compte[] comptes;

    public Banque(String libelle) {
        this.libelle = libelle;
        this.nbComptes = 0;
        this.comptes = new Compte[1000];
    }

    // Méthode d'ajout compte
    public void addCompte(Compte compte) {
        if (nbComptes < comptes.length) {
            comptes[nbComptes] = compte;
            nbComptes++;
        } else {
            System.out.println("Plus de disponibiltés pour ajouter de nouveaux comptes");
        }
    }

    // Méthode recherche acompte
    public Compte rechercheCompte(String nom) {
        for (int i = 0; i < nbComptes; i++) {
            if (comptes[i].getProprietaire().equals(nom)) {
                System.out.println("Compte trouvé");
                return comptes[i];
            }
        }
        System.out.println("Compte non trouvé");
        return null;
    }
}
