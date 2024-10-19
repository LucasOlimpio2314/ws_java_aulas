public class Carro {
	String marca;
	String modelo;
	double velocidade = 0;
	
	double acelerar(double velocidadeAcelerada) {
		velocidade +=velocidadeAcelerada;
		if(velocidade >= 200) {
			return velocidade = 200;
		}else {
			return velocidade;
		}
	}
	
	double frear(double velocidadeDiminuida) {
		velocidade -= velocidadeDiminuida;
		if(velocidade >= 0) {
			return velocidade;
		}else {
			return velocidade = 0;
		}
	}
	
	void exibirInformacoes(String marcaI,String modeloI) {
		marca = marcaI;
		modelo = modeloI;
		if(marca != null && modelo != null) {
			System.out.println("Marca: " + marca);
			System.out.println("Modelo: " + modelo);
			System.out.println("Velocidade Atual: " + velocidade);
		}
	}
	
}

