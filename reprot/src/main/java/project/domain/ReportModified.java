package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReportModified extends AbstractEvent {

    private Long id;
    private Long constId;
    private String content;
    private Date date;

    public ReportModified(Reprot aggregate) {
        super(aggregate);
    }

    public ReportModified() {
        super();
    }
}
//>>> DDD / Domain Event
