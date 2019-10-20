package com.factory.people;

import com.domain.people.Learner;

public class LearnerFactory {

    public static Learner getLearner(String id, String firstName, String lastName, String gender) {
        return new Learner.Builder().id(id)
                .FirstName(firstName)
                .LastName(lastName)
                .Gender(gender)
                .build();
    }
}
