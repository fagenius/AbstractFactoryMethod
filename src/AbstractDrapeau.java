public abstract class AbstractDrapeau {
    private String couleur1;
    private String couleur2;
    private String couleur3;
    private String etoile;

    public static final String EOL = System.getProperty("line.separator");

    public String getCouleur1() {
        return couleur1;
    }

    public void setCouleur1(String couleur1) {
        this.couleur1 = couleur1;
    }

    public String getCouleur2() {
        return couleur2;
    }

    public void setCouleur2(String couleur2) {
        this.couleur2 = couleur2;
    }

    public String getCouleur3() {
        return couleur3;
    }

    public void setCouleur3(String couleur3) {
        this.couleur3 = couleur3;
    }

    public String getEtoile() {
        return etoile;
    }

    public void setEtoile(String etoile) {
        this.etoile = etoile;
    }

    public String toString() {
        return getCouleur1() + EOL + getCouleur2() + EOL + getCouleur2() + EOL + getEtoile()+ EOL;
    }
}
