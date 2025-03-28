package edu.bks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    private String examName;
    private String description;
    private Integer courseId;
    private String timeLimit;
    private Integer passScore;
    private Integer questionCount;
}
