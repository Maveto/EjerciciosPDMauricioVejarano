package Strategy.miEjercico1;

public class InsertionSort implements IStrategy {
    @Override
    public void ordenar(Estudiante[] arr) {
        System.out.println("Usando Insertion Sort");
        for (int j = 1; j < arr.length; j++) {
            Estudiante key = arr[j];
            int i = j-1;
            while ((i > -1) && (arr[i].getPromedio() < key.getPromedio())) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
}
