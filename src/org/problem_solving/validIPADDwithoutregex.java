package org.problem_solving;

public class validIPADDwithoutregex {
    public static void main(String[] args) {
        String str = "255.255.255.1";
        String[] strArray = str.split("[.]");
        if (strArray.length == 4) {
            int port = 0;
            for (int i=0; i<strArray.length; i++) {
                char[] c = strArray[i].toCharArray();
                if (c.length <= 3&&strArray[i].matches("[0-255]+")) {
                    try {
                        port = Integer.parseInt(strArray[i]);
                    } catch (NumberFormatException e) {
                        port = -1;
                        break;
                    }
                } else {
                    port = -1;
                    break;
                }
            }
            System.out.println(port > 0);
        } else {
            System.out.println(false);
        }
    }
}