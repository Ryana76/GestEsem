# GestEsem
Creare un dynamic project web chiamato Gestionale.

Creare un package chiamato model

Creare una classe chiamata Impiegato, con i campi nome, cognome, codicefiscale,

Matricola (intero), con i relativi metodi per valorizzarli e leggerli (get/set)

Creare un package chiamato dao

Creare una classe chiamata ImpiegatoDao

Nella classe ImpiegatoDao, aggiungere un arrayList di tipo Impiegato, chiamato

listaImpiegato.

Nelle classe ImpiegatoDao, aggiungere i seguenti metodi:

- ricercaPerCodiceFiscale, prende in ingresso un codice fiscale  cerca

Un impiegato, dentro listaImpiegato, con quel codice. Ritornare l'impiegato

Cercato, altrimenti null.

- inserisci, prende in ingresso un'istanza i di Impiegato e l'aggiunge in

listaImpiegato.

- aggiorna, prende in ingresso un'istanza i di Impiegato, la cerca, tramite

Codice fiscale in listaImpiegato, e se la trova aggiorna il contenuto con l'istanza

i. Ritornare vero, se l'istanza è stata trovata.







dentro package model, creare le seguenti classi:

Ruolo, con i campi idRuolo, descrizione, e i relativi get/set

Storico, con i campi idStorico, matricola, idRuolo, DataInizio, DataFine

dentro package dao, creare le seguenti classi:

- RuoloDao, con  attributi e  metodi simili a ImpiegatoDao, quindi

un arrayList di Ruolo, e i metodi per aggiungere, aggiornare, eliminare e

ricercare un ruolo tramite idRuolo (identifica in modo univoco il ruolo).

- StoricoDao, con  attributi e  metodi simili a ImpiegatoDao, quindi

un arrayList di Storico, e i metodi per aggiungere, aggiornare, eliminare e

ricercare uno storico tramite idStorico (identifica in modo univoco lo storico).

Dentro ogni classe, creare un main per testarla.


 Creare un main per testare il nostro progetto
