package Casting;

public class Makine {
	public String isim;
	
	public Makine (String isim) {
		this.isim=isim;
	}
	public void caliþtir() {
		System.out.println(this.isim + " çalýþýyor...");
	}
	public void durdur() {
		System.out.println(this.isim + " durdu...");
	}
	

}
