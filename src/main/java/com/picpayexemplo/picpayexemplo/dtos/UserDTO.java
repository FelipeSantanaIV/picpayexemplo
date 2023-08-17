package com.picpayexemplo.picpayexemplo.dtos;

import com.picpayexemplo.picpayexemplo.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firtsName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
