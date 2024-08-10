import java.util.Scanner;

public class Postfix
{
  int n;
  int top = -1;
  int index = 0;
  String[] stack;
  String Infixs = "";
  String POSTFIX = "";
  char[] Infix ;

  public void start()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Infix string: ");
    Infixs = sc.nextLine();
    // Infixs = "a+b*c";
    stack = new String[Infixs.length()];
    Infixs = Infixs.toLowerCase();
    Infix = Infixs.toCharArray();
    for (int i = 0; i < Infix.length; ++i) {
      //check for character between a-z
      if(Infix[i]>96 && Infix[i]<123){
        POSTFIX+=String.valueOf(Infix[i]);
      }

      //check for opening bracket
      else if(Infix[i] == '('){
        Push(stack,top,String.valueOf(Infix[i]));
      }

      //check for closing bracket
      else if(Infix[i] == ')'){
        while(top!=-1 && !stack[top].equals("(")) {
          POSTFIX+= stack[top];
          Pop(stack,top);
        }
        Pop(stack,top);
      }
      else{
        while(top!=-1 && Prec(Infix[i])<=Prec(stack[top].charAt(0))){
          POSTFIX+=Pop(stack,top);
        } 
        Push(stack,top,String.valueOf(Infix[i]));
      }

    }
    while(top!=-1){
      POSTFIX += Pop(stack,top);
    }
    System.out.println("Postfix string is: "+POSTFIX);
  }
 
  static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
  
        case '*':
        case '/':
        case '%':
          return 2;
  
        case '^':
            return 3;
        }
        return -1;
    }

  public void Push(String[] stack,int top,String val) {
    if (this.top + 1 >= this.stack.length) {
      System.out.println("Element cannot be inserted.");
      System.out.println("There is no Space in Stack.");
      System.out.println("Stack overflow.....");
    } else {
      this.top++;
      this.stack[this.top] = val;
    }
  }

  public String Pop(String[] stack,int top) {
    if (this.top == -1) {
      System.out.println("No elements to Pop.");
      System.out.println("Stack Underflow");
      return "";
    } else {
      this.top -= 1;
      return this.stack[this.top+1];
    }
  }

  public static void main(String[] args) {
    Postfix m = new Postfix();
    m.start();
  }
}
