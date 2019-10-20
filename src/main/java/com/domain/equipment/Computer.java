package com.domain.equipment;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Computer {

    @Id
    private String computerNumber;
    private String computerName;

    public Computer() {
    }

    private Computer(Builder builder) {

        this.computerNumber = builder.computerNumber;
        this.computerName = builder.computerName;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getComputerName() {
        return computerName;
    }

    public static class Builder {

        private String computerNumber;
        private String computerName;

        public Builder computerNumber(String computerNumber) {
            this.computerNumber = computerNumber;
            return this;
        }

        public Builder computerName(String computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder copy(Computer computer) {
            this.computerNumber = computer.computerNumber;
            this.computerName = computer.computerName;

            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerNumber" + computerNumber + '\'' +
                "computerName" + computerName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return computerNumber.equals(computer.computerNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerNumber);
    }

}
