public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        boolean isRightSlides = a > 0 && b > 0 && c > 0;
        boolean isAHypotenuse = (int) Math.pow(a, 2) == (int) Math.pow(b, 2) + (int) Math.pow(c, 2);      
        boolean isBHypotenuse = (int) Math.pow(b, 2) == (int) Math.pow(c, 2) + (int) Math.pow(a, 2);
        boolean isCHypotenuse = (int) Math.pow(c, 2) == (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        
        boolean isRightTriangle = isRightSlides && (isAHypotenuse || isBHypotenuse || isCHypotenuse);
        System.out.println(isRightTriangle);
    }
}