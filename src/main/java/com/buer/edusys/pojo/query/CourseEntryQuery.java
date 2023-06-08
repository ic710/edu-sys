package com.buer.edusys.pojo.query;

import lombok.Data;

@Data
public class CourseEntryQuery {

    private Long courseId;

    private Long studentId;

    private Long teacherId;
}
