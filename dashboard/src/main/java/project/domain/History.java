package project.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "History_table")
@Data
public class History {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String compNo;
    private String compName;
    private String product;
    private Integer totPrice;
    private String request;
    private Date enrolDate;
    private String cateogry;
    private String subCategory;
    private String customerFeedback;
    private String managerReport;
}
