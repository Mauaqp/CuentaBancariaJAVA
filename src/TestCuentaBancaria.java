
public class TestCuentaBancaria {
	public static void main(String[] args) {
		
	CuentaBancaria user1 = new CuentaBancaria();
	CuentaBancaria user2 = new CuentaBancaria();
	CuentaBancaria user3 = new CuentaBancaria();
	CuentaBancaria user4 = new CuentaBancaria();
	System.out.println("--- DEPÓSITOS ---");
	user1.depositoCuenta("Ahorros", 600.00);
	user2.depositoCuenta("checking", 500.00);
	user3.depositoCuenta("Ahorros", 2000.50);
	user4.depositoCuenta("Ahorros", 17508010.50);
	System.out.println("--- RETIROS ---");
	user1.retiroCuenta("Checking", 70.00);
	user2.retiroCuenta("checking", 2000.00);
	user3.retiroCuenta("Ahorros", 1000.00);
	user4.retiroCuenta("ahorros", 16000000.00);
	System.out.println("--- BALANCES FINALES ---");
	user2.miBalance();
	user1.miBalance();
	user3.miBalance();
	user4.miBalance();
	}
}
