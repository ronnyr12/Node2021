package com.company;

public class Main {

    public static void main(String[] args) {



        Node<Integer> chain = new Node<Integer>(-12,
                new Node<Integer>(-9,
                        new Node<Integer>(12,
                                new Node<Integer>(100,
                                        new Node<Integer>(188)))));



    }

    /**
     * adds the new node to the of the chain
     * @param chain
     * @param nwNode
     */
    public static void addTolast(Node<Integer> chain,
                                 Node<Integer> nwNode){
        Node<Integer> tmp = chain;
        while(tmp.hasNext()){
            tmp = tmp.getNext();
        }
        tmp.setNext(nwNode);
    }

    /**
     * add the new node to beging of the chain
     * @param chain
     * @param nwNode
     */
    public static void addToStart(Node<Integer> chain,
                                  Node<Integer> nwNode){
        nwNode.setNext(chain);
        chain = nwNode;
    }
    public static void printChain(Node<Integer> chain){
        while (chain != null) {
            System.out.print(chain.getValue() +" -> ");
            chain = chain.getNext();
        }
    }


}
