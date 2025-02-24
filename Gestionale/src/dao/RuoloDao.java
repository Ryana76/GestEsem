package dao;

//- RuoloDao, con attributi e metodi simili a ImpiegatoDao, quindi
//        un arrayList di Ruolo, e i metodi per aggiungere, aggiornare, eliminare e
//        ricercare un ruolo tramite idRuolo (identifica in modo univoco il ruolo).
//        Quando stai aggiongendo se gia esiste idRuolo non puo aggiungere

import model.Ruolo;

import java.util.ArrayList;

public class RuoloDao {
    private ArrayList<Ruolo> listaRuoli = new ArrayList<>();


    public boolean ricercaPerId(int idRuolo) {
        for (Ruolo idR : listaRuoli) {
            if (idR.getIdRuolo() == idRuolo) {
                System.out.println("Ruolo con ID: " + idRuolo + " Esiste");
                return true;
            }
        }
        return false;
    }

    public void inserisciRuolo(Ruolo ruolo) {
        if (ruolo != null && !ricercaPerId(ruolo.getIdRuolo())) {
            listaRuoli.add(ruolo);
        }
    }


    public void aggiornaRuolo(Ruolo ruolo, String descrizione) {
        for (Ruolo ruoloInList : listaRuoli) {
            if (ruoloInList.getIdRuolo() == ruolo.getIdRuolo()) {
                ruoloInList.setDescrizione(descrizione);
                System.out.print("aggiornamento effettuato" + ruoloInList);
            }
        }
    }


    public void eliminaRuolo(Ruolo ruolo) {
        for (Ruolo ruoloInList : listaRuoli) {
            if ((ruoloInList.getIdRuolo() == ruolo.getIdRuolo()) && ricercaPerId(ruolo.getIdRuolo())) {
                listaRuoli.remove(ruolo);
                System.out.println("Ruolo con ID: " + ruolo.getIdRuolo() + " eliminato");
                return;
            }
        }
        System.out.println("Ruolo con ID: " + ruolo.getIdRuolo() + " non trovato");
    }


    @Override
    public String toString() {
        return "RuoloDao{" +
                "listaRuoli = \n" + listaRuoli +
                '}';
    }
}
