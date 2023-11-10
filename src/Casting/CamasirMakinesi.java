package Casting;

public class CamasirMakinesi  extends Makine{
	public double deterjan_miktari;

	public CamasirMakinesi(String isim,double deterjan_miktari) {
		super(isim);
		this.deterjan_miktari=deterjan_miktari;
		
	}
	public int kapasite() {
		return 7;
		
		
	}
	@Override
	public void caliştir() {
		// TODO Auto-generated method stub
		System.out.println(this.deterjan_miktari + " kg deterjan ile çamasır yıkamaya başladı.");
	}
	@Override
	public void durdur() {
		// TODO Auto-generated method stub
	    System.out.println(this.kapasite() + " kilo çamaşır yıkandı.");;
	}

}
