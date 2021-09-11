package com.helloworldtechs.designPattern.creational.builder;

public class User
{

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String secondaryEmail;
    private final String homePhone;
    private final String mobilePhone;
    private final String country;
    private final String city;

    //region Constructor
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.secondaryEmail = builder.secondaryEmail;
        this.homePhone = builder.homePhone;
        this.mobilePhone = builder.mobilePhone;
        this.country = builder.country;
        this.city = builder.city;
    }
    //endregion

    @Override
    public String toString()
    {
        return "User [firstName = "+ firstName +", lastName = "+ lastName +", "
                + "email = "+ email +", secondaryEmail = "+ secondaryEmail +", "
                + "homePhone = "+ homePhone +", mobilePhone = "+ mobilePhone +", "
                + "country = "+ country +", city = "+ city +", ]";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String secondaryEmail;
        private String homePhone;
        private String mobilePhone;
        private String country;
        private String city;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder secondaryEmail(String secondaryEmail) {
            this.secondaryEmail = secondaryEmail;
            return this;
        }
        public Builder homePhone(String homePhone) {
            this.homePhone = homePhone;
            return this;
        }
        public Builder mobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public Builder country(String country) {
            this.country = country;
            return this;
        }
        public Builder city(String city) {
            this.city = city;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }


}
