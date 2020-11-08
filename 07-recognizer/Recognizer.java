class Recognizer{
	int varExpected = 1;
	boolean 
	check1(int a){
			if(a == 1){
				this.varExpected = 2;
				return true;
			}
			this.varExpected = 2;
			return false;
		}
	check2(int a){
			if(a == 2){
				this.varExpected = 3;
				return true;
			}
			this.varExpected = 3;
			return false;
		}
	check3(int a){
			if(a == 3){
				this.varExpected = 4;
				return true;
			};
			this.varExpected = 4;
			return false;
		}
	check4(int a){
			if(a == 4){
				this.varExpected = 1;
				return true;
			}
			this.varExpected = 1;
			return false;
		}

	nextExpectedInt(){
			return this.varExpected;
		}
	
	reset(){
		this.varExpected = 1;
		}

	

	}
