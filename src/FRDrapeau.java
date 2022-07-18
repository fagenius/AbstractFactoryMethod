public class FRDrapeau extends AbstractDrapeau{
    private static final String PAYS = "FRANCE";

    public String toString() {
        return getCouleur1() + EOL + getCouleur2()+ EOL +getCouleur3() + EOL+ PAYS + EOL;
    }

}