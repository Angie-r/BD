package com.basedatos.bd.wsint;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basedatos.bd.entity.Cliente;
import com.basedatos.bd.entity.Compras;
import com.basedatos.bd.entity.Estudiantes;
import com.basedatos.bd.entity.Grado;
import com.basedatos.bd.entity.Usuario;

@RestController
@RequestMapping("/servicio")
@CrossOrigin
public interface ServicioInt {
	
	@GetMapping("/consultar")
	public List<Usuario> buscarPersona();
	
	@PostMapping(path="guardar")
	public Usuario guardar(@RequestBody Usuario usuario);
	
	@DeleteMapping("/borrarUsuario/{id}")
	public void borrarUsuario(@PathVariable("id") Long id);
	
	@GetMapping("consultar/nombre/{nombre}")
	public List<Usuario> buscarPersonaPorNombre(@PathVariable("nombre") String nombre);
	
	@GetMapping("consultar/nombre2/{nombre}")
	public List<Map<String, Object>> buscarPorNombre(@PathVariable("nombre") String nombre);
	
	//Estudiantes y Grado
	@GetMapping("/estudiante")
	public List<Estudiantes> buscarEstudiante();
	
	@PostMapping("guardarEstudiante")
	public Estudiantes guardar(@RequestBody Estudiantes estudiantes);
	
	@DeleteMapping("/borrarEstudiante/{id}")
	public void borrarEstudiante(@PathVariable("id") Long id);
	
	@GetMapping("estudiante/ordenar/{materia}")
	public List<Estudiantes> ordenarPorNombreMateria(@PathVariable("materia")String materia);
	
	@GetMapping("estudiante/fechaAsignacion/{asignacion}")
	public List<Estudiantes> mostraFechaAsignacion(@PathVariable("asignacion")Date asignacion);
	
	@GetMapping("estudiante/contiene/{apellido}")
	public List<Estudiantes> contieneApellido(@PathVariable("apellido")String apellido);
	
	@GetMapping("estudiante/buscaNombreApellido/{nombre} {apellido}")
	public List<Estudiantes> buscaNomApelli(@PathVariable("nombre") String nombre,
										   @PathVariable("apellido")String apellido); 
	

	@GetMapping("estudiante/nombreTermina/{nombre}")
	public List<Estudiantes> nombreTermina(@PathVariable("nombre") String nombre);
	
	@GetMapping("estudiante/buscaPorGrado/{grado}")
	public List<Map<String, Object>> buscarPorGrado(@PathVariable("grado") String grado);
	
	@GetMapping("estudiante/mostrarNotas")
	public List<Map<String, Object>> mostrarNota();
	
	@GetMapping("/grado")
	public List<Grado> buscarGrado();
	
	@PostMapping("guardarGrado")
	public Grado guardar(@RequestBody Grado grado);
	
	@DeleteMapping("/grado/{id}")
	public void borrarGrado(@PathVariable("id") Long id);
	
	@PostMapping("/insertarGrado")
	public void insertarGrado(@RequestBody Grado grado); 
	
	

	@GetMapping("/clientes")
	public List<Cliente> buscarCliente();
	
	@PostMapping("guardarCliente")
	public Cliente guardar(@RequestBody Cliente cliente);
	
	@DeleteMapping("/GuardarClientes/{id}")
	public void borrarCliente(@PathVariable("id") Long id);
	
	@GetMapping("/compras")
	public List<Compras> buscarCompras();
	
	@PostMapping("guardarCompras")
	public Compras guardar(@RequestBody Compras compras);
	
	@DeleteMapping("/borrarCompras/{id}")
	public void borrarCompra(@PathVariable("id") Long id);

	

}
