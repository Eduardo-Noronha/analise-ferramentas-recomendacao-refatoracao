enum UnidadeTemperatura {
    C, F, K;
}

interface EstrategiaConversao {
    double converter(double valor);
}

class Conversor {
    private Map<Pair<UnidadeTemperatura, UnidadeTemperatura>, EstrategiaConversao> estrategias;

    public Conversor() {
        estrategias = new HashMap<>();
        estrategias.put(new Pair<>(UnidadeTemperatura.C, UnidadeTemperatura.F), valor -> valor * 9/5 + 32);
        estrategias.put(new Pair<>(UnidadeTemperatura.F, UnidadeTemperatura.C), valor -> (valor - 32) * 5/9);
        // Adicionar outras estratégias aqui
    }

    public double converterTemperatura(double valor, UnidadeTemperatura unidadeOrigem, UnidadeTemperatura unidadeDestino) {
        EstrategiaConversao estrategia = estrategias.get(new Pair<>(unidadeOrigem, unidadeDestino));
        if (estrategia == null) {
            throw new IllegalArgumentException("Unidades de conversão inválidas");
        }
        return estrategia.converter(valor);
    }
}
