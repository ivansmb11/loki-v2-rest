package com.loki.lokiv2.service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.loki.lokiv2.model.User;
import com.loki.lokiv2.model.dto.UserDto;
import com.loki.lokiv2.repository.UserRepository;
import com.loki.lokiv2.util.UserUtil;

@Service
public class UserService {
  
  private final UserRepository userRepository;
  private final UserUtil userUtil;

  public UserService(UserRepository userRepository, UserUtil userUtil) {
    this.userRepository = userRepository;
    this.userUtil = userUtil;
  }

  public UserDto getUser(String email) {
    Optional<User> user = userRepository.findByEmail(email);
    if (user.isEmpty()) {
      throw new ResponseStatusException(
        HttpStatus.NOT_FOUND,
        "Usuario no encontrado"
      );
    }
    return userUtil.copyUserDto(user.get());
  }

}
