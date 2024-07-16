enum UnidadeTemperatura {
    CELSIUS, FAHRENHEIT, KELVIN
}

@FunctionalInterface
interface Conversao {
    double converter(double valor);
}

class Conversor {
    private static final Map<String, Conversao> CONVERSOES = new HashMap<>();

    static {
        CONVERSOES.put("C_TO_F", valor -> valor * 9 / 5 + 32);
        CONVERSOES.put("F_TO_C", valor -> (valor - 32) * 5 / 9);
        CONVERSOES.put("C_TO_K", valor -> valor + 273.15);
        CONVERSOES.put("K_TO_C", valor -> valor - 273.15);
        CONVERSOES.put("F_TO_K", valor -> (valor - 32) * 5 / 9 + 273.15);
        CONVERSOES.put("K_TO_F", valor -> (valor - 273.15) * 9 / 5 + 32);
    }

    public double converterTemperatura(double valor, UnidadeTemperatura unidadeOrigem, UnidadeTemperatura unidadeDestino) {
        String chaveConversao = unidadeOrigem.name().charAt(0) + "_TO_" + unidadeDestino.name().charAt(0);
        Conversao conversao = CONVERSOES.get(chaveConversao);
        
        if (conversao == null) {
            throw new IllegalArgumentException("Unidades de conversão inválidas");
        }

        return conversao.converter(valor);
    }
}
