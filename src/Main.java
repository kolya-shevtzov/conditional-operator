public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("он совершенолетный");;}
        int wether= 6;
        if(wether>=5){
            System.out.println("На улице "+ wether+" градусов, можно идти без шапки");}else {
            System.out.println("На улице "+ wether+" градусов, нужно надеть шапку");}
        int speed=60;
        if (speed>=60){
            System.out.println("Если скорость "+ speed+" можно ездить спокойно");}else {
            System.out.println("Если скорость "+ speed+" то придется заплатить штраф");}
        int ageTwo=3;
        if (ageTwo>=2&&ageTwo<=6){
            System.out.println("Если возраст человека равен "+ageTwo+" то ему нужно ходить в детский сад.");}
        if(ageTwo>=7&&ageTwo<=17){
            System.out.println("Если возраст человека равен "+ageTwo+" то ему нужно ходить в школу.");}
        if (ageTwo>=18&&ageTwo<=24){
            System.out.println("Если возраст человека равен "+ageTwo+" то ему нужно ходить университет.");}
        if (ageTwo>25){
        System.out.println("Если возраст человека равен "+ageTwo+" то ему нужно ходить на работу.");}
        int ageFree=40;
        if (ageFree<=5){
            System.out.println("Если возраст ребенка равен "+ageFree+" то ему нельзя кататся на атркакционе.");}
        if (ageFree>5&&ageFree<=14){
            System.out.println("Если возраст ребенка равен "+ageFree+" то ему можно кататся на атркакционе в сопровождении взрослого.");}else{
            System.out.println("Если возраст ребенка равен "+ageFree+" то ему можно кататся на атркакционе без сопровождения взрослого");}
           int place=40;
        if (place>=1&&place<=60){
            System.out.println("в вагоне есть сидячие и стоячие места");}
        if(place>=61&&place<=102){
            System.out.println("в вагоне есть стоячие места но уже нет сидячих");}
        if(place>=103){
            System.out.println("мест болеше не осталось");}
        int one=46;
        int two=280;
        int free=360;
        if (free>one&&free>two){
            System.out.println("значит "+free+" это самое большое число");}else {
            System.out.println("значит "+free+" это не самое большое число");}
        if(two>free&&two>one){
            System.out.println("значит "+two+" это самое большое число");}else{
            System.out.println("значит "+two+" это не самое большое число");}
        if (one>free&&one>two){
            System.out.println("значит "+one+" это самое большое число");}else {
            System.out.println("значит "+one+" это не самое большое число");}
    }
}