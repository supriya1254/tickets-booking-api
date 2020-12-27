package com.infotech.book.ticket.app.dao;

import com.infotech.book.ticket.app.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
