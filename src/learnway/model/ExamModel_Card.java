package learnway.model;

import java.util.Date;
import javax.swing.Icon;

public class ExamModel_Card {
    private String examId;
    private String datetime;
    private String examName;
    private String status;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public ExamModel_Card(String examId, String dateTime, String examName, String status) {
  this.examId =examId;
  this.datetime = dateTime;
  this.examName = examName;
  this.status = status;
  
    }

    public ExamModel_Card() {
        
    }

}
