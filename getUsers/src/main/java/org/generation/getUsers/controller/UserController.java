package org.generation.getUsers.controller;

import java.util.ArrayList;

import org.generation.getUsers.model.User;
import org.generation.getUsers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * El controller se encarga de gestionar las solicitudes HTTP. Para decirle que esta clase es de tipo controller, debemos utilizar la anotacion @RestController
 * 
 * La anotacion @RequestMapping nos permite construir la ruta (endpoints) de nuestra API.
 * Aqui vamos a manejar la peticion GET de la lista de usuarios mediante la anotacion @GetMapping
 * Inyectamos dependencias @Autowired sin necesidad de recurrir a clases extendidas.
 * @RequesMapping
 *       @GetMapping
 *       @PostMapping
 *       @PutMapping
 *       @DeletMapping 
 *       
 * 
 */

@RestController //le digo a Spting boot que este es un controlador de API del tipo REST.
@RequestMapping(path = "/api/users") // http://localhost:8080....
public class UserController {
	//Definir una instancia de UserService. Le digo a spring boot que voy a conectar mi UserController con mi UserService, para que el controlador sepa que lo voy a inyectar.
	
	private final UserService userService;
	
	//Crear un constructor que va a tomar mi objeto (UserService)  como un argumento y luego ese objeto se va a almacenar en una variable de this.
	//El constructor toma el objeto y luego se realiza la inyeccion de dependencia mediante la anotacion @Autowired
	@Autowired
	public UserController(UserService userService) {
		this.userService= userService;
	}
	
	//Debo mostrar a mi controller lo que se puede hacer desde el Service y aqui tengo que anotar @GetMapping 
	@GetMapping
	public ArrayList<User> getUsers(){
		return userService.enviarUsuarios();
	}
	
	
	
	
	
	
	
	
	
	
	

}
