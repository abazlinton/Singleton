public class Runner {

  public static void main(String [] args){

    // this will prove we cannot create another instance
    Singularity singularity_new = new Singularity();

    
    Singularity singularity = Singularity.getInstance();
    Singularity same_singularity = Singularity.getInstance();

    //prove that these are the same object
    System.out.println( singularity );
    System.out.println( same_singularity );

  }
}