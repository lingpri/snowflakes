package my.priya;



import java.util.ArrayList;

class Matrix<E> {

    private ArrayList<E> elements = new ArrayList<>();

    /**  Constructs empty matrix **/
    public Matrix(){

    }

    /**  Constructs r X c matrix with all elements initialized to null  **/
    public Matrix(int r, int c){
        String str = "";

        for(int i=0;i<r;i++){
            str = str + "0";
        }
        for(int i=0; i<r; i++){
            ArrayList<E> list = new ArrayList<>();
            for(int j=0;j<c;j++){
                list.add((E) str);
            }
            elements.add((E) list);
        }

    }

    /** Constructs r X c matrix will all elements initialized to value  **/
    public Matrix(int r, int c, E value) {
        for (int i = 0; i < r; i++) {
            ArrayList<E> list = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                list.add(value);
            }
           elements.add((E) list);
        }


    }
    /** Constructs a matrix with r rows and allows the user to choose the length of each row, calls
     displayMatrix, then allows data to be entered in each row(think ragged array)xtra credit  **/
    public Matrix(int r){

    }

    /**  Returns the number of rows of matrix  **/
    public int getRows(){
        if(elements.size() > 0) {
            return elements.size();
        }
        return 0;
    }


    /**  Returns the number of columns in a particular row (length of the row)  **/
    public int getCols(int r){
        if(elements.size() > 0) {
            ArrayList<E> cols = (ArrayList<E>) elements.get(r);
            return cols.size();
        }
        return 0;
    }


    /**  Returns the number of items in the matrix  **/
    public int getSize(){
        return getRows() * getCols(elements.size());

    }


    /**  Returns a matrix object value at (r,c) location.  If (r, c) is out of bounds generate an
     appropriate error message and return null) **/
    public Matrix getValue(int r, int c){
        E elem = null;
        for (int i = 0; i < getRows(); i++) {
            ArrayList<E> test = (ArrayList<E>) this.elements.get(i);
            for (int j = 0; j < test.size(); j++) {
                if(r==i && j ==c)
                  elem =   test.get(j);
            }
        }
        return new Matrix((Integer) elem);
    }


    /**  Alters Matrix object value at (r,c) to value.  If (r, c) is out of bounds generate an
     appropriate error message)  **/
    public void setValue(int r, int c, E value){
       for (int i = 0; i < getRows(); i++) {
            ArrayList<E> test = (ArrayList<E>) this.elements.get(i);
            for (int j = 0; j < test.size(); j++) {
                if(r==i && j ==c)
                        test.set(j,value);
            }
        }
    }

    /**  Displays matrix in two-dimensional matrix format, if a value is null, print 0 **/
    public void displayMatrix(String str){
        if(this.elements.size()==0)
            System.out.println(str+ " has no elements");
        else {
                System.out.println(str);
                for (E e : this.elements) {
                    System.out.println(e);
                }
        }

    }

    /**  Resizes matrix to new rows X cols size, copies all possible
     previous values and initializes new elements to null    **/
    public void resize(int rows, int cols){

    }

    /**  Resizes matrix to new rows and allows the user to choose the length of each row (think
     ragged array), copies all possible previous values and initializes new elements to null
     xtra credit **/
    public void resize(int rows) {

    }


    //  private attributes including the arrayList object are declared here

}
