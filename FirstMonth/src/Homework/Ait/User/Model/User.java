package Homework.Ait.User.Model;

import java.util.Objects;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid");
        }

    }

    /*
    1) @ exists and only one (done)
    2) dot after @ (done)
    3) after last dot minimum 2 symbols (done)
    4) alphabetic, digits, _ , - , . , @
     */
    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
            return false;
        }
        if (email.indexOf('.', indexAt) == -1) {
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password not valid: \n" +
                    "    1) min 8 symbols\n" +
                    "    2) min one symbol of uppercase\n" +
                    "    3) min one symbol of lowercase\n" +
                    "    4) min one digit\n" +
                    "    5) min one special symbol (!%@*&)");
        }

    }

    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */
    private boolean validatePassword(String password) {
        int length = password.length();

        if(length < 8) { return false; }

        boolean oneSymbolOfUppercase = false;
        boolean oneSymbolOfLowercase = false;
        boolean oneDigit = false;
        boolean oneSpecialSymbol = false;

        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if(c >= 'A' && c <= 'Z') { oneSymbolOfUppercase = true; }
            if(c >= 'a' && c <= 'z') { oneSymbolOfLowercase = true; }
            if(c >= '0' && c <= '9') { oneDigit = true; }
            if(c == '!' || c == '%' || c == '@' || c == '*' || c == '&') { oneSpecialSymbol = true; }
        }

        return (oneSymbolOfUppercase && oneSymbolOfLowercase && oneDigit && oneSpecialSymbol);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
