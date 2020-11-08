class Train {
	
	int nTotSeats; //(Numero dei posti totali del treno)
    int nFirstClassSeats; // (Numero dei posti in prima classe)
    int nSecondClassSeats; // (Numero dei posti in seconda classe)
    int nFirstClassReservedSeats; // (Numero dei posti in prima classe già prenotati)
    int nSecondClassReservedSeats; // (NUmero dei posti in seconda classe già prenotati)

    void build(int a, int b, int c){
    	
	    this.nTotSeats = a;
	    this.nFirstClassSeats = b;
	    this.nSecondClassSeats = c;
	    this.nFirstClassReservedSeats = 0;
	    this.nSecondClassReservedSeats = 0;


	    /*if((b + c) <= a){
	    	this.nTotSeats = a;
	    	this.nFirstClassSeats = b;
	    	this.nSecondClassSeats = c;
	    	this.nFirstClassReservedSeats;
	    	this.nSecondClassReservedSeats;
	    }
	    else
	    	System.out.println("I DATI INSERITI NON SONO COERENTI");*/
	}

	void reserveFirstClassSeats(int d){

		this.nFirstClassSeats = this.nFirstClassSeats - d;						// Diminuiscono i posti disponibili
		//this.nTotSeats = this.nTotSeats - d;
		this.nFirstClassReservedSeats = this.nFirstClassReservedSeats + d;		// Aumentano i posti prenotati
	}

	void reserveSecondClassSeats(int e){

		this.nSecondClassSeats = this.nSecondClassSeats - e;						// Diminuiscono i posti disponibili
		//this.nTotSeats = this.nTotSeats - e;
		this.nSecondClassReservedSeats = this.nSecondClassReservedSeats + e;		// Aumentano i posti prenotati
	}

	double getTotOccupancyRatio(){													// (percentuale globale di posti occupati)

		return ((double)(this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) / this.nTotSeats) * 100;
	}

	double getFirstClassOccupancyRatio(){

		return ((double)(this.nFirstClassReservedSeats) / (this.nTotSeats - this.nSecondClassSeats)) * 100;

	}
	double getSecondClassOccupancyRatio(){

		return ((double)(this.nSecondClassReservedSeats) / (this.nTotSeats - this.nFirstClassSeats)) * 100;
	}

	void deleteAllReservations(){

		this.nFirstClassReservedSeats = 0;
	    this.nSecondClassReservedSeats = 0;
	}





}