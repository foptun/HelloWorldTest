public class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }


    public String getMessage() {
        return "Hello " + this.message;
    }

    public String show(String message){
        return null;
    }

    String fun(){
        return null;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld("Foptun");
        String message = helloWorld.getMessage();
        System.out.println("Hello "+message);
    }
}
