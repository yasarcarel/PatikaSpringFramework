package com.yasarcarel;

//Data Transfer Object = DTO
//Objeler arasında veri taşıma işlemi için kullanılır.

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    public Long studentId;
    private String studentName;
    private String studentSurname;
}
