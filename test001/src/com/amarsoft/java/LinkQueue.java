package com.amarsoft.java;

public class LinkQueue {
    Node head;
    Node tail;
    int size;
    //造环
    public Node createNodeCircle(int len){
        if(len == 0) return null;
        for(int i = 0 ; i < len;i++){
            Node node = new Node(null,i);
            if(i == 0){
                node.next = node;
                head = node;
                tail = node;
            }else{
                node.next = tail.next;
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    // start 开始位置，deathNumber 死亡数字，playersNumber 玩家人数
    public int alive(int start,int deathNumber,int playersNumber){
        Node node = createNodeCircle(playersNumber);
        Node startNode = node;
        for(int i = 0;i < start-1; i++){
            startNode = startNode.next;
        }
        int count = 1;
        while(startNode!=null && startNode.next!=startNode){
            if(count == deathNumber-1){
                System.out.println("death"+startNode.next.number);
                startNode.next = startNode.next.next;
                count = 1;
            }else{
                count++;
            }
            startNode = startNode.next;
        }
        return  startNode.number;
    }

    public static void main(String[] args) {
        LinkQueue l = new LinkQueue();
        System.out.println(l.alive(2, 3, 7));
    }

    class Node{
        Node next;
        int number;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int i) {
            this.number = i;
        }

        public Node(Node next, int number) {
            this.next = next;
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
