import java.util.Scanner;

public class Day_Four_Project {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        boolean isLoggedIn;

        isLoggedIn = authentication(sc);

        if (isLoggedIn) {
            mainMenu(sc);
        } else {
            System.out.println("ERROR! Please Re-Run");
        }
    }

    public static boolean authentication(Scanner sc) {
        int password = 1234;
        int userPassword = 0; 
        
        for (int i = 3; i > 0; i--) {
            System.out.print("Enter 4 Digit PIN: ");
            userPassword = sc.nextInt();

            if (password == userPassword) {
                return true;
            } else {
                System.out.println("Invalid!");
            } ;
        } return false;
    }

    public static void mainMenu(Scanner sc) {
        int userChoice = 0;
        int addProduct = 0;
        int removeProduct = 0;
        int total = 0;
        int ballCounter = 0;
        int shortsCounter = 0;
        
        while(true) {
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. View Cart");
            System.out.println("4. Remove Product");
            System.out.println("5. View Total");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");
            System.out.print("User Choice: ");
            userChoice = sc.nextInt();

            if (userChoice == 1) {
                viewProducts();
            } else if (userChoice == 2) {
                while(true) {
                    System.out.print("Buy: ");
                    addProduct = sc.nextInt();
                    
                    if (addProduct == 1) {
                        ballCounter = addBall(ballCounter);
                    } else if (addProduct == 2) {
                        shortsCounter = addShorts(shortsCounter);
                    } else if (addProduct == 3) {
                        break;
                    } else {
                        System.out.println("Out Of Range!");
                        continue;
                    }
                }
            } else if (userChoice == 3) {
                viewCart(ballCounter, shortsCounter);
            } else if (userChoice == 4) {
                while(true) {
                    System.out.print("Remove: ");
                    removeProduct = sc.nextInt();
                    
                    if (removeProduct == 1) {
                        ballCounter = removeBall(ballCounter);
                    } else if (removeProduct == 2) {
                        shortsCounter = removeShorts(shortsCounter);
                    } else if (removeProduct == 3) {
                        break;
                    } else {
                        System.out.println("Out Of Range!");
                        continue;
                    }
                }
            } else if (userChoice == 5) {
                total = viewTotal(total, ballCounter, shortsCounter);
            } else if (userChoice == 6) {
                checkout (total);
                ballCounter = 0;
                shortsCounter = 0;
            } else if (userChoice == 7) {
                System.out.println("Shop Again! BYE");
                break;
            }
        }
    }

    public static void viewProducts() {
        System.out.println("1. Ball [20]");
        System.out.println("2. Shorts [30]\n");
    }

    public static int addBall(int ballCounter) {
        System.out.println("Ball +1");
        return ballCounter += 1;
    }

    public static int addShorts(int shortsCounter) {
        System.out.println("Shorts +1");
        return shortsCounter += 1;
    }

    public static int removeBall(int ballCounter) {
        System.out.println("Ball -1");
        return ballCounter -= 1;
    }

    public static int removeShorts(int shortsCounter) {
        System.out.println("Shorts -1");
        return shortsCounter -= 1;
    }

    public static void viewCart(int ballCounter, int shortsCounter) {
        System.out.println("Ball: " + ballCounter);
        System.out.println("Shorts: " + shortsCounter);
    }

    public static int viewTotal(int total, int ballCounter, int shortsCounter) {
        total = ((ballCounter * 20) + (shortsCounter * 30));
        System.out.println("Ball: " + ballCounter);
        System.out.println("Shorts: " + shortsCounter);
        System.out.println("Total: " + total);
        return total;
    }

    public static void checkout(int total) {
        System.out.println("Checkout Done! PHP" + total);
    }
}