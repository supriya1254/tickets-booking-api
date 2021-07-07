package com.infotech.book.ticket.app.service;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;

@Service
@Slf4j
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		Ticket savedTicket = ticketBookingDao.save(ticket);
		log.debug("Ticket has been created successfully!", savedTicket);
		return savedTicket;
	}
	public Optional<Ticket> getTicketById(Integer ticketId) {
		Optional<Ticket> ticket = ticketBookingDao.findById(ticketId);
		log.debug("Ticket by Id :", ticket.get().getTicketId());
		return ticket;
	}
	public Iterable<Ticket> getAllBookedTickets() {
		Iterable<Ticket> tickets = ticketBookingDao.findAll();
		log.debug("here is the list of Tickets", tickets);
		return tickets;
	}
	public void deleteTicket(Integer ticketId) {
		log.info("Ticket deleted!");
		ticketBookingDao.deleteById(ticketId);
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		log.info("start updating tickets with ticketId", ticketId);
		Optional<Ticket> ticketFromDb = ticketBookingDao.findById(ticketId);
		ticketFromDb.get().setEmail(newEmail);
		Ticket updatedTicket = ticketBookingDao.save(ticketFromDb.get());
		log.debug("Ticket updated!", updatedTicket.getTicketId());
		return updatedTicket;
	}
}
