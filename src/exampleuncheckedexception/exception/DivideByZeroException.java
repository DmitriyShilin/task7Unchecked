package exampleuncheckedexception.exception;

public class DivideByZeroException extends RuntimeException{
    
    public DivideByZeroException(){        
    }
    
    @Override
    public String toString(){
        return "Exception: divide by zero";
    }
    
}
