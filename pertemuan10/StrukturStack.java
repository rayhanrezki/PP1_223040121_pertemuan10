package pertemuan10;

public class StrukturStack {

    private int [] array;
    private int capacity;
    private int TOP;
    private int temp;

    public final int MIN = -1;

    public StrukturStack(int capacity){
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public boolean isEmpty(){
        return (TOP == MIN); //mengecheck apakah Stack Kosong?
    }

    public boolean isFull(){
        return (TOP == capacity - 1); //mengecheck apakah stack penuh?
    }

    public int Size(){
        return TOP + 1; //mencari TOP (nilai) paling atas dari stack
    }

    public void Push(int data){ //fungsi untum memasukkan nilai ke stack
        if(isFull()){
            System.out.println("Stack Penuh");
        }else{
            TOP++; //akan selalu terisi dari atas (menimpa)
            array[TOP] = data; //data yang diinput akan menjadi yg paling atas
        }
    }

    public int Pop(int data){ //fungsi untuk mengeluarkan nilai dari stak (dari atas)
         if(isEmpty()){
            System.out.println("Stack Kosong");
         }else{
            temp = array[TOP]; //nilai paling atas (TOP) akan menjadi temp
            TOP = TOP -1; //TOP akan diturunkan
         }
         return temp;
    }

    public void DisplayElement(){ //fungsi menampilkan semua elemen dalam stack
        System.out.println("Element from TOP : ");
        if(isEmpty()){
            System.out.println("Stack Kosong");
        }else{
            for(int i = TOP; i >= 0; i--){ //menampilkan i(elemen) hanya ketika i > 0 dan akan mencari dari TOP kebawah
                System.out.println(array[i] + " ");
            }
        }
    }

    public int top(){ //fungsi untuk menampilkan elemen pertama dari atas (TOP)
        if(isEmpty()){
            return -1;
        }
        return array[TOP];
    }

	
}
