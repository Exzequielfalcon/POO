
public class Ciudad {
	private int habitantes;
	private Monto total = new Monto();
	private double dinero;

	public Ciudad(int habitantes, Monto total) {
		this.habitantes = habitantes;
		this.total = total;
	}

	public Ciudad() {
		this.habitantes = GenerateHab();
		this.dinero = Total(total);
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public Monto getTotal() {
		return total;
	}

	public void setTotal(Monto total) {
		this.total = total;
	}

	public int GenerateHab() {
		int a = (int) (Math.random() * 5000 + 300);
		return a;
	}

	public double Total(Monto total) {
		double ret = (total.getImp1() + total.getImp2() + total.getImp3() + total.getImp4() + total.getImp5())
				- total.getGastos();
		return ret;
	}

}
