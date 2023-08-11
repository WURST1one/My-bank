package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	conta minhaConta = new conta();
	conta meuSonho = new conta();
	
	minhaConta.titular = "Henrique Marchini";
	minhaConta.numero = 40028922;
	minhaConta.saldo = 2500;
	
	minhaConta.titular = "Cley Cley";
	minhaConta.numero = 22892004;
	minhaConta.saldo = 25000000.95;
	
	
	

	
	System.out.println("Saldo atual:     " +   minhaConta.saldo);
	
//	Todo: Adicionar mensagem caso o cliente não consiga sacar ou uma
//	mensagem de sucesso!
	
	if(minhaConta.sacar(3000)) {
		System.out.println("Operação efetuada com sucesso!!");
		
	}else {
		System.out.println("Erro..veri");
	}
		

	
	minhaConta.sacar(2600);
	
	System.out.println("Saldo depois de sacar:     " +   minhaConta.saldo);
	
	minhaConta.deposito(2200);
	
	System.out.println("Saldo depois de depositar:   "+  minhaConta.saldo);
	
	
	
	}
	

	
	

}
