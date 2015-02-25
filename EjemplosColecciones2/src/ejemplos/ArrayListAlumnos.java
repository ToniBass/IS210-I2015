package ejemplos;

import java.util.ArrayList;

import clases.Alumno;

public class ArrayListAlumnos {
	private ArrayList<Alumno> alumnos;
	
	public ArrayListAlumnos(){
		alumnos = new ArrayList<Alumno>();
		Alumno a = new Alumno("20013546540","Pedro","Martinez",12,"M");
		Alumno b = new Alumno("20013546541","Juan","Perez",12,"M");
		Alumno c = new Alumno("20013546542","Rodrigo","Martinez",12,"M");
		Alumno d = new Alumno("20013546543","Maria","Martinez",12,"F");
		Alumno e = new Alumno("20013546544","Raul","Martinez",12,"M");
		
		alumnos.add(a);//0
		alumnos.add(b);//1
		alumnos.add(c);//2
		alumnos.add(d);//3
		alumnos.add(e);//4
		alumnos.add(new Alumno("20013546544","Transito","Martinez",12,"M")); //5
		
		alumnos.remove(3);
		
		for(int i=0;i<alumnos.size(); i++){
			System.out.println(alumnos.get(i).toString());
		}
		
		
	}
	
	public static void main(String[] args) {
		new ArrayListAlumnos();
	}

}
