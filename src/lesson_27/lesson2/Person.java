package lesson_27.lesson2;

public class Person {

    private String email;

    private String password;


    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {

            this.email = email;
        }
    }

    /*
    1. @ должна присутсвовать и должен быть толкко 1
    2. Точка после собаки
    3. Точка не может быть сразу после собаки
    4. После последжней точки должно быть не менее 2 символов
    5. символы алфавита цифры и  '_' '.' '@'
    6. Место для @ - хотя бы один символ до собаки.

     */

    private boolean isEmailValid(String email) {
        // 0. проверяем что что-то ввлели
        if (email == null || email.isEmpty()) return false;
        //1. @ ||
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) return false;
        //точка после @
        int indexFistDotAfterAt = email.indexOf('.', indexAt);
        if (indexFistDotAfterAt == -1 || indexFistDotAfterAt == indexAt + 1) return false;
        //3 lLastDot
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        if (!Character.isAlphabetic(email.charAt(0))) return false;

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isAlphabetic(c)
                    || Character.isDigit(c)
                    || c == '-'
                    || c == '_'
                    || c == '.'
                    || c == '@'))
                return false;
        }

        return true;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)){

            this.password=password;
        }
    }
    private boolean isPasswordValid(String password) {
        if (password==null || password.isEmpty()) return false;

        // 1. длина пароля>8
        if (password.length() <= 8) return false;
        // 2. Должна быть 1 маленькая буква
        // 3. 1 заглавная
        // 4. минимум 1 цифра
        for (int i = 0; i < password.length(); i++) {
            char a = password.charAt(i);
            if (!Character.isLowerCase(a)) {
                return false;
            } else if (!Character.isUpperCase(a)) {
                return false;

            } else if (!Character.isDigit(a)) {
                return false;
            }
        }
        // 5. мин 1 спецсимвол (! % $ @ & *)
        for (int i = 0; i < password.length(); i++) {
            char b = email.charAt(i);
            if (!(Character.isAlphabetic(b)
                    || Character.isDigit(b)
                    || b == '!'
                    || b == '%'
                    || b == '$'
                    || b == '@'
                    || b == '&'
                    || b == '*'
            ))
                return false;
        }
        return true;

    }
    /*
    1. длина пароля>8
    2. Должна быть 1 маленькая
    3. 1 заглавная
    4. минимум 1 цифра
    5. мин 1 спецсимвол (! % $ @ & *)
     */


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }
}
