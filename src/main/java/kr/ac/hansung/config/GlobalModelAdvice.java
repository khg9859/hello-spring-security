package kr.ac.hansung.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalModelAdvice {

    @Value("${app.student-id}")
    private String studentId;

    @Value("${app.student-name}")
    private String studentName;

    @ModelAttribute("studentId")
    public String studentId() {
        return studentId;
    }

    @ModelAttribute("studentName")
    public String studentName() {
        return studentName;
    }
}
