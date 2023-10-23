package org.generation.getUsers.service;

import java.util.ArrayList;

import org.generation.getUsers.model.User;
import org.springframework.stereotype.Service;

/*
 * Haremos dos cosas:
 * 1. Emular la base de datos mediante un arrayList el cual nos servira para realizar la consulta
 * 2. Definir las operaciones del CRUD(create, read, update, delete). En este caso solo utilizaremos read(GET)
 * 
 * Para definir que una clase es SERVICIO utilizamos la notacion @Service e importamos desde spring freamWork
 */
@Service
public class UserService {
	//1. Crear una lista de objetos y debe contener los atributos definidos en model, para elllo inicializo una variable de tipo CONSTANTE.
	
	public final ArrayList <User> listaUsuarios = new ArrayList <User>();
	
	//Instanciando usuarios y agregandolas a mi lista en un metodo
	public UserService(){
		listaUsuarios.add(new User(1L, "Aarón", "Silva", "Las Varas", "aaron@mail.com", "09876789"));
		listaUsuarios.add(new User(2L, "Alberto", "Enriquez", "Saucillo", "alberto@gmail.com", "9807654512"));
		listaUsuarios.add(new User(3l, "Vanessa", "Gutierrez", "Delicias", "vanessa@gmail.com", "6569870098"));
		listaUsuarios.add(new User(4L, "Alejandra", "Piedra", "Yucatán", "ale@gatito.com", "9933720000"));
		listaUsuarios.add(new User(5L, "Alicia", "Diaz", "Guadalajara", "alicia@mail.com", "3411234567"));
		listaUsuarios.add(new User(6L, "Carolina", "Herrera", "Michoacan", "ankareta@gmail.com", "3531234567"));
		listaUsuarios.add(new User(7L, "Antonio", "Salcido", "Guadalajara, Jal", "antonio@mail", "7755664411"));
		listaUsuarios.add(new User (8L, "Ernesto", "Santillan", "Guadalajara", "skjadhasd@mail.com", "5534756976"));
		listaUsuarios.add(new User(9L, "Brandon", "Palacios", "Hidalgo", "brandon@mail.com", "7751234567"));
		listaUsuarios.add(new User(10L, "Kenia", "Montalvo", "Nuevo León", "kenia@gmail.com", "1234569878"));
		

		
	}
	
	/*Metodos CRUD para poder iterar sobre nuestros usuarios
	 * 
	 * CRUD. Operaciones que permiten  manipular la informacion.
	 * C (Create). Crear algo POST para mandarlo al servidor.
	 * R (Read). Leer algo    GET para recibirlo desde el servidor.
	 * U (Update) Actualiar   Put para modificar/actualizar lo que ya existe en el servidor
	 * D (Delete) Borrar algo. DELETE para borrar algo de nuestro servidor.
	 */
	
	//Metodo que me permita retornar (enviar) todos los usuarios al controller
	public ArrayList<User>enviarUsuarios(){
		return listaUsuarios;
	}


}
