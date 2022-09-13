package com.XzGames.LojaDeGames.repository;

	import java.util.Optional;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
    import com.XzGames.LojaDeGames.model.Usuario;

	@Repository
	public interface UsuarioRespository extends JpaRepository<Usuario, Long>{

		public Optional<Usuario> findByUsuario(String usuario);
}
