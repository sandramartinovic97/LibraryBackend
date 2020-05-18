package com.library.library.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String adminUsername;
    @Column
    private String adminEmail;
    @Column
    private String adminPassword;

    /*public static class Builder {

        private Integer id;
        private String adminUsername;
        private String adminEmail;
        private String adminPassword;

        public Builder(Integer id) {
            this.id = id;
        }

        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            return this;
        }

        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Admin build() {
            Admin admin = new Admin();
            admin.id = this.id;
            admin.adminUsername = this.adminUsername;
            admin.adminEmail = this.adminEmail;
            admin.adminPassword = this.adminPassword;

            return admin;
        }
    }*/
}