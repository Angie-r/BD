package com.basedatos.bd.wsint;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/estudiante")
	public List<Estudiantes> buscarEstudiante();
	
	@PostMapping("guardarEstudiante")
	public Estudiantes guardar(@RequestBody Estudiantes estudiantes);
	
	@GetMapping("/grado")
	public List<Grado> buscarGrado();
	
	@PostMapping("guardarGrado")
	public Grado guardar(@RequestBody Grado grado);

	@GetMapping("/clientes")
	public List<Cliente> buscarCliente();
	
	@PostMapping("guardarCliente")
	public Cliente guardar(@RequestBody Cliente cliente);
	
	@GetMapping("/compras")
	public List<Compras> buscarCompras();
	
	@PostMapping("guardarCompras")
	public Compras guardar(@RequestBody Compras compras);

}
