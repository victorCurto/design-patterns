package structuralPatterns.decorator.example1;

import structuralPatterns.decorator.example1.decorators.*;

public class DemoClient {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSource SimpleDataReaderWriter = new FileDataSource("out/OutputDemo.txt");
        DataSource encryptionDecorator = new EncryptionDecorator(SimpleDataReaderWriter);
        DataSource encoded = new CompressionDecorator(encryptionDecorator);
        /*
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        */
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
