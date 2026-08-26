package main.java.nghoailoc.module1.ex1;
import main.java.nghoailoc.module1.ex1.*; 

public class Main {
    public static void main(String[] args) {
      
        Triangle[] list = new Triangle[5];

     
        list[0] = new Triangle(-2, 3, 4); 
        list[1] = new Triangle(1, 2, 5);

    
        list[2] = new Triangle(3, 4, 5); 
        list[3] = new Triangle(5, 5, 6); 
        list[4] = new Triangle(4, 4, 4); 

    
        System.out.println("===================================================================================");
        System.out.printf("| %-3s | %-6s | %-6s | %-6s | %-20s | %-10s | %-10s |\n",
                "STT", "Cạnh A", "Cạnh B", "Cạnh C", "Loại Tam Giác", "Chu Vi", "Diện Tích");
        System.out.println("===================================================================================");

        for (int i = 0; i < list.length; i++) {
            Triangle t = list[i];
            System.out.printf("| %3d | %6d | %6d | %6d | %20s | %10d | %10.2f |\n",
                    (i + 1),
                    t.getMa(),
                    t.getMb(),
                    t.getMc(),
                    t.getTriangleType(),
                    t.calculatePerimeter(),
                    t.calculateArea());
        }
        System.out.println("===================================================================================");
    }
}

