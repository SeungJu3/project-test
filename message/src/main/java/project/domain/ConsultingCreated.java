package project.domain;

import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

@Data
@ToString
public class ConsultingCreated extends AbstractEvent {

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
}
