import java.util.Observable;
import java.util.Observer;

// Controller is dependant on the Model and View.
public class Controller implements Observer {

   private View view;
   private Model model;

   public void run() {
      // Instantiate the view.
      view = new View();

      // Print the welcome screen.
      view.welcome();

      // Prompt the user to enter the first number.
      int firstNum = view.numPrompt();

      // Prompt the user to enter the second number.
      int secondNum = view.numPrompt();

      // Instantiate the model and set Controller as the observer.
      model = new Model();
      model.addObserver(this);

      // Send user values to the model and perform computation.
      model.setFirstNum(firstNum);
      model.setSecondNum(secondNum);
      model.compute();
   }

   @Override
   public void update(Observable observable, Object o) {
      // React to model change.
      view.showResult(model.getResult());
   }

}
