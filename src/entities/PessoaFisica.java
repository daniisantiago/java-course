package entities;

public class PessoaFisica extends Pessoa{
	private Double gastosSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double calcularImposto() {
		double imposto = 0.0;
		if(getRendaAnual() < 20000.0) {
			imposto = getRendaAnual() * 0.15;
		}else {
			imposto = getRendaAnual() * 0.25;
		}
		if(gastosSaude > 0) {
			imposto -= gastosSaude * 0.5;
		}
		return imposto;
	}
	
}
