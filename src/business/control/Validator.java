package business.control;

import business.model.LoginValidationException;
import business.model.PasswordValidationException;

public class Validator {
    
    public static boolean validate_login(String login) throws LoginValidationException{
        int size = login.length();
        if(size > 12)
            throw new LoginValidationException("Login invalido! O comprimento não deve ser superior a 12");
        if(login.equals(""))
            throw new LoginValidationException("Login invalido! O login não deve ser vazio");
        if(login.matches(".*\\d.*"))
            throw new LoginValidationException("Login invalido! O login não pode possuir numero");
        
        return true; //Usado para o teste unitario
    }
    
    public static boolean validate_password(String password) throws PasswordValidationException{
        int size = password.length();
        if((size > 16 || size < 8) && !password.matches("[\\w\\d]*\\d[\\w\\d]*\\d[\\w\\d]*"))
        	throw new PasswordValidationException("Password invalido! Comprimento invalido e deve possuir pelo menos 2 numeros");
        if(size > 16 || size < 8)
            throw new PasswordValidationException("Password invalido! Comprimento invalido");
        if(!password.matches("[\\w\\d]*"))
            throw new PasswordValidationException("Password invalido! Senha composta por caracteres invalidos");
        if(!password.matches("[\\w\\d]*\\d[\\w\\d]*\\d[\\w\\d]*"))
            throw new PasswordValidationException("Password invalido! Deve conter pelo menos 2 numeros");
        if(!password.matches("[\\w\\d]*[a-zA-Z][\\w\\d]*"))
            throw new PasswordValidationException("Password invalido! Deve conter pelo menos 1 letra");
        
        return true; //Usado para o teste unitario
    }
    
}
