package com.infotech.book.ticket.app.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ticket")
@ApiModel(description = "this is model for ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticket_id")
    private Integer ticketId;

    @ApiModelProperty(notes = "passenger name on ticket")
    @Column(name = "passenger_name", nullable = false)
    private String passengerName;

    @Column(name = "booking_date")
    private Date bookingDate;

    @Column(name = "source_station")
    private String sourceStation;

    @Column(name = "dest_station")
    private String destStation;

    @Column(name = "email")
    private String email;

}
