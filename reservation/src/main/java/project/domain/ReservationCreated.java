package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationCreated extends AbstractEvent {

    private Long id;
    private String request;
    private String product;
    private Integer prodCnt;
    private String category;
    private String subCategory;
    private Date enrolDate;
    private Boolean enrolCancel;

    public ReservationCreated(Reservation aggregate) {
        super(aggregate);
    }

    public ReservationCreated() {
        super();
    }
}
//>>> DDD / Domain Event
