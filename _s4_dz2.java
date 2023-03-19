import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


public class _s4_dz2 {

    private static void enqueue(LinkedList<String> qll, String i) {
        qll.addLast(i);
    }

    private static int dequeue(LinkedList<String> qll) {
        int el = 0;
        System.out.println("Значение удаленного первого элемента:  " + qll.get(el));
        qll.remove(qll.get(el)); 
               
        return el;
    }

    private static int first(LinkedList<String> qll) {
        int el1 = 0;
        System.out.println("Значение первого элемента в очереди:  " + qll.get(el1));        
        return el1;
    }

    public static void main(String[] args) {
        
        Scanner inputText = new Scanner(System.in);
        LinkedList<String> qll = new LinkedList<String>();                
        System.out.println("Ведите текст: ");

        for (int i = 0; i < 4 ; i++){            
            String text = inputText.next();
            qll.add(text);                   
        }
        System.out.println("Массив первоначальный:  " + qll);
        inputText.close();

        enqueue(qll, "777");
        enqueue(qll, "888");
        enqueue(qll, "999");
        System.out.println("Массив после добавления элемента в конец очереди:  " + qll);
       
        dequeue(qll);
        dequeue(qll);
        System.out.println("Массив после удаления первого элемента из очереди:  " + qll);

        first(qll);
    }
}
