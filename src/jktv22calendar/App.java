/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22calendar;

import java.util.Scanner;
import java.util.Random;

public class App {

    void run() {
         int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Создаем зубчатый массив для хранения температур
        double[][] temperatureData = new double[12][];

        // Заполняем зубчатый массив случайными температурами (просто для примера)
        for (int month = 0; month < 12; month++) {
            temperatureData[month] = new double[daysInMonth[month]];
            for (int day = 0; day < daysInMonth[month]; day++) {
                // Здесь можно добавить логику для заполнения температуры
                // Например, можно использовать Math.random() для генерации случайных значений
                double temperature = 15 + Math.random() * 20; // Пример случайной температуры от 15 до 35 градусов Цельсия
                temperatureData[month][day] = temperature;
            }
        }

        // Выводим температурные данные столбиками
        for (int month = 0; month < 12; month++) {
            System.out.println("Месяц " + (month + 1) + ":");
            for (int day = 0; day < daysInMonth[month]; day++) {
                System.out.println("День " + (day + 1) + ": " + temperatureData[month][day] + "°C");
            }
            System.out.println(); // Пустая строка между месяцами
        }
    }
    
}
