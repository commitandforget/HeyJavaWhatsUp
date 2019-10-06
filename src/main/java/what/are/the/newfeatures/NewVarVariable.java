package what.are.the.newfeatures;

public class NewVarVariable {

    public static void main(String[] strings) {

        var someString="The var keyword that has been introduced can replace strict variable type declaration if the type may be easily inferred by the compiler. Therefore we can type less, don’t need to duplicate type information and it just makes the code look nicer.\n" +
                "We can use var in the context of local variables (instantly initialized), for loops and try-with-resources blocks.";
        var charactersInSomeString = someString.toCharArray();

        for (var character : charactersInSomeString) {
            System.out.println(character);
        }

    }

}
