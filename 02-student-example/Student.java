class Student {

    // ... Aggiungere qui la definizione dei campi
    String nome ;
    String cognome;
    int matricola;
    int matriculationyear;


    void build(String a, String b, int c, int d) {
        // ... Inizializzazione dei campi della classe
        this.nome = a;
        this.cognome = b;
        this.matricola = c;
        this.matriculationyear = d;
    }

    void printStudentInfo() {
        /*
         * Aggiungere i comandi per la stampa delle informazioni sullo studente
         */
         System.out.println("Il nome dello studente e': " + this.nome);
         System.out.println("Il cognome dello studente e' : " + this.cognome);
         System.out.println("La matricola dello studente e' : " + this.matricola);
         System.out.println("La MatriculationyeaR dello studente e' : " + this.matriculationyear);
    }
}
