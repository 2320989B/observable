import java.util.Observable;

// Model is independent of Controller and View.
public class Model extends Observable {

   private int firstNum;
   private int secondNum;
   private int result;

   public Model() {
      firstNum = 0;
      secondNum = 0;
      result = 0;
   }

   public void setFirstNum(int firstNum) {
      this.firstNum = firstNum;
   }

   public void setSecondNum(int secondNum) {
      this.secondNum = secondNum;
   }

   public int getResult() {
      return result;
   }

   public void compute() {
      result = firstNum + secondNum;
      setChanged();
      notifyObservers();
   }

}
