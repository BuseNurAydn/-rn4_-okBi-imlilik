package Casting;

public class MainClass {

	public static void main(String[] args) {
		Makine m = new Makine("makine");
		CamasirMakinesi cm = new CamasirMakinesi("�ama��r makinesi",3.5);
		m.cali�tir();
		m.durdur();
		cm.cali�tir();
		cm.durdur();
		
		System.out.println("********************");
        // upcasting //
		Makine m1 = new CamasirMakinesi("�amas�r Makinesi",2.8);
		m1.cali�tir();
		m1.durdur();
		System.out.println(m1.isim); //alt s�n�f�n metodlar�na ve �zelliklerine eri�emez.
		                             //alt s�n�f�n override edilmi� metodlar�na eri�ebilir.
		
		System.out.println("********************");
	//downcasting//
		Makine m2 = new CamasirMakinesi("�ama��r Makinesi",1.5);
		CamasirMakinesi cm1 =  (CamasirMakinesi) m2 ;
		cm1.cali�tir();
		cm1.durdur();
		
		
		
		
		
		
		
		
		
		
	}

}
