package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import project.infra.AbstractEvent;

@Data
public class ReservationModified extends AbstractEvent {

    private Long id;
    private String request;
    private String product;
    private Integer prod_cnt;
    private String category;
    private String sub_category;
    private Date enrol_date;
    private Boolean enrol_cancel;
}
