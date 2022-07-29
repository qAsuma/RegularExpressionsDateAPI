package Task2;

import java.io.*;

//Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все предлоги на слово «Java».
public class Task2 {
    public static void main(String[] args) throws IOException {
        File f = new File("Task2file");
        PrintWriter pw = new PrintWriter(f);
        pw.println("near ocean");
        pw.println("by me");
        pw.println("for you");

        pw.close();


        BufferedReader br = new BufferedReader(new FileReader("Task2file"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line.replaceAll("[a-z]*^\\s*[a-z]+", "Java"));
        }


    }
}



