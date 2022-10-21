package com.loki.lokiv2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.loki.lokiv2.model.Client;
import com.loki.lokiv2.model.dto.ClientDto;
import com.loki.lokiv2.repository.ClientRepository;
import com.loki.lokiv2.service.ClientService;


@RestController
@RequestMapping("/client")
public class ClientController {
  
  private final ClientRepository clientRepository;
  private final ClientService clientService;

  public ClientController(ClientRepository clientRepository, ClientService clientService) {
    this.clientRepository = clientRepository;
    this.clientService = clientService;
  }

  @GetMapping()
  public ResponseEntity<List<Client>> getAllClients() throws ResponseStatusException {
    return new ResponseEntity<>(clientRepository.findAll(), HttpStatus.OK);
  }

  @PostMapping("/{:id}")
  public ResponseEntity<Client> createClient(@RequestBody() ClientDto clientDto, @RequestParam String id) throws ResponseStatusException {
    return new ResponseEntity<>(clientService.createClient(clientDto, id), HttpStatus.CREATED);
  }

  @PutMapping()
  public ResponseEntity<Client> updateClient(@RequestBody() ClientDto clientDto) throws ResponseStatusException {
    return new ResponseEntity<>(clientService.createClient(clientDto), HttpStatus.OK);
  }
}
