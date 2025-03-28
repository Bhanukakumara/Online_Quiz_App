package edu.bks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private Integer examId;
    private String text;
    private String options;
    private String correctAnswer;
    private Integer points;
}
