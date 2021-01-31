import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Collectors;  

public class RemoveDuplicate{

     public static void main(String []args){
        ArrayList<Integer> duplicateEle = new ArrayList<Integer>();
        duplicateEle.add(1);
        duplicateEle.add(2);
        duplicateEle.add(1);
        duplicateEle.add(4);
        duplicateEle.add(1);
        duplicateEle.add(3);
        duplicateEle.add(2);
        
        List<Integer> newList = duplicateEle.stream().distinct().collect(Collectors.toList());
        System.out.println("Element from ArrayList: "+ duplicateEle);
        System.out.println("Element from ArrayList: "+ newList);
        
     }
}

/*
Output

Element from ArrayList: [1, 2, 1, 4, 1, 3, 2]
Element from ArrayList: [1, 2, 4, 3]

*/
