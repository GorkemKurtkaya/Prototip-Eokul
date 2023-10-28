public class Main {
    public static void main(String[] args){
        Teacher t1 = new Teacher( "Mahmut Hoca","7845456","TRH");
        Teacher t2 = new Teacher("Tesla","4156","FZK");
        Teacher t3 = new Teacher("Charles Darwin","417564","BYJ");


        Course tarih= new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik= new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo= new Course("Biyoloji","103","BYJ");
        biyo.addTeacher(t3);


        Student s1=new Student("Şaban","987","Lise 4", tarih, fizik, biyo);
        System.out.println(s1.name);
        s1.addBulkExamnote(100,0,50);
        s1.isPass();

        Student s2=new Student("Conor McGregor","778","Lise 4",tarih,fizik,biyo);
        System.out.println(s2.name);
        s2.addBulkExamnote(78,54,66);
        s2.isPass();

    }
}
