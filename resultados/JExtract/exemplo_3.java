package exp_3;

public class FormasGeometricas {
    
    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    public static double calcularPerimetroRetangulo(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static void main(String[] args) {
        configuraDimensoes();
        
        double ladoQuadrado = 4;
        System.out.println("Área do quadrado: " + calcularAreaQuadrado(ladoQuadrado));
        System.out.println("Perímetro do quadrado: " + calcularPerimetroQuadrado(ladoQuadrado));
    }

	private static void configuraDimensoes() {
		double larguraRetangulo = 5;
        double alturaRetangulo = 3;
        System.out.println("Área do retângulo: " + calcularAreaRetangulo(larguraRetangulo, alturaRetangulo));
        System.out.println("Perímetro do retângulo: " + calcularPerimetroRetangulo(larguraRetangulo, alturaRetangulo));
	}
}
