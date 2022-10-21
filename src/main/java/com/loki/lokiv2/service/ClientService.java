package com.loki.lokiv2.service;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.loki.lokiv2.model.Client;
import com.loki.lokiv2.model.dto.ClientDto;
import com.loki.lokiv2.repository.ClientRepository;


@Service
public class ClientService {
  private final ClientRepository clientRepository;

  public ClientService(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  public Client createClient(ClientDto clientDto, String id) {
    var client = clientRepository.findByEmail(clientDto.getEmail());
    if (client.isPresent()) {
      throw new RuntimeException("Client already exists");
    }
    BeanUtils.copyProperties(clientDto, client.get());
    client.get().setCreatedDate(LocalDate.now());
    client.get().setCreatedBy(id);
    client.get().setUpdatedDate(LocalDate.now());
    client.get().setUpdatedBy(id);
    return clientRepository.save(client.get());
  }

  public Client updateClient(ClientDto clientDto) {
    var client = clientRepository.findById(UUID.fromString(clientDto.getId()));
    if (client.isEmpty()) {
      throw new RuntimeException("Client does not exist");
    }
    BeanUtils.copyProperties(clientDto, client.get());
    client.get().setUpdatedDate(LocalDate.now());
    return clientRepository.save(client.get());
  }
}
