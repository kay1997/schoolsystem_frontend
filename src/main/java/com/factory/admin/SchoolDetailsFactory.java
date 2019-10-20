package com.factory.admin;

import com.domain.admin.SchoolDetails;

public class SchoolDetailsFactory {

    public static SchoolDetails getSchoolDetails(String schoolCode, String schoolName, String schoolAddress, String schoolContactNumber) {
        return new SchoolDetails.Builder().schoolCode(schoolCode)
                .schoolName(schoolName)
                .schoolAddress(schoolAddress)
                .schoolContactNumber(schoolContactNumber)
                .build();
    }
}
