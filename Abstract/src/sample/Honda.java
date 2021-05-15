package sample;

public class Honda extends Bike {

	@Override
	public void getName() {
		System.out.println("Bike");
		
	}
	public static void main(String args[]) {
		Honda h =new Honda();
		h.getName();
		h.show();
		
		Bike b =new Honda();
		b.getName();
		b.show();
		b.Model();
	}
	@Override
	public void Model() {
System.out.println("RS100");
		
	}

}
