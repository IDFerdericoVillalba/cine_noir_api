package com.cinenoir.cinenoirapi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record FuncionRequest(
        Integer idPelicula,
        LocalDate fecha,
        LocalTime hora,
        String sala,
        BigDecimal precio,
        Integer cuposDisponibles
) {}
