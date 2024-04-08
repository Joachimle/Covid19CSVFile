public class Covid19Data {
    //Attributes
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfældeIAlt;
    private int døde;
    private int indlagtePåIntensivAfdeling;
    private int indlagte;
    private String dato;

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfældeIAlt, int døde, int indlagtePåIntensivAfdeling, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region=" + region +
                ", aldersgruppe='" + aldersgruppe + '\'' +
                ", bekræftede tilfælde i alt='" + bekræftedeTilfældeIAlt + '\'' +
                ", døde='" + døde + '\'' +
                ", indlagte på intensiv afdeling='" + indlagtePåIntensivAfdeling + '\'' +
                ", indlagte='" + indlagte + '\'' +
                ", dato='" + dato + '\'' +
                '}';
    }
}
