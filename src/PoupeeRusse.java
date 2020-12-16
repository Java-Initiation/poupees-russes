public class PoupeeRusse {

    private final String nom;
    private final int taille;
    private boolean ouverte;
    private PoupeeRusse pDans, pContenue;

    public PoupeeRusse(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public void ouvrir(){
        if (this.pDans != null)
            System.out.println("ERREUR : Impossible d'ouvrir :la poupée " + this.nom + " est déjà dans une poupée " + this.pDans.nom);
        else if (this.ouverte)
            System.out.println("ERREUR : Impossible d'ouvrir la poupée " + this.nom + " car elle est déjà ouverte");
        else{
            System.out.println("SUCCES : On ouvre la poupée " + this.nom);
            this.ouverte = true;
        }
    }

    public void fermer(){
        if (this.pDans != null)
            System.out.println("ERREUR : Impossible de fermer :la poupée " + this.nom + " est déjà dans une poupée " + this.pDans.nom);
        else if (!this.ouverte)
            System.out.println("ERREUR : Impossible de fermer la poupée " + this.nom + " car elle est déjà fermée");
        else{
            System.out.println("SUCCES : On ferme la poupée " + this.nom);
            this.ouverte = false;
        }
    }

    public void placerDans(PoupeeRusse p){
        if (this.ouverte)
            System.out.println("ERREUR : Impossible de placer la poupée " + this.nom + " car elle est ouverte");
        else if (this.pDans != null)
            System.out.println("ERREUR : Impossible de placer la poupée " + this.nom + " car elle est déjà dans la poupée " + this.pDans.nom);
        else if (!p.ouverte)
            System.out.println("ERREUR : Impossible de placer la poupée " + this.nom + " car la poupée " + p.nom + " est fermée");
        else if (p.pContenue != null)
            System.out.println("ERREUR : Impossible de placer la poupée " + this.nom + " car la poupée " + p.nom + " contient déjà une poupée");
        else if (p.taille <= this.taille)
            System.out.println("ERREUR : Impossible de placer la poupée " + this.nom + " car la poupée " + p.nom + " est plus petite ou de taille égale");
        else{
            this.pDans = p;
            p.pContenue = this;
            System.out.println("SUCCES : On place la poupée " + this.nom + " dans " + p.nom + " avec succès");
        }
    }

    public void sortirDe(PoupeeRusse p){
        if (p.pContenue != this)
            System.out.println("ERREUR : Impossible de retirer la poupée " + this.nom + " car elle n'est pas dans " + p.nom);
        else if (!p.ouverte)
            System.out.println("ERREUR : Impossible de retirer la poupée " + this.nom + " car la poupée " + p.nom + " n'est pas ouverte");
        else{
            this.pDans = null;
            p.pContenue = null;
            System.out.println("SUCCES : On retire la poupée " + this.nom + " de " + p.nom + " avec succès");
        }
    }

}
