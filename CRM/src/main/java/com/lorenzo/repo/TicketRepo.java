package com.lorenzo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.lorenzo.models.Ticket;

public interface TicketRepo extends CrudRepository<Ticket, Integer> {
	List<Ticket> findByRepairType(String repairType);
}
