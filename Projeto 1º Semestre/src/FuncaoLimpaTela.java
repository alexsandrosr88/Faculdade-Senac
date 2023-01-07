/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Alex
 */
public class FuncaoLimpaTela {
    public static void main(String[] args) {
        
        System.out.println("TESTE");
        limpaTela();
        System.out.println("TESTE");
        
        
}
    static void limpaTela(){
          try {
        Robot robot = new Robot();
        robot.setAutoDelay(10);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
    } catch (AWTException ex){
        
    }
}
}