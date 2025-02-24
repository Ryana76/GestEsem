package dao;
/*
        Creare un package chiamato dao
        Creare una classe chiamata ImpiegatoDao
        Nella classe ImpiegatoDao, aggiungere un arrayList di tipo Impiegato, chiamato
        listaImpiegato.
        Nelle classe ImpiegatoDao, aggiungere i seguenti metodi:
        - ricercaPerCodiceFiscale
        - inserisci
        - aggiorna
        - elimina
*/

import model.Impiegato;

import java.util.ArrayList;

public class ImpiegatoDao {
    private final ArrayList<Impiegato> listaImpiegati = new ArrayList<>();

//    - ricercaPerCodiceFiscale, prende in ingresso un codice fiscale cerca
//    Un impiegato, dentro listaImpiegato, con quel codice. Ritornare l'impiegato
//    Cercato, altrimenti null.
    public boolean ricercaPerCodiceFiscale(String codiceFiscale) {
        for (Impiegato impiegato : listaImpiegati){
            if(impiegato.getCodiceFiscale().equals(codiceFiscale)){
                System.out.println("impiegato con codice fiscale: " + codiceFiscale +
                        " Esiste con nome: " + impiegato.getNome());
                return true;
            }
        }


        return false;
    }


//    - inserisci, prende in ingresso un'istanza i di Impiegato e l'aggiunge in
//    listaImpiegato.
    public void inserisci(Impiegato impiegato){
        if(impiegato!=null && !ricercaPerCodiceFiscale(impiegato.getCodiceFiscale())){
            listaImpiegati.add(impiegato);
        }
    }


//    - aggiorna, prende in ingresso un'istanza i di Impiegato, la cerca, tramite
//    Codice fiscale in listaImpiegato, e se la trova aggiorna il contenuto con l'istanza
//        i. Ritornare vero, se l'istanza è stata trovata.
    public void aggiorna(Impiegato impiegato, String nome, String cognome, int matricola){
        for(Impiegato imp: listaImpiegati){
            if(impiegato.getCodiceFiscale().equals(imp.getCodiceFiscale())){
                imp.setNome(nome);
                imp.setCognome(cognome);
                imp.setMatricola(matricola);
                System.out.println("aggiornamento effettuato"+impiegato);
            }
        }
    }


//        - elimina, prende in ingresso un codice fiscale e cerca, dentro listaImpiegato,
//        Un impiegato con quel codice fiscale. Se lo trova lo elimina. Ritorna vero se
//        Ha trovato un impiegato con quel codice.
    public void elimina(String codiceFiscale) {
        for(Impiegato impiegato: listaImpiegati){
            if(impiegato.getCodiceFiscale().equals(codiceFiscale)){
                listaImpiegati.remove(impiegato);
                System.out.println("impiegato con codice fiscale: "+codiceFiscale+" eliminato");
                return;
            }
        }
        System.out.println("Impiegato con codice fiscale"+codiceFiscale+" non trovato");
    }

    @Override
    public String toString() {
        return "ImpiegatoDao{" +
                "listaImpiegati=" + listaImpiegati +
                "\n}";
    }
}

