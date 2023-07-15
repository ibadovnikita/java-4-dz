import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class homework_4 {
    public static void main(String[] args) {
  
        System.out.println(list);
        list = revers_List(list);
        System.out.println(list);

   
        Queue<Integer> queue = new LinkedList<>();
        enqueue(queue, 5);
        System.out.println(queue);
        enqueue(queue, 7);
        enqueue(queue, 4);
        System.err.println(queue);
        dequeue(queue);
        System.err.println(queue);
        first(queue);
        System.err.println(queue);

        
    }
   
   
   static List<String> revers_List(List<String> array){

   
    List<String> arr_result = new LinkedList<>();
    ListIterator listIterator = array.listIterator(array.size());
    while(listIterator.hasPrevious()){
        String temp = String.valueOf(listIterator.previous());
        arr_result.add(temp);
    }
    return arr_result;
    }

    static List<String> createListString(){
        List<String> array = new LinkedList<>();

    for(int i = 0; i<10; i++){
            array.add(Integer.toString(i));
        }
    
        return array;
    }

    static void enqueue(Queue<Integer> array, int number){
        array.offer(number);
        

    }

    static void dequeue(Queue<Integer> array){
        System.out.println(array.remove());
    }

    static void first(Queue<Integer> array){
        System.out.println(array.peek());
    }
}
