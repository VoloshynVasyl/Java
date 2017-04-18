package Block01_Task02;

/**
 * Created by Vasyl_Voloshyn on 4/13/2017.
 */
public class Model {
    //Алгоритм №25. Меняет местами первый положительный и последний, второй и предпоследний и т.д.
    int _arraySize;
    private int[] _sourceArray;

    void setSize(int size){
         _arraySize = size;
         _sourceArray = new int[_arraySize];
    }
    int getSize(){
        return _arraySize;
    }

    void setArray(int[] array){
        _sourceArray = array;
    }

    int[] getArray(){
        return _sourceArray;
    }

    int[] swappedPositiveNumbers(int[] array){
        int left=0;
        int right=0;
        int tmp;
        while(left+right<array.length){
            if(array[left]>=0){
                tmp = array[left];
                while(left+right<array.length){
                    if(array[array.length-1-right]>=0){
                        array[left]=array[array.length-1-right];
                        array[array.length-1-right]=tmp;
                        right++;
                        break;
                    }
                    right++;
                }
            }
            left++;
        }
        return array;
    }
}

