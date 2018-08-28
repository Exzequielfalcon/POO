
public class Monto {
	private double imp1 = 0;
	private double imp2 = 0;
	private double imp3 = 0;
	private double imp4 = 0;
	private double imp5 = 0;
	private double gastos = 0;

	public Monto() {
		this.imp1 = RandomImp();
		this.imp2 = RandomImp();
		this.imp3 = RandomImp();
		this.imp4 = RandomImp();
		this.imp5 = RandomImp();
		this.gastos = RandomGas();
	}

	public double getImp1() {
		return imp1;
	}

	public void setImp1(double imp1) {
		this.imp1 = imp1;
	}

	public double getImp2() {
		return imp2;
	}

	public void setImp2(double imp2) {
		this.imp2 = imp2;
	}

	public double getImp3() {
		return imp3;
	}

	public void setImp3(double imp3) {
		this.imp3 = imp3;
	}

	public double getImp4() {
		return imp4;
	}

	public void setImp4(double imp4) {
		this.imp4 = imp4;
	}

	public double getImp5() {
		return imp5;
	}

	public void setImp5(double imp5) {
		this.imp5 = imp5;
	}

	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}

	public double Total() {
		double total = (imp1 + imp2 + imp3 + imp4 + imp5) - gastos;
		return total;
	}

	public double RandomImp() {
		int a = (int) (Math.random() * 10000);
		return a;
	}

	public double RandomGas() {
		int a = (int) (Math.random() * 15000);
		return a;
	}
}
