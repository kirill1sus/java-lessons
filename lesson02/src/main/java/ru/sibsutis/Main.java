package ru.sibsutis;

import org.graalvm.compiler.debug.CSVUtil;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) throws IOException {

        String[] randName = {"Max","Igor","Lex","Kate","Lora","Rex"};
        String[] randDepartment = {"mod","kill","sail","test","work","cod"};
        String[] randNumber = {"+7 913 643 43 23","+7 913 123 64 12","+7 913 537 12 75","+7 913 564 23 98","+7 913 010 37 23","+7 913 517 33 68"};
        String[] randEmail = {"ewrt@mail.ru","fef@mail.ru","qwerf@mail.ru","feweqf@mail.ru","trtf@mail.ru","rty@mail.ru"};


        /////// dev
        FileWriter fw = new FileWriter("diveloper.csv");
        fw.write("ID;Names;@mail;department\n");

        Dev[] devs = new Dev[1001];

        for (int i = 0; i < devs.length ; i++){
            Dev tmp = new Dev(randName[(int) (Math.random() * 6)],randEmail[(int) (Math.random() * 6)],randDepartment[(int) (Math.random() * 6)]);
            devs[i] = tmp;
        }

        for(int i = 0; i<devs.length; i++){
            fw.write(String.valueOf(i+1) + ";" + devs[i].toCSV() + "\n");
        }

        fw.close();

        FileReader fr = new FileReader("diveloper.csv");
        Scanner in = new Scanner(fr);
        String str;

        String[] array = new String[devs.length];
        for(int i = 0; i < array.length; i++){
            str = in.nextLine();
            array[i] = str;
            System.out.println(array[i]);
        }


        /////// maneger
        Maneger[] maneg = new Maneger[1001];

        FileWriter fww = new FileWriter("maneger.csv");
        fww.write("ID;Names;@mail;number\n");

        for(int i = 0; i<maneg.length; i++){
            fww.write(String.valueOf(i+1) + ";" + randName[(int) (Math.random() * 6)] + ";" + randEmail[(int) (Math.random() * 6)]+ ";" + randNumber[(int) (Math.random() * 6)] + "\n");
        }
        fww.close();

        FileReader frr = new FileReader("maneger.csv");
        Scanner inn = new Scanner(frr);
        String str2;


        for (int i = 0; i < maneg.length; i++){
            str2 = inn.nextLine();
            Maneger temp = new Maneger("0","0","0");
            maneg[i] = temp;
            maneg[i].formCSV(str2);
            System.out.println(str2);
        }

    }

}
