public class Singularity {

  // create the only instance of Singulairty that will exist
  private static Singularity instance = new Singularity();

  // make the constructor private so that no new instances can be created
  private Singularity(){};

  // method to return the instance we created
  public static Singularity getInstance(){
    return instance;
  }

}