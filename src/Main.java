public class Main {

    public static void main(String[] args) {

        PoupeeRusse p1 = new PoupeeRusse("p1", 10);
        PoupeeRusse p2 = new PoupeeRusse("p2",20);
        PoupeeRusse p3 = new PoupeeRusse("p3",30);
        PoupeeRusse p4 = new PoupeeRusse("p4",40);
        p2.ouvrir(); // doit fonctionner
        p1.placerDans(p2); // doit fonctionner
        p1.sortirDe(p2); // doit fonctionner
        p3.placerDans(p4); // ne doit pas fonctionner
        p4.sortirDe(p4); // ne doit pas fonctionner
        p3.ouvrir(); // doit fonctionner
        p4.placerDans(p3); // ne doit pas fonctionner
        p4.ouvrir(); // doit fonctionner
        p3.fermer(); // doit fonctionner
        p3.placerDans(p4); // doit fonctionner
        p4.fermer(); // doit fonctionner
        p3.sortirDe(p4); // ne doit pas fonctionner
        p4.ouvrir(); // doit fonctionner
        p3.sortirDe(p4); // doit fonctionner

    }

}
