package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Repositorio {

	public void gravar(List concessionarias) throws IOException {
		FileOutputStream saidaArquivo = new FileOutputStream("pedagio.dat");
		ObjectOutputStream objetoSaida = new ObjectOutputStream(saidaArquivo);
		objetoSaida.writeObject(concessionarias);
	}

	public List ler() throws IOException, ClassNotFoundException {
		FileInputStream entradaArquivo = new FileInputStream("pedagio.dat");
		ObjectInputStream objetoEntrada = new ObjectInputStream(entradaArquivo);
		Object concessionarias = objetoEntrada.readObject();
		return (List) concessionarias;
	}

}
