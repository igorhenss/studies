class Escopo {
	public int x = 0;
	public static int y = 0;

	public void teste(int x) {
		System.out.println(x);
	}

	public static void testeEstatico(int x) {
		System.out.println(y);
	}
}

class EscopoApp {
	public static void main(String... args) {
		Escopo escopo = new Escopo();
		escopo.testeEstatico(10);
	}
}