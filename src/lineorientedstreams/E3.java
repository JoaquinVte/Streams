package lineorientedstreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E3 {

	public static void main(String[] args) {

		String fichero_entrada = "mi_fichero.txt";
		String fichero_salida = "out_lineoriented_fichero.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fichero_entrada)); 
				PrintWriter pw = new PrintWriter (new FileWriter(fichero_salida))) {

			String line;
			
			while((line=br.readLine())!=null) {
				
				System.out.println(line);
				pw.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
