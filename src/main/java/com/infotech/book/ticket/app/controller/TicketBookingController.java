package com.infotech.book.ticket.app.controller;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/tickets")
@Api(value = "Ticket controller - which we perform crud operation!")
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @PostMapping(value = "/create")
    @ApiOperation(value = "This method will create the ticket.", response = Ticket.class)
    @ApiResponses(value = {
            @ApiResponse(code = 504, message = "System is overloaded...wait a bit."),
            @ApiResponse(code = 505, message = "we are out of tickets."),
            @ApiResponse(code = 506, message = "we are currently on holiday.")
    })
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketBookingService.createTicket(ticket);
    }

    @GetMapping(value = "/ticket/{ticketId}")
    //@RequestMapping(value="/ticket/{ticketId}")
    public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
        return ticketBookingService.getTicketById(ticketId);
    }

    @GetMapping(value = "/ticket/alltickets")
    public Iterable<Ticket> getAllBookedTickets() {
        return ticketBookingService.getAllBookedTickets();
    }

    @DeleteMapping(value = "/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
        ticketBookingService.deleteTicket(ticketId);
    }

    @PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
    public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, @PathVariable("newEmail") String newEmail) {
        return ticketBookingService.updateTicket(ticketId, newEmail);
    }
}
