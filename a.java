 class Main{
    public static void main(String[] args){
        Book it = new Book();
        it.title = "It";
        it.author = "Stephen King";
        it.pages = 123;
        it.year = 1999;

        Book metro = new Book();
        metro.title = "Metro 2033";
        metro.author = "Dmitry Gluhovski";
        metro.pages = 324;
        metro.year = 2012;
        System.out.println(it.GetInfo());
        System.out.println(metro.GetInfo());
        

        Student Ahmad = new Student("Ahmad", "CSC23", 23, 3.65);
        Student Umar = new Student("Umar");
        System.out.println(Ahmad.getInfo());
        System.out.println(Umar.getInfo());

        BankAccount Azm = new BankAccount("Azm");
        Azm.deposit(124);
        Azm.withdraw(32);
        System.out.println(Azm.getBalance());

        Rectangle[] r = {
            new Rectangle(3, 4),
            new Rectangle(5, 5),
            new Rectangle(2, 10)
        };
        double max = 0; boolean isSquare = false;
        for(int i = 0; i < 3; i++){
            if(max < r[i].area()){
                max = r[i].area();
                isSquare = r[i].isSquare();
            }
        }
        System.out.println(max + " " + isSquare);
    }
}