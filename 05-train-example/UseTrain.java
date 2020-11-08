class UseTrain {
    public static void main(String[] args) {
        
        Train ciuf = new Train();
        ciuf.build(50,20,30);

        ciuf.reserveFirstClassSeats(10);
        ciuf.reserveSecondClassSeats(15);

        System.out.println("La percentuale dei posti a sedere TOTALE e' : " + ciuf.getTotOccupancyRatio()+"%");
        System.out.println("La percentuale dei posti a sedere della PRIMA CLASSE e' : " + ciuf.getFirstClassOccupancyRatio()+"%");
        System.out.println("La percentuale dei posti a sedere della SECONDA CLASSE e' : " + ciuf.getSecondClassOccupancyRatio()+"%");

        ciuf.deleteAllReservations();

        ciuf.reserveFirstClassSeats(15);
        ciuf.reserveSecondClassSeats(20);
        System.out.println("\n");



        System.out.println("La percentuale dei posti a sedere TOTALE e' : " + ciuf.getTotOccupancyRatio()+"%");
        System.out.println("La percentuale dei posti a sedere della PRIMA CLASSE e' : " + ciuf.getFirstClassOccupancyRatio()+"%");
        System.out.println("La percentuale dei posti a sedere della SECONDA CLASSE e' : " + ciuf.getSecondClassOccupancyRatio()+"%");



        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */
    }
}
