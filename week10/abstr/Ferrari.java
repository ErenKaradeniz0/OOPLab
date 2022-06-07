package week10.abstr;



public class Ferrari  extends Araba implements ICabrio{

	@Override
	public void TavanTipi() {
		System.out.println("Metal Tavan");
		
	}

	@Override
	public void MaxSpeed() {
		System.out.println("Ferrar, max h�z� 350 km/h dir");
		
	}



	public static void main(String[] args) {
		Ferrari f1=new Ferrari();
		f1.MaxSpeed();
		f1.TavanTipi();
		f1.EngineVoice();
	}

}
