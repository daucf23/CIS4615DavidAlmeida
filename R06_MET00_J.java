// MET00-J. Validate method arguments
import java.util.Scanner;

public class R06_MET00_J 
{
  public static void main(String[] args)
  {

    System.out.println("Calculation will be performed when state is true");
    Boolean myState = null;
    Boolean myState2 = false;

    //myState = true;
    
    myState = setState(myState); //set state and use state without validation
    System.out.println("Current myState is: " + myState);
    useState(myState);

    System.out.println("\n");
    //set state and use state with validation
    myState2 = setStateSecure(myState2); 
    System.out.println("Current myState2 is: " + myState2);   //if state check fails, this will never be run
    useStateSecure(myState2);                               //if state check fails, this will never be run

}
/**************************************************************
*
* Here is the methods where we set the state of a boolean
* then run a task based on state..... there is no check performed
* to verify the state
*
**************************************************************/

    public static Boolean setState(Boolean state)
    {
      state = false;
      return state;
    }

    public static void useState(Boolean state)
    {
      if(state == null)
      {
        System.out.println("State is null, cannot perform calculation");
      }
      else
        System.out.println("performing calculation");
    }
/**************************************************************
*
* Here is the methods where we check the state of the argurment when it is set
* before it is used in another method
*
**************************************************************/

    public static Boolean setStateSecure(Boolean state)
    {
      if(isInvalidState(state) == true) //exit program if state invalid 
      {
        System.out.println("State is invalid, and Failed Check");
        System.exit(0);
      }

      return state;
    }

    public static Boolean isInvalidState(Boolean state){
      if(state == null)
      {
        System.out.println("Check Failed");
        return true;
      }
      else{
        System.out.println("Check Passed");
        return false;
      }
    }

    //performs some action based on earlier state;
    public static void useStateSecure(Boolean state)
    {
      if(state == true)
      {
        System.out.println("performing calculation");
      }
      else
      {
        System.out.println("Calculation cancelled based on state");
      }
    }

}