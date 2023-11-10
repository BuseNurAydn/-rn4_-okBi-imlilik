package Casting;

public class MainClass {

	public static void main(String[] args) {
		Makine m = new Makine("makine");
		CamasirMakinesi cm = new CamasirMakinesi("çamaþýr makinesi",3.5);
		m.caliþtir();
		m.durdur();
		cm.caliþtir();
		cm.durdur();
		
		System.out.println("********************");
        // upcasting //
		Makine m1 = new CamasirMakinesi("Çamasýr Makinesi",2.8);
		m1.caliþtir();
		m1.durdur();
		System.out.println(m1.isim); //alt sýnýfýn metodlarýna ve özelliklerine eriþemez.
		                             //alt sýnýfýn override edilmiþ metodlarýna eriþebilir.
		
		System.out.println("********************");
	//downcasting//
		Makine m2 = new CamasirMakinesi("Çamaþýr Makinesi",1.5);
		CamasirMakinesi cm1 =  (CamasirMakinesi) m2 ;
		cm1.caliþtir();
		cm1.durdur();
		
		
		
		
		
		
		
		
		
		
	}

}
