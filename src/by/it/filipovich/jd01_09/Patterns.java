package by.it.filipovich.jd01_09;

class Patterns {

    static final String SCALAR = "(-?)([0-9\\.])+";
    static final String VECTOR = "\\{((-?)([0-9\\.])+,?)+}";
    //static final String VECTOR = "\\{("+SCALAR+",?)+}";
    static final String MATRIX = "\\{("+VECTOR+",?)+}";

    static final String OPERATIONS = "[+\\-*/]";
}
