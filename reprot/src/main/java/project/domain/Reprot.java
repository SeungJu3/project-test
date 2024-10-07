package project.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import project.ReprotApplication;
import project.domain.ReportDeleted;
import project.domain.ReportModified;
import project.domain.ReportRegistered;

@Entity
@Table(name = "Reprot_table")
@Data
//<<< DDD / Aggregate Root
public class Reprot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long constId;

    private String content;

    private Date date;

    @PostPersist
    public void onPostPersist() {
        ReportDeleted reportDeleted = new ReportDeleted(this);
        reportDeleted.publishAfterCommit();

        ReportModified reportModified = new ReportModified(this);
        reportModified.publishAfterCommit();

        ReportRegistered reportRegistered = new ReportRegistered(this);
        reportRegistered.publishAfterCommit();
    }

    public static ReprotRepository repository() {
        ReprotRepository reprotRepository = ReprotApplication.applicationContext.getBean(
            ReprotRepository.class
        );
        return reprotRepository;
    }
}
//>>> DDD / Aggregate Root
