package ejemplos;

import java.util.ArrayList;

import clases.Alumno;

public class ArrayListAlumnos {
	private ArrayList<Alumno> alumnos;
	
	public ArrayListAlumnos(){
		alumnos = new ArrayList<Alumno>();
		Alumno a = new Alumno("20016545464","Juan","Perez",15,"M");
		Alumno b = new Alumno("20016545464","Pedro","Perez",15,"M");
		Alumno c = new Alumno("20016545464","Maria","Perez",15,"F");
		Alumno d = new Alumno("20016545464","Simon","Rodriguez",15,"M");
		Alumno e = new Alumno("20016545464","Laura","Perez",15,"F");
		
		alumnos.add(a);//0
		alumnos.add(b);//1
		alumnos.add(c);//2
		alumnos.add(d);//3
		alumnos.add(e);//4
		alumnos.add(new Alumno("20016545464","Patricia","Perez",15,"F"));
		
		alumnos.remove(3);
		
		for(int i = 0; i<alumnos.size(); i++){
			System.out.println(alumnos.get(i).toString());
		}	
	}

	public static void main(String[] args) {
		new ArrayListAlumnos();
	}

}
