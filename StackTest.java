public class StackTest {
    public static void main(String[] args) {
        Stack<Pilhas> pilha = new ObjectClassStack<>();

        pilha.push(new Pilhas(1, "Duracel", "AAA"));
        pilha.push(new Pilhas(2, "Elgin", "AA"));
        pilha.push(new Pilhas(3, "Panasonic", "AA"));

        try {
            System.out.println(pilha.pop());
            System.out.println(pilha.pop());
            System.out.println(pilha.pop());
            System.out.println(pilha.pop());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Acabou o sistema!");
    }
}