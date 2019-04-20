package view.mvp.example.com.mvp;

public class Model {
    private int counter;

    public Model(){
        this.counter=0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int update(){
        return  counter++;
    }
}
