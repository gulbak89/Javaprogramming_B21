package day41_Encapsulation;

public class Credentials {

    private String userName="cybertek";
    private double  password=1234;


    public String getUserName(){  //used "getter" to get private information. this is called Encapsulation.

        return userName;
    }

    public double getPassword(){
        return password;
    }

    public void setUserName(String userName){
        /*
        if(userName.length()<8){      // allows us to security check, this is the advantage of setter
            return;
        }
        */
        this.userName=userName;
    }

    public void setPassword(double password){ //used "setter" to write the information,this is called Encapsulation.
        this.password=password;
    }




}
