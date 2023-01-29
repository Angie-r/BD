package com.basedatos.bd.ws;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.basedatos.bd.entity.Cliente;
import com.basedatos.bd.entity.Compras;
import com.basedatos.bd.entity.Estudiantes;
import com.basedatos.bd.entity.Grado;
import com.basedatos.bd.entity.Usuario;
import com.basedatos.bd.repository.ClienteRepository;
import com.basedatos.bd.repository.ComprasRepository;
import com.basedatos.bd.repository.EstudiantesRepository;
import com.basedatos.bd.repository.GradoRepository;
import com.basedatos.bd.repository.UsuarioRepository;
import com.basedatos.bd.service.ServicioBd;
import com.basedatos.bd.wsint.ServicioInt;

@Component
public class ServicioImp implements ServicioInt{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> buscarPersona() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario guardar(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}
	@Override
	public void borrarUsuario(Long id) {
		usuarioRepository.deleteById(id);
		
	}
	
	@Override
	public List<Usuario> buscarPersonaPorNombre(String nombre){
		return usuarioRepository.findByNombre(nombre);
	}
	
	@Autowired
	ServicioBd sb;
	
	@Override
	public List<Map<String, Object>> buscarPorNombre(String nombre){
		return sb.buscarPorNombre(nombre);
	}

	
	
	@Autowired
	EstudiantesRepository estudiantesRepository;

	@Override
	public List<Estudiantes> buscarEstudiante() {
		
		return estudiantesRepository.findAll();
	}

	@Override
	public Estudiantes guardar(Estudiantes estudiantes) {
		
		return estudiantesRepository.save(estudiantes);
	}
	
	@Override
	public void borrarEstudiante(Long id) {
		estudiantesRepository.deleteById(id);
	}
	
	@Override
	public List<Estudiantes> ordenarPorNombreMateria(String nombre) {
		
		return estudiantesRepository.findByMateriaOrderByNombreAsc(nombre);
	}
	
	@Override
	public List<Estudiantes> mostraFechaAsignacion(Date asignacion) {
		return estudiantesRepository.findByAsignacionAfter(asignacion);
	}
	
	public List<Estudiantes> contieneApellido(String apellido){
		return estudiantesRepository.findByApellidoContaining(apellido);
	}
	
	@Override
	public List<Estudiantes> buscaNomApelli(String nombre, String apellido) {
	
		return estudiantesRepository.findByNombreAndApellido(nombre, apellido);
	}
	
	@Override
	public List<Estudiantes> nombreTermina(String nombre) {
		return estudiantesRepository.findByNombreEndingWith(nombre);
	}
	
	@Override
	public List<Map<String, Object>> buscarPorGrado(String grado) {
		
		return sb.buscarPorGrado(grado);
	}
	
	@Override
	public List<Map<String, Object>> mostrarNota() {
		
		return sb.mostrarNotas();
	}
	

	
	@Autowired
	GradoRepository gradoRepository;
	
	@Override
	public List<Grado> buscarGrado(){
		return gradoRepository.findAll();
		
	}

	@Override
	public Grado guardar(Grado grado) {
		return gradoRepository.save(grado);
	}
	
	@Override
	public void borrarGrado(Long id) {
		gradoRepository.deleteById(id);
	}
	
	@Override
	public void insertarGrado(Grado grado) {
		sb.insertaGrado(0, null, null);
		
	}


	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> buscarCliente() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Override
	public void borrarCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	@Autowired
	ComprasRepository comprasRepository;
	
	@Override
	public List<Compras> buscarCompras() {
		return comprasRepository.findAll();
	}

	@Override
	public Compras guardar(Compras compras) {
		return comprasRepository.save(compras);
	}
	
	@Override
	public void borrarCompra(Long id) {
		comprasRepository.deleteById(id);
	}

		
	
	
}
