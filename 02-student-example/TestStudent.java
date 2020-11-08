class TestStudent {
  public static void main(String[] args) {
      Student student0 = new Student();
      /*
       * aggiornare l'invocazione del metodo build con l'aggiunta dei
       * parametri
       */
      student0.build("Matteo","Rosati",123456,2000);
      student0.printStudentInfo();

      Student student1 = new Student();
      student1.build("Luigi","Gentile",1015,2019);
      student1.printStudentInfo();

      Student student2 = new Student();
      student2.build("Simone","Bianchi",1016,2018);
      student2.printStudentInfo();

      Student student3 = new Student();
      student3.build("Andrea","Bracci",1017,2017);
      student3.printStudentInfo();



      /*
       * Creare dei nuovi oggetti relativi agli studenti:
       *
       * - Nome: Luigi Cognome: Gentile id: 1015, matriculationYear: 2019
       * - Nome: Simone Cognome: Bianchi id: 1016, matriculationYear: 2018
       * - Nome: Andrea Cognome: Bracci id: 1017, matriculationYear: 2017
       *
       * Stampare a video le informazioni relative a ciascuno studente.
       */
  }
}
