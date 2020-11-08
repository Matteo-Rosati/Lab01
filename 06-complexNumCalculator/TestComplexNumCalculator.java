class TestComplexNumCalculator {
    public static void main(String[] args) {
        
        ComplexNumCalculator casio = new ComplexNumCalculator();
        casio.build();

        ComplexNum num1 = new ComplexNum();
        num1.build(1,2);
        ComplexNum num2 = new ComplexNum();
        num2.build(2,3);

        casio.add(num1,num2);
        System.out.println("L'ultima operazione fatta e' : "+ casio.lastRes.toStringRep());
        System.out.println("\n");

        ComplexNum num3 = new ComplexNum();
        num3.build(4,5);
        ComplexNum num4 = new ComplexNum();
        num4.build(6,7);

        casio.sub(num3,num4);
        System.out.println("L'ultima operazione fatta e' : "+ casio.lastRes.toStringRep());
        System.out.println("\n");

        ComplexNum num5 = new ComplexNum();
        num5.build(8,2);
        ComplexNum num6 = new ComplexNum();
        num6.build(3,-1);

        casio.mul(num5,num6);
        System.out.println("L'ultima operazione fatta e' : "+ casio.lastRes.toStringRep());
        System.out.println("\n");

        System.out.println("Il numero di operazioni fatte e' : "+ casio.nOpDone);
        System.out.println("\n");
    
        



        /*
         * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
         *    tra numeri complessi:
         *
         * - add(1+2i, 2+3i) = 3+5i
         *
         * - sub(4+5i, 6+7i) = -2-2i
         *
         * - mul(8+2i, 3-i) = 26 - 2i
         *
         * - ... altre a piacere
         *
         * 2) Verificare il corretto valore dei campi nOpDone, lastRes
         *
         * 3) Fare altre prove con operazioni a piacere
         */
    }
}
