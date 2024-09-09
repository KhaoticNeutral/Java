public class Human {

    String name;
    int age;
    double weight;

        Human(String name, int age, double weight ){       //this is the constructor it often shares a name with the class
                this.name = name;
                this.age = age;
                this.weight = weight;
        }

        void eat(){
            System.out.println(this.name+" is eating");
        }

        void sleep(){
            System.out.println(this.name+" is sleeping");
        }

        void drink(){
            System.out.println(this.name+" is drinking");
        }

        void weight(){
            System.out.println(this.name+" is this "+this.weight+"kg's");
        }

        void age(){
            System.out.println(this.name+" is "+this.age+"years old");
        }

}
