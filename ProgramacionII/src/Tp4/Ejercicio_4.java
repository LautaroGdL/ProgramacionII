package Tp4;

public class Ejercicio_4  implements Ejercicio_1{

    static class BufferCircular {
        private final int[] buffer;
        private int index = 0;
        private boolean lleno = false;

        public BufferCircular(int capacidad) {
            buffer = new int[capacidad];
        }

        public void registrarTemperatura(int temp) {
            buffer[index] = temp;
            index = (index + 1) % buffer.length;
            if (index == 0) lleno = true;
        }

        public void mostrarBuffer() {
            int count = lleno ? buffer.length : index;
            for (int i = 0; i < count; i++) {
                int pos = (index - 1 - i + buffer.length) % buffer.length;
                System.out.print(buffer[pos] + " ");
            }
            System.out.println();
        }
    }

}
