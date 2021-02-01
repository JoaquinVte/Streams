package characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E2 {

	public static void main(String[] args) {

		String fichero_entrada = "mi_fichero.txt";
		String fichero_salida = "out_character_fichero.txt";

		try (FileReader fis = new FileReader(fichero_entrada); FileWriter fos = new FileWriter(fichero_salida)) {

			int c;
			
			while((c=fis.read())!=-1) {
				
				System.out.printf(String.format("%16s\n", Integer.toBinaryString(c)).replaceAll(" ", "0"));
				fos.write(c);
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
