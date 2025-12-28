public class stringmeth {
    public static void main(String[] args) {
        String firstname = "Lakhvinder";
        String secondname = " singh";
        System.out.println(firstname.concat(secondname));
        System.out.println(firstname.length());
        System.out.println(firstname.contains("a"));
        System.out.println(firstname.toLowerCase());
        System.out.println(firstname.toUpperCase());
        System.out.println(firstname.equals(secondname));
        System.out.println(firstname.equalsIgnoreCase(secondname));
        System.out.println(firstname.indexOf("e"));
        System.out.println(firstname.replace("e","a"));
        System.out.println(firstname.trim());
    }
}
