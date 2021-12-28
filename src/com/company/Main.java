package com.company;

public class Main {

    public static void main(String[] args) {

        Node<Integer> l1 = new Node<Integer>(8,
                new Node<Integer>(12,
                        new Node<Integer>(40,
                                new Node<Integer>(52,
                                        new Node<Integer>(77,
                                                new Node<Integer>(6,
                                                        new Node<Integer>(165)))))));
        Node<Integer> l2 = new Node<Integer>(1,
                new Node<Integer>(10,
                        new Node<Integer>(77,
                                new Node<Integer>(12,
                                        new Node<Integer>(165,
                                                new Node<Integer>(52,
                                                        new Node<Integer>(500)))))));
        //System.out.println(isAsc(l1));
        printChain(diffList(l1,l2));
    }

    /**
     *
     * @param l1
     * @param l2
     * @return
     */
    public static Node<Integer> diffList(Node<Integer> l1,
                                         Node<Integer> l2){
        Node<Integer> tmp1 = l1;
        Node<Integer> tmp2 = l2;

        //fishy solution
        Node<Integer> l3 = new Node<>(Integer.MAX_VALUE);
        Node<Integer> tmp3 = l3;

        while(tmp1 != null){
            int val = tmp1.getValue();
            if(!isExist(tmp2, val)){
                tmp3.setNext(new Node<>(val));
                tmp3 = tmp3.getNext();
            }
            tmp1 = tmp1.getNext();
        }
        return l3.getNext();
    }

    /**
     *
     * @param p
     * @param value
     * @return true if value is in chain
     */
    public static boolean isExist(Node<Integer> p, int value){
        Node<Integer> tmp = p;
        while(tmp.hasNext()){
            if(tmp.getValue() == value)
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }
    /**
     * lesson 28/12
     * exercise from presentation
     * check if a given chain is sorted in asc order
     * ...add the missing comments structure
     */
    public static boolean isAsc(Node<Integer> p){
        boolean sorted = true;
        Node<Integer> tmp = p;
        Node<Integer> nxtTmp = p.getNext();

        while(nxtTmp != null){
            if(tmp.getValue() >= nxtTmp.getValue())
                sorted = false;
            nxtTmp = nxtTmp.getNext();
            tmp = tmp.getNext();
        }
        return sorted;
    }
    /**
     * add the node to the correct place in the sorted chain
     * @param chain - a sorted chain of integers
     * @param nd
     */
    public static void addToSortList(Node<Integer> chain,
                                     Node<Integer> nd){
        Node<Integer> tmp = chain;
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

    /**
     * prints the given chain
     * @param chain
     */
    public static void printChain(Node<Integer> chain){
        while (chain != null) {
            System.out.print(chain.getValue() +" -> ");
            chain = chain.getNext();
        }
    }


}
