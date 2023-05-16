package com.problemsolving;

public class TimeConversion {

    public static String timeConversion(String str){
        String am_pm = str.substring(8,10);

        if(am_pm.equals("AM")){
            if(str.startsWith("12")){
                return "00"+ str.substring(2,8);
            }
            return str.substring(0,8);
        } else if (am_pm.equals("PM")) {
            int incr = (Integer.parseInt(str.substring(0,2))%12) + 12;
            if(incr == 24){
                return "12"+str.substring(2,8);
            }
            return incr+str.substring(2,8);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("01:01:00PM"));
    }
}

// 12:01:00PM => 12:01:00 || 12:01:00AM => 00:01:00