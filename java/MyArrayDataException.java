import java.text.MessageFormat;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int column){
        super(MessageFormat.format("Неверные данные в ячейке(-ах) ", row, column));
    }
}
