package project07;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Clock {
    public int currentTime = 2100;
    
    public void displayPartOfDay(){
        if (currentTime >= 801 && currentTime <= 1200){
            System.out.println ("Good Morning");
        }else if (currentTime >= 1201 && currentTime <= 1700){
            System.out.println ("Good Afternoon");
        }else if (currentTime >= 1701 && currentTime <= 2400){
            System.out.println ("Good Evening");
        }else {
            System.out.println ("How is your Early morning?");
        }// end if/else            
    } // end displayPartOfDay method
 }
