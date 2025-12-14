package sistema_animais;
public class Anirmal_gpt {
    public void emitirSom(){
        System.out.println("Som genérico....");
    }
}

public class Cachorro extends Animal_gpt{
    @Override
    public void emitirSom(){
        System.out.println("Au au!");
    }
}
public class Gato extends Animal_gpt{
    @override
    public void emitirSom(){
        System.out.println("Miau!");
    }
}

public class Vaca extends Animal_pgt{
    @override
    public void emitirSom(){
        System.out.println()
    }
}

public class Main{
    public static void main(String[] args) {
    
        Vaca minhaVaca = new Vaca();

        minhaVaca.emitirSom();

    }
}

