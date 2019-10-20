package com.domain.infrastructure;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Lab {

    @Id
    private String labNumber;
    private String labType;

     public Lab(){}

    private Lab(Builder builder)
    {
        this.labNumber = builder.labNumber;
        this.labType = builder.labType;
    }

    public String getLabNumber()
    {
        return labNumber;
    }

    public void setLabNumber(String labNumber) {
        this.labNumber = labNumber;
    }

    public void setLabType(String labType) {
        this.labType = labType;
    }

    public String getLabType()
    { return labType;
    }


    public static class Builder {

        private String labNumber;
        private String labType;

        public Builder labNumber(String labNumber)
        {
            this.labNumber = labNumber;
            return this;
        }

        public Builder labType(String labType)
        {
            this.labType = labType;
            return this;
        }

        public Builder copy(Lab lab){
            this.labNumber = lab.labNumber;
            this.labType = lab.labType;

            return this;
        }

        public Lab build() {
            return new Lab(this);
        }

    }

    @Override
    public String toString() {
        return "Lab{" +
                "labNumber" + labNumber + '\'' +
                "labType" + labType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lab lab = (Lab) o;
        return labNumber.equals(lab.labNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labNumber);
    }
}

