package com.basedatos.bd.ws;

import java.util.List;

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
	
	
	
	
	
}
