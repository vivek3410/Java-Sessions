package Command_line_Args;

public class Example {
    
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        for(int i=0;i<args.length;i++){
            System.out.print(args[i] + " ");
        }

    }
}
