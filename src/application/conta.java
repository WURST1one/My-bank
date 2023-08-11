package application;

public class conta {

	int numero;
	String titular; 
	double saldo;
	double deposito;
	
	
	boolean sacar (double quantidade) {
		
		if(this.saldo < quantidade) {
			return false;
					
		}else {
			this.saldo -= quantidade;
			return true;
		}
	}
	
	

	void deposito (double quantidade) {
		this.saldo += quantidade;
	}
}
