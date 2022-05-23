/**
 * @author iNightjar
 * @email mohamedmedhateltlawy@gmail.com
 * @create date 2022-01-12 05:36:24
 * @modify date 2022-01-12 05:36:24
 * @desc [description]
 */
package creationalPatterns.factory;

import java.util.Scanner;

public class Pattern {
    
    public idistributor createiIdistributor(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        if ("the middle east".equals(channel)) {
            return new eastCostDistributor();
        } else if ("the middle west".equals(channel)) {
            return new midWestDistributor();
        } else if ("the east cost".equals(channel)) {
            return new westCostDistributor();
        }
        return null;
    }

    public void display() {
        System.out.println("hello");
    }
     public static void main(String[] args)
     {
         try (
                 Scanner input = new Scanner(System.in)) {
             String inputFromUser = input.nextLine();
             Pattern app = new Pattern();
             idistributor i = app.createiIdistributor(inputFromUser);
             i.shipbook();
             System.out.println("hello hacker");
         }
        
    }
    }

