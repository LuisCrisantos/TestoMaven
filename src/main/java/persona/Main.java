package persona;

public class Main {
    public static void main(String[] args) {
        Prueba minato = new Prueba("Arisato Minato", "Orpheus Telos", "Gekkoukan High School", 17,99);
        Prueba yu = new Prueba("Narukami Yu", "Izanagi no Okami", "Yasogami High School", 17, 99);
        Prueba ren = new Prueba("Amamiya Ren", "Satanael", "Shujim Academy", 17, 99);

        System.out.println("Name: "+minato.getName()+" Persona: "+minato.getPersona()+" School: "+minato.getSchool()+" Age: "+minato.getAge()+" Level: "+minato.getLevel());
        System.out.println("Name: "+yu.getName()+" Persona: "+yu.getPersona()+" School: "+yu.getSchool()+" Age: "+yu.getAge()+" Level: "+yu.getLevel());
        System.out.println("Name: "+ren.getName()+" Persona: "+ren.getPersona()+" School: "+ren.getSchool()+" Age: "+ren.getAge()+" Level: "+ren.getLevel());
    }
}
