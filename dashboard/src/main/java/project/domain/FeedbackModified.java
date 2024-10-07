package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import project.infra.AbstractEvent;

@Data
public class FeedbackModified extends AbstractEvent {

    private Long id;
    private Long const_id;
    private String content;
    private Date date;
}
