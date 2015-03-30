/**
 *
 */
public class MyStrings {
    private String text;

    public MyStrings(String string){
        text=string;
    }

    public String getText(){
        return text;
    }

    public void insertaftersub(String string){
        StringBuffer str = new StringBuffer(text);
        System.out.println(text);      //вывод текста
        int i=0;        //позиция начала первого слова (заданой подстроки )
        int pos1=0;   //куда надо вставить
        while ((pos1 = text.indexOf("ed ", i)) != -1)  // перебор текста
        {
            pos1 += 3;  //через сколько позиций от начала подстроки нужно вставить текст
            str.insert(pos1, string);  //вставка в указаную позицию текста
            i = pos1;
        }
        System.out.println("\n"+str);

    }

    public void deltextaftersub(String string){

    }

    /*@Override
    public String toString() {
        return "MyStrings{" +
                "text='" + text + '\'' +
                '}';
    }*/

    public static void main (String [] args){
        String text= "James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java " +
                "language project in June 1991.\nJava was originally designed for interactive television, but it was" +
                " too advanced for the digital\ncable television industry at the time. The language was initially" +
                " called Oak after an oak tree \nthat stood outside Gosling's office; it went by the name Green later, " +
                "and was later renamed Java, from \nJava coffee, said to be consumed in large quantities by the " +
                "language's creators.\nGosling aimed to implement a virtual machine and a language that had a familiar" +
                " C/C++ style of notation.";
        MyStrings strings=new MyStrings(text);
        strings.insertaftersub("HELLO WORLD ");


    }
}
