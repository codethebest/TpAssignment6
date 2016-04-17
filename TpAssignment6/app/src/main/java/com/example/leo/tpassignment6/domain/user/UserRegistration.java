package com.example.leo.tpassignment6.domain.user;

/**
 * Created by Leo on 4/18/2016.
 */
public class UserRegistration {

    private String id;
    private String name;
    private String useremail;
    private String newPassword;
    private String gender;

    public UserRegistration ()
    {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUseremail() {
        return useremail;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getGender() {
        return gender;
    }

    public UserRegistration (Builder builder)
    {
        this.gender = builder.gender;
        this.name = builder.name;
        this.newPassword = builder.newPassword;
        this.useremail = builder.useremail;
        this.id = builder.id;
    }

    public static class Builder
    {
        private String name;
        private String useremail;
        private String newPassword;
        private String gender;
        private String id;


        public Builder name (String value)
        {
            this.name = value;
            return this;
        }

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }
        public Builder username (String value)
        {
            this.useremail = value;
            return this;
        }

        public Builder newPassword (String value)
        {
            this.newPassword = value;
            return this;
        }

        public Builder gender (String value)
        {
            this.gender = value;
            return this;
        }


        public Builder copy(UserRegistration userRegistration)
        {
            this.gender = userRegistration.gender;
            this.newPassword = userRegistration.newPassword;
            this.name = userRegistration.name;
            this.useremail = userRegistration.useremail;
            this.id=userRegistration.id;
            return this;
        }

        public UserRegistration build()
        {
            return new UserRegistration(this);
        }

    }

}
