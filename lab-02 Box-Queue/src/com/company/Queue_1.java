package com.company;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_1 {
    private Queue<Integer> queue = new LinkedList<Integer>();
    private int max_list;
    private int count =0;
    public Queue_1() {
        this.max_list = Integer.MAX_VALUE;
        this.queue = new LinkedList<Integer>();
        }

    public Queue_1(int max_list) {
        this.max_list = max_list;
        this.queue = new LinkedList<Integer>();

    }
    public void print_list(){
        System.out.println(this.queue);
    }
    public void veri(){
        if(this.count == 0){
            System.out.print("Queue nu are elemente");
        }else{
            System.out.print("Sunt "+this.count+" elemente");
        }
    }
    public void adauga(int a){
        this.max_list = max_list;
        this.queue.add(a);
        this.count++;
    }
    public void delete(){
        this.queue.remove();
        this.count--;
    }
}
