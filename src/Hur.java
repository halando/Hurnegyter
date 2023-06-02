public class Hur {
    public double calcArea(
        double aside,
        double bside,
        double cside,
        double dside
    ){
        if (aside <=0 || bside <= 0|| cside <= 0 || dside <=0){
            return -1;
        }
        double s = (aside + bside +cside + dside) /2;
        double area = Math.sqrt(
            (s-aside)*
            (s-bside)*
            (s-cside)*
            (s-dside)
        );
        return area;
    }
}
