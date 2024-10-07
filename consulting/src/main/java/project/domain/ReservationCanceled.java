package project.domain;

import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

@Data
@ToString
public class ReservationCanceled extends AbstractEvent {

    private Long id;
    private String request;
    private String product;
    private Integer prodCnt;
    private String category;
    private String subCategory;
    private Date enrolDate;
    private Boolean enrolCancel;
}
