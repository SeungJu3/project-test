package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ConsultingChanged extends AbstractEvent {

    private Long id;
    private Date date;
    private Integer hour;
    private Integer minute;
    private Long estId;
    private String compNo;
    private Long userId;
    private Long managerId;
    private String customerFeedback;
    private String managerReport;

    public ConsultingChanged(Consulting aggregate) {
        super(aggregate);
    }

    public ConsultingChanged() {
        super();
    }
}
//>>> DDD / Domain Event
