package domain;

import java.util.Scanner;

public enum Gender {
    MAN('m'),
    WOMAN('w'),
    TRANSGENDER('t'),
    NON_BINARY('n'),

    UNINFORMED('u');

    private char value;

    public static Gender genderOption(char character){
        Scanner scanner = new Scanner(System.in);
        switch (character){
            case 'm','M'-> {return Gender.MAN;}
            case 'f','F'-> {return Gender.WOMAN;}
            case 't','T'-> {return Gender.TRANSGENDER;}
            case 'n','N'-> {return Gender.NON_BINARY;}
            default -> { return Gender.UNINFORMED;}
        }
    }
    Gender(char value) {
        this.value = value;
    }
}
