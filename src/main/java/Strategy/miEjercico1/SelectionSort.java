package Strategy.miEjercico1;

public class SelectionSort implements IStrategy {
    @Override
    public void ordenar(Estudiante[] arr) {
        System.out.println("Usando Selection Sort");
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j].getPromedio() > arr[index].getPromedio()){
                    index = j;//searching for lowest index
                }
            }
            Estudiante maxNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = maxNumber;
        }
    }
}
