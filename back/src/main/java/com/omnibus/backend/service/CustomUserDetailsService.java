package com.omnibus.backend.service;

import com.omnibus.backend.model.Usuario;
import com.omnibus.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con email: " + email));
        // Log para verificar qué tipo de objeto y qué autoridades tiene
        System.out.println("CustomUserDetailsService: Cargado usuario tipo: " + usuario.getClass().getName() + " con autoridades: " + usuario.getAuthorities());
        return usuario; // Usuario ya implementa UserDetails
    }
}