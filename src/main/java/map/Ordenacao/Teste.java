package main.java.map.Ordenacao;

import java.util.Optional;

public class Teste {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");
        System.out.println(result);
    }
}
