package generic;

public class GenericTest {
    public static void main(String[] args) {
//        StringTest stringTest = new StringTest("This value showing from the String Class");
//        System.out.println(stringTest.getString());

        //Generic
        DataTypeTest<Integer> dataTypeTest = new DataTypeTest<Integer>(50);
        System.out.println(dataTypeTest.getDataType());

        DataTypeTest<Double> doubleDataTypeTest2 = new DataTypeTest<Double>(6456.00);
        System.out.println(doubleDataTypeTest2.getDataType());


    }
}
