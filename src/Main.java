public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("он совершенолетный");;}
        int wether= 6;
        if(wether>=5){
            System.out.println("На улице "+ wether+" градусов, можно идти без шапки");}else {
            System.out.println("На улице "+ wether+" градусов, нужно надеть шапку");}
        int speed=70;
        if (speed>=60){
            System.out.println("Если скорость "+ speed+" то придется заплатить штраф");}else {
            System.out.println("Если скорость "+ speed+" можно ездить спокойно");}
        int age2=3;
        if (age2>=2&&age2<=6){
            System.out.println("Если возраст человека равен "+age2+" то ему нужно ходить в  детский сад.");}
if(age2>=7&&age2<=17){
    System.out.println("Если возраст человека равен "+age2+" то ему нужно ходить в школу.");}
if (age2>=18&&age2<=24){
    System.out.println("Если возраст человека равен "+age2+" то ему нужно ходить университет.");}
if (age2>25){
    System.out.println("Если возраст человека равен "+age2+" то ему нужно ходить на работу.");}
int age3=40;
if (age3<=5){
    System.out.println("Если возраст ребенка равен "+age3+" то ему нельзя кататся на атркакционе.");}
        if (age3>5&&age3<=14){
            System.out.println("Если возраст ребенка равен "+age3+" то ему можно кататся на атркакционе в сопровождении взрослого.");}else{
            System.out.println("Если возраст ребенка равен "+age3+" то ему можно кататся на атркакционе без сопровождения взрослого");}

int place=40;
        if (place>=1&&place<=60){
            System.out.println("в вагоне есть сидячие место");}
if(place>=61&&place<=102){
    System.out.println("в вагоне есть стоячие место");}
if(place>=103){
    System.out.println("мест болеше не осталось");}
int one=45;
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