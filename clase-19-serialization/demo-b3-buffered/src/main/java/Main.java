import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1,"Quito","Esteban",10000));
        empleados.add(new Empleado(2,"Nitario","Elsa",15000));
        empleados.add(new Empleado(3,"Paredes","Armando",20000));
        empleados.add(new Empleado(4,"Gallo","Elba",25000));
        empleados.add(new Empleado(5,"Horia","Susana",30000));

        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("empleados.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            for (Empleado empleado : empleados) {
                String linea = empleado.getNombre() + " - " + empleado.getApellido() + " - "
                        + empleado.getLegajo() + " - " + empleado.getSueldo() + "\n";
                bufferedOutputStream.write(linea.getBytes());
            }

            bufferedOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        


    }
}
