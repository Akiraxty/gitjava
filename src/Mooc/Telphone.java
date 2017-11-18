package Mooc;

public class Telphone {
    float screen;
    float cpu;
    float mem;
    int var = 30;
    void call(){
        int localVar = 0 ;
        int var = 40;
        System.out.println("localVar"+localVar);
        System.out.println("var"+var);
        System.out.println("Telphone有打电话的功能");
    }
    void sendMessage(){

        System.out.println("var"+var);
        System.out.println("screen:"+screen+"cpu:"+cpu+"mem:"+mem+"Telphone有发短信的功能");
    }
    public Telphone(){
        System.out.println("午餐");
    }
    public Telphone(float newScreen,float newCpu,float newMem){
        screen = newScreen;
        cpu = newCpu;
        mem = newMem;
        System.out.println("有残");
    }

}
