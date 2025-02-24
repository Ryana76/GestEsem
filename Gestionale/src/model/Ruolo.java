package model;

//  Ruolo, con i campi idRuolo, descrizione, e i relativi get/set

public class Ruolo {
    private int idRuolo;
    private String Descrizione;

    /**
     *
     * @param idRuolo // the id of the role
     * @param descrizione // the descrizione
     */
    public Ruolo(int idRuolo, String descrizione) {
        this.idRuolo = idRuolo;
        Descrizione = descrizione;
    }

    public int getIdRuolo() {
        return idRuolo;
    }

    public String getDescrizione() {
        return Descrizione;
    }

    public void setDescrizione(String descrizione) {
        Descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Ruolo{" +
                "idRuolo=" + idRuolo +
                ", Descrizione='" + Descrizione + '\'' +
                "}";
    }
}
