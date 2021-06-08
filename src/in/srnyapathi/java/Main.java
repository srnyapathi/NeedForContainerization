package in.srnyapathi.java;

public class Main {

    public static void main(String[] args) {
        String myFirstConfig = System.getenv("MY_CONFIG_1");
        System.out.println("My first configuration "+myFirstConfig);
        String mySecondConfiguration = System.getenv("MY_CONFIG_2");
        System.out.println("My Second configuration "+mySecondConfiguration);

        if(myFirstConfig!=null && mySecondConfiguration!=null){
            System.out.println("Server Process started !!! ");
        }else{
            System.err.println("Error running the server please call support ! ");
        }

    }
}
