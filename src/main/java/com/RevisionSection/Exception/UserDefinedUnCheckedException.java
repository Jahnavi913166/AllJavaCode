package com.RevisionSection.Exception;

//age
class InvalidUserInputException extends RuntimeException {

    InvalidUserInputException(String msg) {
        super(msg);
    }

}

class UserInputValidator {
    private int age;

    public void validAge(int age) {
     if(age<18){
         throw new InvalidUserInputException("you are not eligible for vote");
     }
    }

}


public class UserDefinedUnCheckedException {
    public static void main(String[] args) {
        UserInputValidator userInputValidator=new UserInputValidator();
        userInputValidator.validAge(11);
    }
}
