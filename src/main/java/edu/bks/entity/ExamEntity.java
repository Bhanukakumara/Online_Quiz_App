package edu.bks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "exam")
public class ExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String examName;
    private String description;
    private Integer courseId;
    private String timeLimit;
    private Integer passScore;
    private Integer questionCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

