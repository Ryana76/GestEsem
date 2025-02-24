package model;

//  Storico, con i campi idStorico, matricola, idRuolo, DataInizio, DataFine


import dataPak.Data;

public class Storico {
    private int idStorico;
    private Impiegato impiegato; //serve matricola impiegato
    private Ruolo ruolo; //serve idRuolo
    private Data dataInizio;
    private Data dataFine;

    /**
     *
     * @param idStorico
     * @param impiegato
     * @param ruolo
     * @param dataInizio
     * @param dataFine
     *
     */
    public Storico(int idStorico, Impiegato impiegato, Ruolo ruolo, Data dataInizio, Data dataFine) {
        this.idStorico = idStorico;
        this.impiegato = impiegato;
        this.ruolo = ruolo;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }




    public int getIdStorico() {
        return idStorico;
    }

    public void setIdStorico(int idStorico) {
        this.idStorico = idStorico;
    }

    public Impiegato getImpiegato() {
        return impiegato;
    }

    public void setImpiegato(Impiegato impiegato) {
        this.impiegato = impiegato;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    public Data getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Data dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Data getDataFine() {
        return dataFine;
    }

    public void setDataFine(Data dataFine) {
        this.dataFine = dataFine;
    }

    @Override
    public String toString() {
        return "Storico{" +
                "idStorico=" + idStorico +
                ", impiegato=" + impiegato +
                ", ruolo=" + ruolo +
                ", dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                '}';
    }
}

