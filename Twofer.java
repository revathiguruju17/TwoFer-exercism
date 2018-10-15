import java.util.Objects;

class Twofer {
    String twofer(String name) {
        String nullString = null;
        if(Objects.equals(name, nullString)){
            return "One for you, one for me.";
        }
        return "One for "+name+", one for me.";
    }
}
