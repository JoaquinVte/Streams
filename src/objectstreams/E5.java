package objectstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E5 {

	private static String fichero = "objetos_fichero.txt";

	public static void main(String[] args) {

		Persona p = new Persona("Joaquin", 43);

		store(p);
		Persona pFile = load();
		
		System.out.println(pFile);

	}

	private static Persona load() {
		
		Persona p = null;
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

			p = (Persona)ois.readObject();
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	private static void store(Persona p) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {

			oos.writeObject(p);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
