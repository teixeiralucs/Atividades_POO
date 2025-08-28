package ATIVIDADE_2;

class Contact {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("==========================================================");
		System.out.println("Primeiro Modelo:");
		Contact[] contacts = new Contact[10];
		while (x < 10) {
		    contacts[x] = new Contact();
		    System.out.println(contacts[x]);
		    x = x + 1;
		}
		System.out.println("==========================================================");
		System.out.println("Segundo Modelo:");
		Contact contactRef;
		while (x < 10) {
		    contactRef = new Contact();
		    System.out.println(contactRef);
		    x = x + 1;
		}
	}
}