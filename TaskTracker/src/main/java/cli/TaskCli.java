package cli;

import java.util.Locale;
import java.util.Scanner;

public class TaskCli {

    private Scanner scanner;

    public void taskManager(){
        this.scanner = new Scanner(System.in);
    }

    public void runMenu(){
        String opcion;
        while (!(opcion = scanner.next().toLowerCase()).equals("exit")){

            switch (opcion){
                case "añadir" -> añadir();
                case "actualizar" -> actualizar();



            }

        }
    }

    public void añadir(){
        String desc = scanner.nextLine().trim();
    }

    public void actualizar(){

    }
}
