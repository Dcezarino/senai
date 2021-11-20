package bancoinvest;

public class Cliente {

	private Integer agencia;
	private Integer conta;
	private String cpf;
	private String nome;
	private String nascimento;
	private String endereco;
	private String telefone;
	private float saldo;
	private String senha;
	private ContaCorrente contaCorrente;

	public Cliente(Integer agencia, Integer conta, String cpf, String nome, String nascimento, String endereco,
			String telefone, float saldo, String senha, ContaCorrente contaCorrente) {
		this.agencia = agencia;
		this.conta = conta;
		this.cpf = cpf;
		this.nome = nome;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.saldo = saldo;
		this.senha = senha;
		this.contaCorrente = contaCorrente;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public float getSaldo() {
		return saldo;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public void MostrarCliente() {

		System.out.println("=====================Dados Cliente=================");

		System.out.println("Ag�ncia: " + getAgencia());
		System.out.println("Conta: " + getConta());
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Nascimento: " + getNascimento());
		System.out.println("Endere�o: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Senha: " + getSenha());

		System.out.println("================Dados Conta Corrente===============");

		System.out.println("N�mero Documento: " + contaCorrente.getNumero_doc_cc());
		System.out.println("Ag�ncia: " + contaCorrente.getAgencia_cc());
		System.out.println("Conta: " + contaCorrente.getConta_cc());
		System.out.println("Valor: " + contaCorrente.getValor_cc());
		System.out.println("Tipo: " + contaCorrente.getTipo_cc());
		System.out.println("Data Ocorr�ncia: " + contaCorrente.getData_ocorrencia_cc());
		System.out.println("Saldo Anterior: " + contaCorrente.getSaldo_cc());		
		System.out.println("Saldo Atualizado: " + (contaCorrente.getSaldo_cc() + contaCorrente.getValor_cc()));
		System.out.println("Mensagem: " + contaCorrente.RegistrarOcorrencia());

	}

}
