public class Patterns {

    public static void hollow_Ractangle(int totRows, int totCols) {
        for(int i=1; i<=totRows; i++) {
            for(int j=1; j<=totCols; j++) {
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rotated_Half_Pyramid01(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=1; j--) {
                if(i < n) {
                    System.out.print(" ");
                } 
                for(int k=1;  k<=j; k++) {
                    if(j == i) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void rotated_Half_Pyramid02(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_Half_Pyramid(int n) {
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
            System.out.print(j);
            }
            System.out.println();
        }
                
    }

    public static void floyd_triangle(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
     }

     public static void zeroOne_Triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
     }

     public static void butterfly_Pattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void solid_Rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void hollow_Rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
        
     }

     public static void diamond(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*(i-1)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }
    public static void main(String args[]) {
        // hollow_Ractangle(4, 5);
        // rotated_Half_Pyramid01(10);
        // rotated_Half_Pyramid02(5);
        // inverted_Half_Pyramid(9);
        // floyd_triangle(5);
        // zeroOne_Triangle(5);
        // butterfly_Pattern(4);
        // solid_Rhombus(7);
        // hollow_Rhombus(5);
        diamond(4);

    }
}