package se.lexicon.sequencers;

public class TodoItemSequencer {

    //fields
    private static int currentId;


    public static int nextId(){
        return ++currentId;
    }

    public static int getCurrentId(){
        return currentId;
    }

    public static void setCurrentId(int currentId){
        TodoItemSequencer.currentId = currentId;
    }
}
