// Switch Statement Example

System.out.println("Now Switch Statement example Start.");
Scanner val = new Scanner(System.in);
int inp = val.nextInt();
switch(inp){
    case 1:System.out.println("Hello Bro!");
    break;
    case 2:System.out.println("Hii Bro!");
    break;
    case 3: {
        System.out.println("Namsate Bro!");
        System.out.println("Namsate Bro! Again.");
        }
    break;
    default :System.out.println("Defaut line Always execute when any option not matched!.");
}