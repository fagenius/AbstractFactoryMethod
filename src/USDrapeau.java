public class USDrapeau extends AbstractDrapeau{
    private static final String Couleur1 = "Treize bandes horizontales rouges et blanches";
    private static final String Couleur2 = "rectangle bleu dans le coin recouvert de 50 petites étoiles";

    private static final String PAYS = "USA";

    public String getCountry() {
        return PAYS;
    }

    public String toString() {
        return getCouleur1() + EOL + getCouleur2() + EOL + getCouleur2() + EOL + getEtoile()+ EOL+ PAYS + EOL;
    }

}
