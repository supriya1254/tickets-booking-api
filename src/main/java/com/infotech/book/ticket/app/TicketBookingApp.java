package com.infotech.book.ticket.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Slf4j
@SpringBootApplication
@EnableSwagger2
public class TicketBookingApp {
    public static void main(String[] args) {
        SpringApplication.run(TicketBookingApp.class, args);
        log.info("hello this the log info");
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.infotech.book.ticket.app"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Ticket Booking API",
                "This api will use to book the tickets.",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Supriya Soni", "https://github.com/supriya1254/tickets-booking-api","supriya@gmail.com"),
                "API License",
                "https://github.com/supriya1254/tickets-booking-api",
                Collections.emptyList());
    }
}
