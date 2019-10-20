package com.domain.admin;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import java.util.Set;

@Entity
public class SchoolDetails {

    @Id
    private String schoolCode;
    private String schoolName, schoolContactNumber, schoolAddress;

    public SchoolDetails() {
    }

    private SchoolDetails(Builder builder) {

        this.schoolCode = builder.schoolCode;
        this.schoolName = builder.schoolName;
        this.schoolContactNumber = builder.schoolContactNumber;
        this.schoolAddress = builder.schoolAddress;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public void setSchoolContactNumber(String schoolContactNumber) {
        this.schoolContactNumber = schoolContactNumber;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolContactNumber() {
        return schoolContactNumber;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public static class Builder {

        private String schoolCode;
        private String schoolName, schoolContactNumber, schoolAddress;

        public Builder schoolCode(String schoolCode) {
            this.schoolCode = schoolCode;
            return this;
        }

        public Builder schoolName(String schoolName) {
            this.schoolName = schoolName;
            return this;
        }


        public Builder schoolContactNumber(String schoolContactNumber) {
            this.schoolContactNumber = schoolContactNumber;
            return this;
        }

        public Builder schoolAddress(String schoolAddress) {
            this.schoolAddress = schoolAddress;
            return this;
        }

        public Builder copy(SchoolDetails school) {
            this.schoolCode = school.schoolCode;
            this.schoolName = school.schoolName;
            this.schoolAddress = school.schoolAddress;
            this.schoolContactNumber = school.schoolContactNumber;

            return this;
        }


        public SchoolDetails build() {
            return new SchoolDetails(this);
        }

    }

    @Override
    public String toString() {
        return "School {" +
                "schoolCode" + schoolCode + '\'' +
                "schoolName" + schoolName + '\'' +
                "schoolAddress" + schoolAddress + '\'' +
                "schoolContactNumber" + schoolContactNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolDetails school = (SchoolDetails) o;
        return schoolCode.equals(school.schoolCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolCode);
    }
}