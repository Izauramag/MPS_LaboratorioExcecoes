package business.model;

import business.control.Validator;

public class User implements Serializable{
    private static final long serialVersionUID = 7333680617913601432L;
	private static boolean vipGen = false;
    
    private String login, password;
    private final boolean vip;
    
    public User(String login, String password){
        this.login = login;
        this.password = password;
        
        // The odd users created are VIP
    	this.vip = vipGen = !vipGen;
    }
    
    public User(String login){
        this(login, "login123");
    }
    
    public User(){
        this("login","login123");
    }
    
    public String get_login(){
        return this.login;
    }
    
    public String get_password(){
        return this.password;
    }
    
    public boolean isVip() {
    	return this.vip;
    }
    
    public void set_login(String login){
        try{
            Validator.validate_login(login);
            this.login = login;
        }catch(LoginValidationException uve){
            System.out.println(uve.getMessage());
        }
    }
    
    public void set_password(String password){
        try{
            Validator.validate_password(password);
            this.password = password;
        }catch(PasswordValidationException uve){
            System.out.println(uve.getMessage());
        }
    }
    
    public String get_info(){
        return "<html><strong>Login:</strong> <em>" + this.login + "</em>  <strong>Senha:</strong> <em>" + this.password + "</em></html>\n";
    }
    
}
