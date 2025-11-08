package Enums;

enum Season{
    SUMMER,WINTER,SPRING,AUTUMN
}

public class WeatherApp {
    public static void main(String[] args){
        Season current = Season.WINTER;

        switch (current) {
            case SUMMER:
                System.out.println("It's hot outside!");
                break;
            case WINTER:
                System.out.println("It's cold outside!");
                break;
            default:
                System.out.println("The weather is pleasant!");
        }
    }
}
