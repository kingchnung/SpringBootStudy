package com.boot.example.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    private int no;
    private String studentNumber;
    private String studentName;
    private String studentId;
    private String studentPassword;
    private String subjectNumber;
    private String studentBirth;
    private String studentPhone;
    private String studentAddress;
    private String studentEmail;
    private String date;

}
