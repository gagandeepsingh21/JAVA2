package project08;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class VacationScale {

    public int[] vacationDays;
    public int yearsOfService;

    public void setVacationScale() {
        vacationDays = new int[7];
        vacationDays[0] = 15;
        vacationDays[1] = 14;
        vacationDays[2] = 13;
        vacationDays[3] = 12;
        vacationDays[4] = 24;
        vacationDays[5] = 25;
        vacationDays[6] = 26;
    }
    
    public void displayVacationDays(){
        if(yearsOfService >= 0 && yearsOfService < 6){
            System.out.println ("Days of vacation: " + vacationDays[yearsOfService]);
        }else if(yearsOfService >= 6){
            System.out.println ("Days of vacation: " + vacationDays[6]);
        }
        else {
            System.out.println ("Invalid years of service");
        } 
    }
}
