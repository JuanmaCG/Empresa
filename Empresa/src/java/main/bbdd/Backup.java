package bbdd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import laboral.DatosNoCorrectosException;
import laboral.Empleado;

public class Backup {

	BBDD bbdd;

	public Backup(BBDD bbdd) {
		super();
		this.bbdd = bbdd;
	}
	
	public void backupbbddafichero() throws ClassNotFoundException, IOException, SQLException, DatosNoCorrectosException {
		File backup = new File("backup.txt");
		BufferedWriter wr = new BufferedWriter(new FileWriter(backup,false));
		
		for(Empleado empleado : bbdd.mostrarEmpleados()) {
			wr.write(empleado.toString() + "\n");
		}
		
		wr.close();
	}
	
	
}
