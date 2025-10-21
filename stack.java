package CBCLASS;
public class stack {
private int [] arr;
private int idx = -1;
public stack(){
this(5);
}
public stack (int n){
    arr = new int[n];
}
public boolean isempty(){
    return idx == -1;
}
public int  size(){
return idx+1;
}
public boolean  isfull(){
    return size() == arr.length;

}
public void push(int item) throws Exception {
    if(isfull()){
        throw new Exception("full stack");
    }
    arr[++idx] = item;
}
public int pop()throws Exception{
    if(isempty()){
        throw new Exception("stack full");
    }
    return arr[idx--];
}
public void display(){
    for(int i = 0 ; i<=idx; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
}
