package storage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public interface IGenericReadWriteData<T> {
    ArrayList<T> readData() throws FileNotFoundException;
    void writeData(ArrayList<T> list) throws IOException;
}
