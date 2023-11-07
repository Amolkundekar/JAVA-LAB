import java.lang.Thread;

class Buffer {
    double buffer[];
    int head = 0, tail = 0, size = 0, numElements = 0;

    public Buffer(int s) {
        buffer = new double[s];
        size = s;
    }

    public synchronized void insert(double element) {
        if (numElements == size) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        buffer[tail] = element;
        tail = (tail + 1) % size;
        numElements++;
        notify();
    }

    public synchronized double delete() {
        if (numElements == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        double value = buffer[head];
        head = (head + 1) % size;
        numElements--;
        notify();
        return value;
    }
}

class Consumer extends Thread {
    Buffer buffer;

    public Consumer(Buffer b) {
        buffer = b;
    }

    @Override
    public void run() {
        while (true) {
            double element = buffer.delete();
            System.out.println(element);
        }
    }
}

class Producer extends Thread {
    Buffer buffer;

    public Producer(Buffer b) {
        buffer = b;
    }

    @Override
    public void run() {
        double value = 0.0;
        while (true) {
            buffer.insert(value);
            value += 0.1;
        }
    }
}

class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);
        Producer prod = new Producer(buffer);
        Consumer cons = new Consumer(buffer);
        prod.start();
        cons.start();
    }
}
