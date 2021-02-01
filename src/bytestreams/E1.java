package bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1 {

	public static void main(String[] args) {

		String fichero_entrada = "mi_fichero.txt";
		String fichero_salida = "out_fichero.txt";

		try (FileInputStream fis = new FileInputStream(fichero_entrada); FileOutputStream fos = new FileOutputStream(fichero_salida)) {

			int c;
			
			while((c=fis.read())!=-1) {
				
				System.out.printf(String.format("%16s\n", 
			            Integer.toBinaryString(c)).replaceAll(" ", "0"));
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
