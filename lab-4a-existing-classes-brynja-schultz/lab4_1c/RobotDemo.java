public class RobotDemo
{
      public static void main (String[] args)
      {
         Robot robbie = new Robot(2, 1, "roomba.png");
         
         robbie.moveForward();
         robbie.turnRight();
         
         robbie.moveForward();
         robbie.turnRight();
         
         robbie.moveForward();
         robbie.turnRight();
         
         robbie.moveForward();
         robbie.turnRight();
      }
}