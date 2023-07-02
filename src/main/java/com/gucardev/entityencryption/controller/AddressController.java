package com.gucardev.entityencryption.controller;

import com.gucardev.entityencryption.model.Address;
import com.gucardev.entityencryption.request.CreateAddressRequest;
import com.gucardev.entityencryption.service.AddressService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

  private final AddressService addressService;

  public AddressController(AddressService addressService) {
    this.addressService = addressService;
  }

  @GetMapping
  public List<Address> getAllAddresses() {
    return addressService.getAllAddresses();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Address> getAddressById(@PathVariable Long id) {
    Optional<Address> address = addressService.getAddressById(id);
    return address.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public ResponseEntity<Address> createAddress(@RequestBody CreateAddressRequest address) {
    Address createdAddress = addressService.createAddress(address);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdAddress);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Address> updateAddress(
      @PathVariable Long id, @RequestBody Address updatedAddress) {
    Address address = addressService.updateAddress(id, updatedAddress);
    return ResponseEntity.ok(address);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
    addressService.deleteAddress(id);
    return ResponseEntity.noContent().build();
  }
}
