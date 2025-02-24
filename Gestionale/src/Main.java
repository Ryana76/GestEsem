import dao.ImpiegatoDao;
import dao.RuoloDao;
import dataPak.Data;
import model.Impiegato;
import model.Ruolo;
import model.Storico;
import dataPak.Data;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // test Class impiegato
        Impiegato impiegato1 = new Impiegato("Aryana", "Najafi", "ARYNNJF97", 1001);
        Impiegato impiegato2 = new Impiegato("Alessandro", "Zanini", "ALSZN97", 1002);
        Impiegato impiegato3 = new Impiegato("Riccardo", "Russo", "RRUSR97", 1003);
        Impiegato impiegato4 = new Impiegato("Arya", "Najafi", "RRUSR97", 1004);
        System.out.print(impiegato1);
        System.out.print(impiegato2);
        System.out.print(impiegato3);
        System.out.println(impiegato4);

        //test classe ImpiegatoDao
        ImpiegatoDao dao = new ImpiegatoDao();
        dao.inserisci(impiegato1);
        dao.inserisci(impiegato2);
        dao.inserisci(impiegato3);
        dao.inserisci(impiegato4); // non aggiungerà l'impiegato perché esiste già con codice fiscale RRSUSR97'
        System.out.println(dao);
        System.out.println("Esiste: " + dao.ricercaPerCodiceFiscale(impiegato3.getCodiceFiscale()));
        System.out.println("Esiste: " + dao.ricercaPerCodiceFiscale("ARYNNJF9"));
        dao.aggiorna(impiegato2, impiegato2.getNome(), impiegato2.getCognome(), 10022);
        dao.elimina(impiegato1.getCodiceFiscale());
        System.out.println(dao);


        // test Class Ruolo
        Ruolo ruolo1 = new Ruolo(1, "Amministratore");
        Ruolo ruolo2 = new Ruolo(2, "Operaio");
        Ruolo ruolo3 = new Ruolo(3, "Cliente");
        System.out.print(ruolo1);
        System.out.print(ruolo2);
        System.out.println(ruolo3);


        //test classe RuoloDao
        RuoloDao ruoloDao = new RuoloDao();
        ruoloDao.inserisciRuolo(ruolo1);
        ruoloDao.inserisciRuolo(ruolo2);
        ruoloDao.inserisciRuolo(ruolo3);
        System.out.println(ruoloDao);
        ruoloDao.ricercaPerId(3);
        ruoloDao.aggiornaRuolo(ruolo3, ruolo2.getDescrizione());
        ruoloDao.aggiornaRuolo(ruolo2, "Responsabile");
        ruoloDao.inserisciRuolo(new Ruolo(4, "cliente"));
        System.out.println(ruoloDao);
        ruoloDao.eliminaRuolo(ruolo1);
        ruoloDao.eliminaRuolo(ruolo1);


        //test classe Storico
        Storico storico = new Storico(30001, impiegato2, ruolo2, new Data(1, 1, 2024), new Data(24, 2, 2025));
        System.out.println(storico);
        System.out.println(storico.getDataFine());
        Data newData = new Data(1,1,2025);
        storico.setDataInizio(newData);
        System.out.println(storico.getDataInizio());


    }
}