package com.object.app;

    // atributos
    public class Person {
        public String name;
        public int age;
        public double height;

    // constructor
        public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // métodos
    public String sayHello(){
        return "Olá meu nome é "+this.name+", tenho "+this.age+" e tenho "+this.height;
    }

    public void showInfo(){
        System.out.println("\nNome: "+this.name);
        System.out.println("Idade: "+ this.age );
        System.out.println("Altura: "+this.height);

    }
}
