import java.util.Random;

public class CuentaBancaria {

	private String numeroCuenta = "";
	private Double balance = 0.0;
	private Double ahorrosBalance = 0.0;
	private static int cuentasCreadas = 0;
	private static Double dineroTotal = 0.0;
	
//	Constructor
	public CuentaBancaria() {
		String numeroCuenta = nuevoNumeroCuenta();
		Double balance = 0.0;
		Double ahorrosBalance = 0.0;
		cuentasCreadas+=1;
		System.out.println("Nuevo usuario creado, numero de cuenta: " + numeroCuenta);
		System.out.println("Total de cuentas creadas: " + cuentasCreadas);
	}
	
	private String nuevoNumeroCuenta() {
		String numeros = "0123456789";
		String randomNumber = "";
				
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			char num = numeros.charAt(rand.nextInt(10));
			randomNumber += num;
		}
		numeroCuenta = randomNumber;
		return randomNumber;
	}
	
//	Depósitos
	public void depositoCuenta(String type, Double deposito) {
		if(type == "checking" || type == "Checking") {
			setBalance(getBalance() + deposito);
			dineroTotal += deposito;
		}
		if (type=="ahorros" || type== "Ahorros") {
			setAhorrosBalance(getAhorrosBalance() + deposito);
			dineroTotal += deposito;
		}
		else {
			System.out.println("Por favor, escoge un tipo apropiado de cuenta");
		}
	}
	
//	Retiros
	public void retiroCuenta(String type, Double retiro) {
		if (type == "checking" || type == "Checking") {
			if (getBalance() < retiro) {
				System.out.println("Fondos insuficientes");
			}
			else {
				setBalance(getBalance() - retiro);
				dineroTotal -= retiro;
			}
		}
		if (type=="ahorros" || type=="Ahorros") {
			if (getAhorrosBalance() < retiro) {
				System.out.println("Fondos insuficientes en tu cuenta ahorros");
			}
			else {
				setAhorrosBalance(getAhorrosBalance() - retiro);
				dineroTotal -= retiro;
			}
		}
	}
	
	
//	Balance
	
	public Double miBalance() {
		Double balanceTotal = balance + ahorrosBalance;
		System.out.println(balanceTotal);
		return balanceTotal;
	}
	
//	Getters y setters

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getAhorrosBalance() {
		return ahorrosBalance;
	}

	public void setAhorrosBalance(Double ahorrosBalance) {
		this.ahorrosBalance = ahorrosBalance;
	}
	
}
