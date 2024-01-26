package com.zjh.practice.StreamAPI;

import lombok.Data;

@Data
public class StudentEntity {

    /**
     * 姓名
     */
    private String name;
    /**
     * 班级
     */
    private String schoolClass;

    /**
     *语文成绩
     */
    private Integer chineseScore;
    /**
     * 数学成绩
     */
    private Integer MathScore;
}
