package com.proyectott2.spring.apienergia.configurations;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proyectott2.spring.apienergia.model.TipoModel;
import com.proyectott2.spring.apienergia.repository.TipoRepository;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initDataBase(TipoRepository tipoRepository) {
        return args -> {
            Map<String, String> tipos = Map.of(
                "Solar", "Energia solar generada a partir de la radiacion del sol",
                "Eólica", "Energia eolica generada a partir del viento",
                "Hidráulica", "Energia hidraulica generada a partir del agua",
                "Biomasa", "Energia de biomasa generada a partir de materia organica"
            );

            for(int i = 0; i < tipos.size(); i++){
                if(!tipoRepository.existsById((long)(i+1))){
                    String name = (String) tipos.keySet().toArray()[i];
                    String description = (String) tipos.values().toArray()[i];
                    TipoModel tipo = new TipoModel();
                    tipo.setNombre(name);
                    tipo.setDescripcion(description);
                    tipoRepository.save(tipo);
                }
            }
        };
    }
}
