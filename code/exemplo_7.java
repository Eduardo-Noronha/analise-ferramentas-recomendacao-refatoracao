class Biblioteca {
    private List<Livro> livros;

    public int contarLivrosPorAutor(String autor) {
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
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
