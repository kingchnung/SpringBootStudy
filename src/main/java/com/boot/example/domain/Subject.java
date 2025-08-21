package com.boot.example.domain;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Subject {
    private int no;
    private String subjectNumber;
    private String subjectName;
}
