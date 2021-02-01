package datastreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E4 {
	
	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
	    "Java T-shirt",
	    "Java Mug",
	    "Duke Juggling Dolls",
	    "Java Pin",
	    "Java Key Chain"
	};

	public static void main(String[] args) {
		
		String fichero_entrada = "datos_fichero.txt";
		String fichero_salida = "datos_fichero.txt";
		
		try ( DataInputStream dis = new DataInputStream(new BufferedInputStream (new FileInputStream(fichero_entrada)))){
			
			while(true) {
				System.out.println(dis.readDouble() + " " + dis.readInt() + " " + dis.readUTF());
			}
			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
				
		try ( DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(fichero_salida))))){
			
			for (int i = 0; i < prices.length; i ++) {
			    dos.writeDouble(prices[i]);
			    dos.writeInt(units[i]);
			    dos.writeUTF(descs[i]);
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
