import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class lercsv{

   
	public static void main(String[] args) {
		int tamanho=10;
	 	participante p[]=new participante[tamanho];
	 	for (int i =0;i<p.length;i++) {
	 		p[i]=new participante();
	 		p[i].setNome("null");
	 		p[i].setEmail("null");
	 		p[i].setNumPart(0);
	 	}
		//abre um arquivo e cria um file
		File arquivoCSV = new File("C:\\participantes.csv");
        
        try{
        	//cria um scanner para ler o arquivo
            Scanner ler = new Scanner(arquivoCSV);
            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivo = new String();
            //percorre todo o arquivo
            int contador=0;
            while(ler.hasNext()){
            	//recebe cada linha do arquivo
                linhasDoArquivo = ler.nextLine();
                //separa os campos entre as virgulas de cada linha
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                p[contador].setNome(valoresEntreVirgulas[0]);
                p[contador].setEmail(valoresEntreVirgulas[1]);
                p[contador].setNumPart(contador);
                System.out.println(p[contador].toString());
                contador++;
            	}
        
        	}catch(FileNotFoundException e){
            
        }
        
    }
    
}
