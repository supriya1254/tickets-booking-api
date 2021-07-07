package com.infotech.book.ticket.app.service;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TicketBookingServiceTest {

    @Autowired
    private TicketBookingService ticketBookingService;

    @Autowired
    private TicketBookingDao ticketBookingDao;


    @Test
    public void createTicketTest(){} /*{

        Ticket ticket = new Ticket(101,"Supriya",new Date(),"Riga","Paris","supriya@gmail.com");
       // Ticket ticket = new Ticket();
*//*
        ticket.setTicketId(101);
        ticket.setPassengerName("supriya");
        ticket.setEmail("supriya@gmail.com");
        ticket.setBookingDate(new Date());
        ticket.setSourceStation("Riga");
        ticket.setDestStation("Paris");
*//*

        when(ticketBookingService.createTicket(ticket)).thenReturn(ticket);

        Assert.assertEquals(ticket,ticketBookingService.createTicket(ticket));
           }*/

}