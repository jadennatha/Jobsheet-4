public class coba2varargs {
    public static void main(String[] args) {
        contohDuaTipeVarargs(new String[]{"A", "B", "C"}, new Integer[]{1, 2, 3});
    }

    public static void contohDuaTipeVarargs(Object[]... arrays) {
        for (Object[] array : arrays) {
            for (Object elem : array) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}