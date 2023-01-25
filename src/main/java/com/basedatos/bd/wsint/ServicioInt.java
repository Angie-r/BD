package com.basedatos.bd.wsint;

import java.util.List;
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
	
	@DeleteMapping("/consultar/{id}")
	public void borrarUsuario(@PathVariable("id") Long id);
	
	@GetMapping("/estudiante")
	public List<Estudiantes> buscarEstudiante();
	
	@PostMapping("guardarEstudiante")
	public Estudiantes guardar(@RequestBody Estudiantes estudiantes);
	
	@DeleteMapping("/estudiante/{id}")
	public void borrarEstudiante(@PathVariable("id") Long id);
	
	@GetMapping("/grado")
	public List<Grado> buscarGrado();
	
	@PostMapping("guardarGrado")
	public Grado guardar(@RequestBody Grado grado);
	
	@DeleteMapping("/grado/{id}")
	public void borrarGrado(@PathVariable("id") Long id);

	@GetMapping("/clientes")
	public List<Cliente> buscarCliente();
	
	@PostMapping("guardarCliente")
	public Cliente guardar(@RequestBody Cliente cliente);
	
	@DeleteMapping("/clientes/{id}")
	public void borrarCliente(@PathVariable("id") Long id);
	
	@GetMapping("/compras")
	public List<Compras> buscarCompras();
	
	@PostMapping("guardarCompras")
	public Compras guardar(@RequestBody Compras compras);
	
	@DeleteMapping("/compras/{id}")
	public void borrarCompra(@PathVariable("id") Long id);

}
