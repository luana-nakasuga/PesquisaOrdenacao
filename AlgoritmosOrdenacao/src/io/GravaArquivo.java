package io;
import java.io.*;
/**
 * @author Cinthia
 *
 * TODO Esta classe cria um objeto que e um arquivo para gravacao 
 */
public class GravaArquivo {
	private FileWriter writer;
	private PrintWriter saida;
	/**
	 * Construtor da classe
	 * @param nome => nome do arquivo que sera aberto para gravacao
	 * @throws IOException => Excecao se houver algum problema se o 
	 * 					 arquivo nao puder ser aberto para gravacao
	 */
	public GravaArquivo (String nome) throws IOException{
		try{
			// false significa que se o arquivo ja existir, ele sera sobrescrito
			// caso queira acrescentar dados ao final do arquivo, deve usar true
			writer = new FileWriter(new File(nome), false);
			saida = new PrintWriter (writer);
		}
		catch (IOException e){
			throw new IOException ("ARQUIVO NAO PODE SER ABERTO PARA GRAVACAO");
		}
	}
	/**
	 * Este metodo grava uma String qualquer em um arquivo tipo texto
	 * @param str => String a ser gravada no arquivo
	 */
	public void gravaArquivo (String str)	{
			this.saida.print(str);
	}
	/**
	 * Metodo para fechar o arquivo de gravacao
	 * @throws IOException => Excecao, se ocorrer erro ao fechar o arquivo.
	 */
	public void fechaArquivo ()throws IOException{
		try{
			this.saida.close();
			this.writer.close();
		}
		catch (IOException e){
			throw new IOException ("ERRO AO FECHAR O ARQUIVO");
		}
	}
}
