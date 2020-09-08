package vitals;

public class Main {
    static boolean vitalsAreOk(float bpm, float spo2, float respRate) {
      if((bpm>=70 && pbm<=150)||(spo2>=90)||(resRate>=30 &&resRate<=95))
      {
        return true;
      }
        return false;
    }

    public static void main(String[] args) {
        assert(vitalsAreOk(80, 97, 40) == true);
        assert(vitalsAreOk(60, 98, 40) == false);
        System.out.println("Some more tests needed");
    }
}
