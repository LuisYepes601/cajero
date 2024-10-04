
public class CuentaBancaria {
    private int numero;
    private double monto;
    public CuentaBancaria() {
        this.numero = (int) ((Math.random()*1000000000)*320000000);
        this.monto = 0;
    }
    public int  getNumero() {
        return numero;
    }
    public void setNumero(int  numero) {
        this.numero = numero;
    }
  
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
