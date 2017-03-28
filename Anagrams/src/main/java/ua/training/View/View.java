package ua.training.View;

/**
 * Created by Plavun on 29.03.2017.
 */
public class View {

    /**
     * enter message
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     *
     * @param message
     */
    public void concatenationAndPrint(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        printMessage(new String(concatString));
        //System.out.println(concatString);
    }

    public String getLine(){
        return "a1bcd efg!h";
    }
}
