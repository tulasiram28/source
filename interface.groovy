public class base {
public static void main (String[] args) {
sum obj = new sum()
obj.additon(5,6)
}
}

public interface adds {
void additon (int a, int b)
}

public class sum implements adds {
void additon (int a, int b) {
println("addition is=" + (a+b))
}
}
