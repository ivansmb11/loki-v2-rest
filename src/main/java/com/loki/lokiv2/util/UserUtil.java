package com.loki.lokiv2.util;

import org.springframework.stereotype.Component;

import com.loki.lokiv2.model.User;
import com.loki.lokiv2.model.dto.UserDto;
import com.loki.lokiv2.repository.UserRepository;

@Component
public class UserUtil {
  
  private final UserRepository userRepository;

  public UserUtil(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public UserDto copyUserDto(User user) {
    var userDto = new UserDto();
    userDto.setId(user.getId().toString());
    userDto.setFirstName(user.getFirstName());
    userDto.setLastName(user.getLastName());
    userDto.setEmail(user.getEmail());
    userDto.setRole(user.getRole());
    userDto.setActive(user.isActive());
    userDto.setPhone(user.getPhone());
    userDto.setPassword(user.getPassword());
    return userDto;
  } 

}
