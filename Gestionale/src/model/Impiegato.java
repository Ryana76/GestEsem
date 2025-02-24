package model;


/*
Creare un package chiamato model
Creare una classe chiamata Impiegato, con i campi nome, cognome, codicefiscale,
Matricola (intero), con i relativi metodi per valorizzarli e leggerli (get/set)
*/



public class Impiegato {


    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int matricola;


    /**
     *
     * @param nome nome impiegato
     * @param cognome cognome impiegato
     * @param codiceFiscale codice fiscale impiegato
     * @param matricola matricola di impiegato
     */
    public Impiegato(String nome, String cognome, String codiceFiscale, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nImpiegato { " +
                "nome = '" + nome + '\'' +
                ", cognome = '" + cognome + '\'' +
                ", codiceFiscale = '" + codiceFiscale + '\'' +
                ", matricola = " + matricola +
                " }";
    }

}
