package com.domain.people;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Learner {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String gender;

    public Learner() {}

   private Learner(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.FirstName;
        this.lastname = builder.LastName;
        this.gender = builder.gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static class Builder {

        private String FirstName, LastName, id, gender;

        public Builder id( String id) {
            this.id = id;
            return this;
        }

        public Builder FirstName( String learnerFirstName) {
            this.FirstName = learnerFirstName;
            return this;
        }

        public Builder LastName( String learnerLastName) {
            this.LastName = learnerLastName;
            return this;
        }

        public Builder Gender( String learnerGender) {
            this.gender = learnerGender;
            return this;
        }

        public Builder copy(Learner learner){
            this.id = learner.id;
            this.FirstName = learner.firstname;
            this.LastName = learner.lastname;
            this.gender= learner.gender;

            return this;
        }


        public Learner build() {
            return new Learner(this);
        }

    }

    @Override
    public String toString() {
        return "Learner{" +
                "learnerD='" + id + '\'' +
                ", learnerFirstName='" + firstname + '\'' +
                ", learnerLastName='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Learner learner = (Learner) o;
        return id.equals(learner.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

