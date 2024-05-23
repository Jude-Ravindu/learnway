/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnway.model;

import javax.swing.Icon;

/**
 *
 * @author tehan
 */
public class Model_Exam_Schedule {
    private Icon icon;
    private String Year;
    private String Language;
    private String Time;
    private String Date;
    private String Status;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public Model_Exam_Schedule(Icon icon, String Year, String Language, String Time, String Date,  String Status) {
        this.icon = icon;
        this.Year = Year;
        this.Language = Language;
        this.Time = Time;
        this.Date = Date;
        this.Status = Status;

    }

    public Model_Exam_Schedule() {
    }

}
