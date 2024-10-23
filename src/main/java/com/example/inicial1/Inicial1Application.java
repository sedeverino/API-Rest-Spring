package com.example.inicial1;

import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.IPersonaRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Inicial1Application {
	private static final Logger logger = LoggerFactory.getLogger(Inicial1Application.class);

	@Autowired
	private IPersonaRepository IPersonaRepository;
	public static void main(String[] args) {
		SpringApplication.run(Inicial1Application.class, args);

		System.out.println("funcionando");
	}




	@Bean
	@Transactional
	CommandLineRunner init(IPersonaRepository IPersonaRepository) {
		return args -> {
	// Creo un objeto persona
Persona per1 = Persona.builder().
		nombre("Alberto").apellido("Cortez").
		build();

Domicilio dom1 = Domicilio.builder().
		calle("Suipacha").
		numero(239).build();

per1.setDomicilio(dom1);

			IPersonaRepository.save(per1);

// Creo otra persona
			Persona per2 = Persona.builder().
					nombre("Alicia").apellido("Calderon").
					build();

			Domicilio dom2 = Domicilio.builder().
					calle("Lulunta").
					numero(339).build();

			per2.setDomicilio(dom2);


			// Lo grabo a través del repositorio de Spring
			IPersonaRepository.save(per2);

			List<Persona> recuperadas = IPersonaRepository.findAll();
			System.out.println(recuperadas);

			logger.info("Detalles de la persona: {}", recuperadas);




			Optional<Persona> recuperada = IPersonaRepository.findById(1L);
			System.out.println(recuperada);

			logger.info("Detalles de la persona: {}", recuperada);


			dom1.setCalle("Rodriguezaaaa");

			IPersonaRepository.save(per1);




		};

		}




}
