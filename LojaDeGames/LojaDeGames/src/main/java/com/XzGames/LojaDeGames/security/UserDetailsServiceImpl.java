package com.XzGames.LojaDeGames.security;

	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.security.core.userdetails.UserDetails;
	import org.springframework.security.core.userdetails.UserDetailsService;
	import org.springframework.security.core.userdetails.UsernameNotFoundException;
	import org.springframework.stereotype.Service;
	import org.springframework.web.server.ResponseStatusException;
    import com.XzGames.LojaDeGames.model.Usuario;
    import com.XzGames.LojaDeGames.repository.UsuarioRespository;

	@Service
	public class UserDetailsServiceImpl implements UserDetailsService {
		
		@Autowired
		private UsuarioRespository usuarioRepository;

		@Override
		public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

			Optional<Usuario> usuario = usuarioRepository.findByUsuario(userName);

			if (usuario.isPresent())
				return new UserDetailsImpl(usuario.get());
			else
				throw new ResponseStatusException(HttpStatus.FORBIDDEN);
		}
	}