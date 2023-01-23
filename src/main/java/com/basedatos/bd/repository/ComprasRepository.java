package com.basedatos.bd.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basedatos.bd.entity.Compras;

@Repository("comprasRepository")
public interface ComprasRepository extends JpaRepository<Compras, Serializable>{

}
