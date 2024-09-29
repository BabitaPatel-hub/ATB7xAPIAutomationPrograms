package org.babita04patel;

public class BuilderDesignPatternJava {

    public BuilderDesignPatternJava stage1(){
        System.out.println("Stage1 is done");
        return this;
    }

    public BuilderDesignPatternJava stage2(){
        System.out.println("Stage2 is done");
        return this;
    }

    public BuilderDesignPatternJava stage3(String name){
        System.out.println("Stage3 is done");
        return this;
    }

    public static void main(String[] args) {

        BuilderDesignPatternJava bp = new BuilderDesignPatternJava();
        bp.stage1().stage2().stage3("Babita");
    }
}
