package com.gucardev.entityencryption.service;

import com.gucardev.entityencryption.model.User;
import com.gucardev.entityencryption.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public Optional<User> getUserById(Long id) {
    return userRepository.findById(id);
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public User updateUser(Long id, User updatedUser) {
    Optional<User> optionalUser = userRepository.findById(id);
    if (optionalUser.isPresent()) {
      User user = optionalUser.get();
      BeanUtils.copyProperties(updatedUser, user, "id", "createdDate", "lastModifiedDate");
      // Ignore "id", "createdDate", and "lastModifiedDate" properties
      return userRepository.save(user);
    } else {
      throw new IllegalArgumentException("User not found with id: " + id);
    }
  }

  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }
}
