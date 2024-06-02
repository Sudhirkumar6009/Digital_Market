package com.sudhir.digitalmarketapplication;

    public class UserClass {
        private String name;
        private String password;

        public UserClass(String name, String password, String email) {
            this.name = name;
            this.password = password;
            this.email = email;
        }

        private  String email;

        // Required default constructor for Firebase
        public UserClass() {
        }

        public UserClass(String name, String password) {
            this.name = name;
            this.password = password;
        }

        // Getters and setters (you can generate them automatically in Android Studio)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
