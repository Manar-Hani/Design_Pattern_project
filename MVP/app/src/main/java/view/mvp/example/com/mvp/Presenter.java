package view.mvp.example.com.mvp;

public class Presenter {
   Model model;
   View view;
   private int counter;

    public Presenter(View view) {
        this.view = view;
        this.model=new Model();
        counter=0;
    }

    public void update(){
        model.update();
        view.countIncrement(model.getCounter());
    }
}
