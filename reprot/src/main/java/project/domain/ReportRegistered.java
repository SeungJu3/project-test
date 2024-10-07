package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReportRegistered extends AbstractEvent {

    private Long id;
    private Long constId;
    private String content;
    private Date date;

    public ReportRegistered(Reprot aggregate) {
        super(aggregate);
    }

    public ReportRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
