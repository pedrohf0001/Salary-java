package org.example;

import entities.Employee;
import testSalary.Services;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(("Nome: "));
        String nome = sc.nextLine();

        System.out.println(("Salario: "));
        double salario = sc.nextDouble();

        Employee employee = new Employee(nome, salario);
        Services services = new Services();

        double results = services.result(employee);
        System.out.printf("O resultado da metade é : %.2f%n",results);

        sc.close();


    }
}