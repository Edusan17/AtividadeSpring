package com.farmacia10.farma.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.farmacia10.farma.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{ 
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
