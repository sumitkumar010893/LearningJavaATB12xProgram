package tasks.exceptionChallenge;

public class Pair <T,U>{
//    create a generic class 'Pair' that holds two values of any type .
//    Input - Pair("Test", 100)
//    Output -  First: Test, Second: 100
    private T first;
    private U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display(T first, U second){
        System.out.println("First: "+first+", Second: "+second);
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Test",100);
        pair.display("Test",100);

    }
}
