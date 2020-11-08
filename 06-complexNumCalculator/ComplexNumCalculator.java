
class ComplexNumCalculator{
	
	int nOpDone;			// Numero Operazioni Fatte
    ComplexNum lastRes;		// L'ultimo Risultato


    void build(){
    	nOpDone = 0;
    	lastRes = new ComplexNum();
    	lastRes.build(0,0);
    	
    }

    ComplexNum add(ComplexNum a, ComplexNum b){

    	a.re += b.re;
    	a.im += b.im;

    	lastRes.re = a.re;
    	lastRes.im = a.im;

    	nOpDone++;
    	return lastRes;
    }
    ComplexNum sub(ComplexNum a, ComplexNum b){
    	a.re -= b.re;
    	a.im -= b.im;

    	lastRes.re = a.re;
    	lastRes.im = a.im;

    	nOpDone++;
    	return lastRes;
    }
    ComplexNum mul(ComplexNum a, ComplexNum b){
    	a.re = a.re * b.re;
    	a.im = a.im * b.im;

    	lastRes.re = a.re;
    	lastRes.im = a.im;

    	nOpDone++;
    	return lastRes;
    }
    ComplexNum div(ComplexNum a, ComplexNum b){
    	a.re = a.re / b.re;
    	a.im = a.im / b.im;

    	lastRes.re = a.re;
    	lastRes.im = a.im;

    	nOpDone++;
    	return lastRes;

    }











}