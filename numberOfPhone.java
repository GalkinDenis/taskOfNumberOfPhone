package com.example.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numberOfPhone {
    public static void main(String[] args) {
        String parse = "";
        char a;
        int count = 0;
        int count3 = 0;
        int countPlus = 0;
        int countScobka = 0;
        int countScobka2 = 0;
        char charAt = 0;
        boolean sign = false;
        boolean signToScobka = false;
        String vvod;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            vvod = bf.readLine();

            for(int z = 0; z < vvod.length(); z++) {
                charAt = vvod.charAt(z);
                if (
                        Character.isDigit(charAt) |
                                charAt == '+' |
                                charAt == ' ' |
                                charAt == '(' |
                                charAt == ')' |
                                charAt == '-'
                ) {
                    if (charAt == '+') {
                        countPlus++;
                        if(countPlus >= 2){
                            sign = true;
                        }
                    } else if (charAt == '(') {
                        countScobka++;
                        if(countScobka >= 2){
                            sign = true;
                        }
                    } else if (charAt == ')') {
                        countScobka2++;
                        if(countScobka2 >= 2){
                            sign = true;
                        }
                    } else if (Character.isDigit(charAt)) {
                        count++;
                        if (vvod.contains("(") & vvod.contains(")")) {
                            if (count == 2 && (vvod.indexOf("(") != z - 1)) {
                                sign = true;
                            }
                            if (count == 4 && (vvod.indexOf(")") != z + 1)) {
                                sign = true;
                            }
                        }
                    }
                } else {
                    sign = true;
                }
            }
            if (
                    vvod.contains(")-") | vvod.contains("-(") | vvod.contains("-)") | vvod.contains("(-") |
                            ((vvod.indexOf("-") > vvod.indexOf("(")) && vvod.indexOf("-") < vvod.indexOf(")")) |
                            vvod.contains("  ") |
                            vvod.contains("--") |
                            vvod.indexOf("+") > 0 |
                            (vvod.charAt(0) == '+' && vvod.charAt(1) != '7') |
                            (vvod.charAt(0) != '+' && vvod.charAt(0) != '8') |
                            (vvod.contains("(") && !vvod.contains(")")) |
                            (!vvod.contains("(") && vvod.contains(")")) |
                            vvod.charAt(0) == '-' |
                            vvod.charAt(vvod.length() - 1) == '-' |
                            count != 11
            ) {
                signToScobka = true;
            }


            for (int i = 0; i < vvod.length(); i++) {
                a = vvod.charAt(i);
                if (Character.isDigit(a)) {
                    count3++;
                    parse = parse.concat(String.valueOf(a));
                    if ((a == ('7')) & (count3 == 1)) {
                        parse = parse.replace('7', '8');
                    }
                    if (count3 == 1) {
                        parse = parse.concat(" (");
                    }
                    if (count3 == 4) {
                        parse = parse.concat(") ");
                    }
                    if (count3 == 7 | count3 == 9) {
                        parse = parse.concat("-");
                    }
                }
            }
            if (sign | signToScobka) {
                System.out.println("error");
            } else {
                System.out.println(parse);
            }
        } catch (IOException ex) {
            System.out.println("error");
        }
    }
}
