package edu.bks.controller;

import edu.bks.dto.Exam;
import edu.bks.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {
    final ExamService examService;
    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){
        examService.createExam(exam);
    }
    @GetMapping("/get-exam-by-course-id/{id}")
    public Exam getExamByCourseId(@PathVariable Integer id){
        return examService.getExamByCourseId(id);
    }
}
