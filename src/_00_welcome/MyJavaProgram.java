package _00_welcome;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
Robot Bot=new Robot();
Bot.sparkle();
Bot.penDown();
Bot.setPenColor(Color.red);
 Bot.setSpeed(5); Bot.move(220);
		Bot.turn(90);
		Bot.hide();
		Bot.setSpeed(100);Bot.move(300);
		Bot.show();
		Bot.move(50);
		Bot.turn(90);
		Bot.move(400);
		Bot.turn(90);
		Bot.move(700);
		Bot.turn(90);
		Bot.move(400);
		Bot.turn(90);
		Bot.move(350);
	}
}
