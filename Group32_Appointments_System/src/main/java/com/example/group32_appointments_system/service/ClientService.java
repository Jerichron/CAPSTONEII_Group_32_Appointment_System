package com.example.group32_appointments_system.service;

import com.example.group32_appointments_system.model.Client;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    void saveClient(Client client);
    Client getClientById(long id);
    void deleteClientById(long id);
    Page<Client> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
