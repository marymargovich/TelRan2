package TelRan.user.model;

public class User {
    private String email;
    private String password;

    public User() {};

    public User(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is not valid");
        }

    }
    /*
    to do
    1. @ exists and only one
    2. dot after @
    3. after last dot min 2 symbols
    4. alphabetic, digits, _, -, ., @
     */
    private boolean validateEmail(String email) {
        return validateAt(email)
                && validateDotAfterAt(email)
                && validateMinDomainLength(email)
                && validateAllowedChars(email);
    }

    private boolean validateAllowedChars(String email) {
        for (char ch : email.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '@' && ch != '.' && ch != '_' && ch != '-') {
                return false;
            }
        }
        return true;
    }

    private boolean validateMinDomainLength(String email) {
        int lastDot = email.lastIndexOf('.');
        if (lastDot == -1) {
            return false;
        }
        int domainLength = email.length() - lastDot - 1;
        if (domainLength >= 2) {
            return true;
        } else {
            return false;
        }



}


    private boolean validateDotAfterAt(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return false;
        }

        int dotAfterAt = email.indexOf('.', atIndex);
        if (dotAfterAt != -1) {
            return true;
        } else {
            return false;
        }
    }



    private boolean validateAt(String email) {
        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');

        if (firstAt == -1) {
            return false;
        }

        if (firstAt != lastAt) {
            return false;
        }
        return true;
    }





    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return " User " +
                " email " + email
                +" password"+ password;
    }
}
