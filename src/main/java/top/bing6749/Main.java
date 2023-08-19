package top.bing6749;
/*
 * @author  MaRui
 * @date  2023/8/18 14:59
 * @version 1.0
 */


import java.util.Scanner;

/**
 * PAT (Basic Level) Practice （中文）
 * @author MaRui
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            boolean statue = true;
            int a1 = 0;
            int a2 = 0;
            int a3 = 0;
            int pat = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != 'A' && line.charAt(i) != 'P' && line.charAt(i) != 'T'){
                    statue = false;
                    break;
                }
                if (pat == 0 && line.charAt(i) == 'A'){
                    a1++;
                } else if (pat == 1 && line.charAt(i) == 'A') {
                    a2++;
                } else if (pat == 2 && line.charAt(i) == 'A') {
                    a3++;
                } else if (line.charAt(i) == 'P'){
                    pat = 1;
                }else if (line.charAt(i) == 'T') {
                    pat = 2;
                }
            }
            if (a1+a2+a3+2 != line.length() || a1*a2 != a3 || a2  == 0 || statue == false){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
