public class TestPolimorfismo
{
    public static void main(String[] args)
    {
        Vaca lola = new Vaca();
        Animal animal = new Vaca();
        Serpiente serpiente = new Serpiente();

        System.out.println("lola dice: " + lola.hablar());
        System.out.println("animal dice: " + animal.hablar());
        System.out.println("serpiente dice: " + serpiente.hablar());
    }
}
