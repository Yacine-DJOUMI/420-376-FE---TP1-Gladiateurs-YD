    package personnages;

public class Personnage {

    private String nom;
    private int pointsDeVie;
    private int valeurMaxAttaque;
    private int valeurDefense;
    private int initiative;
    
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
    }
        

    public Personnage() {
        this.nom = "";
        this.pointsDeVie = 0;
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.initiative = 0;
    }
public String getNom(){
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }
     
    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }    
    
    
    public void afficherInfosPersonnage() {
        System.out.println("Nom : " + nom);
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("Defense : " + valeurDefense);
        System.out.println("Points de vie : " + pointsDeVie);
        System.out.println("Initiative : " + initiative);
        if (pointsDeVie <= 0) {
        System.out.println("Statut : Mort");
    } else {
        System.out.println("Statut : En vie");
    }
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold
}

