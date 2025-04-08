public class Compte {
    private String proprietaire ;
    private int solde;
    /**
     * Constructor
     *
     * @param p : initializes value of proprietaire
     * @param s : initializes value of solde
     */
    public Compte(String p, int s) {
        proprietaire = p;
        solde = s;
    }

    public Compte(String proprietaire) {
        this.proprietaire = proprietaire;
        this.solde = 0;
    }

    /**
     * credit the account with a given amount
     *
     * @param amount
     */
    public void credit(int amount) {
        solde += amount;
    }

    /**
     * debit the account with a given amount
     *
     * @param amount
     */
    public void debit(int amount) {
        if (solde <= 0) {
            System.out.println("Le solde doit être supérieure à 0 euros");
        }
        solde -= amount;
    }

    // Méthode virement
    public void virement(Compte destinataire, int amount) {
        if (amount <= 0 && this.solde < amount) {
            System.out.println("Le montant doit être positif");
        }
        if (this.solde >= amount) {
            this.solde -= amount;
            destinataire.credit(amount);
            System.out.println("Virement de " + amount + " euros efféctué de " + this.proprietaire + " vers " + destinataire.proprietaire);
        } else {
            System.out.println("Le solde insuffisant pour effictur le virement !");
        }
    }


    // Getter
    public String getProprietaire() {
        return proprietaire;
    }

    public int getSolde() {
        return solde;
    }

    // Setter
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    // toString
    @Override
    public String toString() {
        return "Compte{" +
                "proprietaire='" + proprietaire + '\'' +
                ", solde=" + solde +
                '}';
    }

}
