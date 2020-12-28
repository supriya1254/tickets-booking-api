package com.infotech.book.ticket.app.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ticket")
@ApiModel(description = "Details about the ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticket_id")
    @ApiModelProperty(notes = "The unique id of the ticket")
    private Integer ticketId;

    @ApiModelProperty(notes = "passenger name on ticket")
    @Column(name = "passenger_name", nullable = false)
    private String passengerName;

    @Column(name = "booking_date")
    @ApiModelProperty(notes = "booking date on ticket")
    private Date bookingDate;

    @Column(name = "source_station")
    @ApiModelProperty(notes = "name of the source station")
    private String sourceStation;

    @Column(name = "dest_station")
    @ApiModelProperty(notes = "name of the destination station")
    private String destStation;

    @Column(name = "email")
    @ApiModelProperty(notes = "email address of the passenger")
    private String email;

}
