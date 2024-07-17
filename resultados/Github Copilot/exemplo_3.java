public class FormasGeometricas {
    
    interface FormaGeometrica {
        double calcularArea();
        double calcularPerimetro();
    }
    
    class Retangulo implements FormaGeometrica {
        private double largura;
        private double altura;
    
        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }
    
        @Override
        public double calcularArea() {
            return largura * altura;
        }
    
        @Override
        public double calcularPerimetro() {
            return 2 * (largura + altura);
        }
    }
    
    class Quadrado implements FormaGeometrica {
        private double lado;
    
        public Quadrado(double lado) {
            this.lado = lado;
        }
    
        @Override
        public double calcularArea() {
            return lado * lado;
        }
    
        @Override
        public double calcularPerimetro() {
            return 4 * lado;
        }
    }

    public static void main(String[] args) {
        double larguraRetangulo = 5;
        double alturaRetangulo = 3;
        System.out.println("Área do retângulo: " + calcularAreaRetangulo(larguraRetangulo, alturaRetangulo));
        System.out.println("Perímetro do retângulo: " + calcularPerimetroRetangulo(larguraRetangulo, alturaRetangulo));
        
        double ladoQuadrado = 4;
        System.out.println("Área do quadrado: " + calcularAreaQuadrado(ladoQuadrado));
        System.out.println("Perímetro do quadrado: " + calcularPerimetroQuadrado(ladoQuadrado));
    }
}