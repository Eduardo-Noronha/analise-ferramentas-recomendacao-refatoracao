class Biblioteca {
    private List<Livro> livros;

    public int contarLivrosPorAutor(Autor autor) {
        int count = 0;
        for (Livro livro : livros) {
            if (livro.getAutor().equals(autor)) {
                count++;
            }
        }
        return count;
    }
}

class Livro {
    private String titulo;
    private Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}

class Autor {
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Autor autor = (Autor) obj;
        return Objects.equals(nome, autor.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
