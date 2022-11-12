package com.digitalhouse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Perro> perros = new ArrayList<>();

        Perro perro1 = new Perro();
        perro1.setNombre("Firulais");
        perro1.setEdad(3);

        Perro perro2 = new Perro();
        perro1.setNombre("Manchita");
        perro1.setEdad(5);

        perros.add(perro1);
        perros.add(perro2);

        // Guardar en un archivo
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream("listado-perros.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(perros);

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Perro> perros2 = new ArrayList<>();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("listado-perros.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            perros2 = (ArrayList)objectInputStream.readObject();

            for (Perro perro : perros2) {
                System.out.println(perro.getNombre() + ": " + perro.getEdad());
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
