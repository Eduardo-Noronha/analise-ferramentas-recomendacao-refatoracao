    class Conversor {
    public double converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        // Conversão de Celsius para Fahrenheit
        if (unidadeOrigem.equals("C") && unidadeDestino.equals("F")) {
            return valor * 9/5 + 32;
        }

        // Conversão de Fahrenheit para Celsius
        if (unidadeOrigem.equals("F") && unidadeDestino.equals("C")) {
            return (valor - 32) * 5/9;
        }

        // Conversão de Celsius para Kelvin
        if (unidadeOrigem.equals("C") && unidadeDestino.equals("K")) {
            return valor + 273.15;
        }

        // Conversão de Kelvin para Celsius
        if (unidadeOrigem.equals("K") && unidadeDestino.equals("C")) {
            return valor - 273.15;
        }

        // Conversão de Fahrenheit para Kelvin
        if (unidadeOrigem.equals("F") && unidadeDestino.equals("K")) {
            return (valor - 32) * 5/9 + 273.15;
        }

        // Conversão de Kelvin para Fahrenheit
        return converteKelvin(valor, unidadeOrigem, unidadeDestino);
    }

	private double converteKelvin(double valor, String unidadeOrigem,
			String unidadeDestino) {
		if (unidadeOrigem.equals("K") && unidadeDestino.equals("F")) {
            return (valor - 273.15) * 9/5 + 32;
        }

        throw new IllegalArgumentException("Unidades de conversão inválidas");
	}
}