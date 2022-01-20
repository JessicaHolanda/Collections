public class Pessoa {

    private String nome;
    private Integer idade;

    private Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public static class Builder {
        private String nome;
        private Integer idade;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder idade(Integer idade) {
            this.idade = idade;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(
                    this.nome,
                    this.idade
            );
        }
    }
}
