package Strategy.miEjercico1;

public class BubbleSort implements IStrategy {
    @Override
    public void ordenar(Estudiante[] arr) {
        System.out.println("Usando Bubble Sort");
        int n = arr.length;
        Estudiante temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1].getPromedio() < arr[j].getPromedio()){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
