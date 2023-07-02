package com.gucardev.entityencryption.service;

import com.gucardev.entityencryption.model.Address;
import com.gucardev.entityencryption.model.User;
import com.gucardev.entityencryption.repository.AddressRepository;
import com.gucardev.entityencryption.request.CreateAddressRequest;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

  private final AddressRepository addressRepository;
  private final UserService userService;

  public AddressService(AddressRepository addressRepository, UserService userService) {
    this.addressRepository = addressRepository;
    this.userService = userService;
  }

  public List<Address> getAllAddresses() {
    return addressRepository.findAll();
  }

  public Optional<Address> getAddressById(Long id) {
    return addressRepository.findById(id);
  }

  public Address createAddress(CreateAddressRequest request) {
    Long userId = request.getUserId();
    User user =
        userService
            .getUserById(userId)
            .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));

    Address address = new Address();
    // Ignore "userId"
    BeanUtils.copyProperties(request, address, "userId");

    address.setUser(user);

    return addressRepository.save(address);
  }

  public Address updateAddress(Long id, Address updatedAddress) {
    Optional<Address> optionalAddress = addressRepository.findById(id);
    if (optionalAddress.isPresent()) {
      Address address = optionalAddress.get();
      BeanUtils.copyProperties(updatedAddress, address, "id", "createdDate", "lastModifiedDate");
      // Ignore "id", "createdDate", and "lastModifiedDate" properties
      return addressRepository.save(address);
    } else {
      throw new IllegalArgumentException("Address not found with id: " + id);
    }
  }

  public void deleteAddress(Long id) {
    addressRepository.deleteById(id);
  }
}
