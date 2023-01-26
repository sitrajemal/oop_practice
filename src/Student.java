public class Student {



        int id;
        String name;

        public static void main(String[] args) {
            Student s1=new Student();

            s1.id=12;
            s1.name="sitra";

            s1.display();

        }



        void display()
        {
            System.out.println(id+" "+name);
        }
    }

