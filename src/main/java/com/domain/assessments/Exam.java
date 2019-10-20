package com.domain.assessments;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Exam {
    @Id
    private String examPaperNumber;
    private String examType;

    public Exam() {}

    private Exam(Builder builder)
    {
        this.examPaperNumber = builder.examPaperNumber;
        this.examType = builder.examType;
    }

    public String getExamPaperNumber() {
        return examPaperNumber;
    }

    public void setExamPaperNumber(String examPaperNumber) {
        this.examPaperNumber = examPaperNumber;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getExamType() {
        return examType;
    }

    public static  class Builder {

        private String examPaperNumber;
        private String examType;

        public Builder examPaperNumber(String examPaperNumber)
        {
            this.examPaperNumber = examPaperNumber;
            return this;
        }

        public Builder examType(String examType)
        {
            this.examType = examType;
            return this;
        }

        public Builder copy(Exam exam){
            this.examPaperNumber = exam.examPaperNumber;
            this.examType = exam.examType;

            return this;
        }

        public  Exam build() {

            return new Exam(this);
        }
    }

    @Override
    public String toString() {
        return "Exam {" +
                "examPaperNumber" + examPaperNumber + '\'' +
                "examType" + examType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return examPaperNumber.equals(exam.examPaperNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examPaperNumber);
    }
}

