package project.infra;

import project.domain.*;
import project.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class HistoryViewHandler {

//<<< DDD / CQRS
    @Autowired
    private HistoryRepository historyRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReservationCreated_then_CREATE_1 (@Payload ReservationCreated reservationCreated) {
        try {

            if (!reservationCreated.validate()) return;

            // view 객체 생성
            History history = new History();
            // view 객체에 이벤트의 Value 를 set 함
            history.setId(reservationCreated.getId());
            history.setProduct(reservationCreated.getProduct());
            history.setTotPrice(0);
            history.setEnrolDate(reservationCreated.getEnrol_date());
            // history.setCompNo(reservationCreated.getCompNo());
            history.setCateogry(reservationCreated.getCategory());
            history.setSubCategory(reservationCreated.getSub_category());
            history.setRequest(reservationCreated.getRequest());
            history.setCustomerFeedback("");
            history.setManagerReport("");
            // view 레파지 토리에 save
            historyRepository.save(history);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenReservationModified_then_UPDATE_1(@Payload ReservationModified reservationModified) {
        try {
            if (!reservationModified.validate()) return;
                // view 객체 조회
            Optional<History> historyOptional = historyRepository.findById(reservationModified.getId());

            if( historyOptional.isPresent()) {
                 History history = historyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                history.setTotPrice(0);    
                history.setEnrolDate(reservationModified.getEnrol_date());    
                history.setCateogry(reservationModified.getCategory());    
                history.setSubCategory(reservationModified.getSub_category());    
                history.setRequest(reservationModified.getRequest());    
                history.setProduct(reservationModified.getProduct());    
                // view 레파지 토리에 save
                 historyRepository.save(history);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenFeedbackRegistered_then_UPDATE_2(@Payload FeedbackRegistered feedbackRegistered) {
        try {
            if (!feedbackRegistered.validate()) return;
                // view 객체 조회
            Optional<History> historyOptional = historyRepository.findById(feedbackRegistered.getEstId());

            if( historyOptional.isPresent()) {
                 History history = historyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                history.setCustomerFeedback(feedbackRegistered.getCustomerFeedback());    
                // view 레파지 토리에 save
                 historyRepository.save(history);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenFeedbackModified_then_UPDATE_3(@Payload FeedbackModified feedbackModified) {
        try {
            if (!feedbackModified.validate()) return;
                // view 객체 조회
            Optional<History> historyOptional = historyRepository.findById(feedbackModified.getEstId());

            if( historyOptional.isPresent()) {
                 History history = historyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                history.setCustomerFeedback(feedbackModified.getContent());    
                // view 레파지 토리에 save
                 historyRepository.save(history);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenFeedbackDeleted_then_UPDATE_4(@Payload FeedbackDeleted feedbackDeleted) {
        try {
            if (!feedbackDeleted.validate()) return;
                // view 객체 조회
            Optional<History> historyOptional = historyRepository.findById(feedbackDeleted.getEstId());

            if( historyOptional.isPresent()) {
                 History history = historyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                history.setManagerReport("");    
                // view 레파지 토리에 save
                 historyRepository.save(history);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReportRegistered_then_UPDATE_5(@Payload ReportRegistered reportRegistered) {
        try {
            if (!reportRegistered.validate()) return;
                // view 객체 조회
            Optional<History> historyOptional = historyRepository.findById(reportRegistered.getEstId());

            if( historyOptional.isPresent()) {
                 History history = historyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                history.setManagerReport(reportRegistered.getManagerReport());    
                // view 레파지 토리에 save
                 historyRepository.save(history);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReportModified_then_UPDATE_6(@Payload ReportModified reportModified) {
        try {
            if (!reportModified.validate()) return;
                // view 객체 조회
            Optional<History> historyOptional = historyRepository.findById(reportModified.getEstId());

            if( historyOptional.isPresent()) {
                 History history = historyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                history.setManagerReport(reportModified.getManagerReport());    
                // view 레파지 토리에 save
                 historyRepository.save(history);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReportDeleted_then_UPDATE_7(@Payload ReportDeleted reportDeleted) {
        try {
            if (!reportDeleted.validate()) return;
                // view 객체 조회
            Optional<History> historyOptional = historyRepository.findById(reportDeleted.getEstId());

            if( historyOptional.isPresent()) {
                 History history = historyOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                history.setManagerReport("");    
                // view 레파지 토리에 save
                 historyRepository.save(history);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_DELETE_(@Payload  ) {
        try {
            if (!.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            historyRepository.deleteById(.getEstId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//>>> DDD / CQRS
}

