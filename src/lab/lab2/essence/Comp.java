package lab.lab2.essence;

public class Comp {

    public static void main(String[] args) {
        Computer Egor = new Computer();
        Egor.computerInfo();

        Computer Ivan = new Computer("AFOX IG41-MA7", "AMD FX-4300 BOX","KFA2 GeForce 210",1000,4 );
        Ivan.computerInfo();

        Computer Max = new Computer("Intel Celeron G6900 OEM");
        Max.computerInfo();

    }
    }

     class  Computer{

        String mb;
        String CPU;
        String GPU;// имя
        int GB;
        int RAM;// возраст


        Computer(String a,String b,String c, int n,int v){
            mb =a;
            CPU =b;
            GPU = c;
            GB=n;
            RAM=v;

        }

        Computer(String b ){

            CPU =b;
        }

        Computer(){

        }

         void computerInfo(){
             System.out.printf("Матпала: %s\n процесор: %s\n видеокарта %s\n объем памяти %d\n оперативная %d\n", mb, CPU,GPU,GB,RAM);
         }


    }


    //Egor.mb = "ASUS TUF GAMING Z790";
//        Egor.GPU ="rtx4090";
//        Egor.CPU ="i9-12900k";
//        Egor.GB = 2000;
//        Egor.RAM = 32;
//        Egor.computerInfo();


