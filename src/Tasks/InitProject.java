/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class InitProject {

    public void init() {
        int[][] weatherInYear = new int[12][];
        weatherInYear[0] = new int[31];
        weatherInYear[1] = new int[28];
        weatherInYear[2] = new int[31];
        weatherInYear[3] = new int[30];
        weatherInYear[4] = new int[31];
        weatherInYear[5] = new int[30];
        weatherInYear[6] = new int[31];
        weatherInYear[7] = new int[31];
        weatherInYear[8] = new int[30];
        weatherInYear[9] = new int[31];
        weatherInYear[10] = new int[30];
        weatherInYear[11] = new int[31];
        int max = 40;
        int min = -30;
        Random random = new Random();
        for (int i = 0; i < weatherInYear.length; i++) {
            for (int j = 0; j < weatherInYear[i].length; j++) {
                weatherInYear[i][j] = random.nextInt(max - min +1)+min;
                
            }
            
        }
        for (int i = 0; i < weatherInYear.length; i++) {
            for (int j = 0; j < weatherInYear[i].length; j++) {
                System.out.printf("%3d",weatherInYear[i][j]);
                
            }
            System.out.println();
            
        }
    }
}
