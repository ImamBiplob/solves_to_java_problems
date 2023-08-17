package StringBufferVsStringBuilder;

public class StringBufferStringBuilder {
    public static void main(String[] args) {

        // String objects are immutable while StringBuffer and StringBuilder objects are mutable
        // StringBuffer objects are synchronous and thread-safe while StringBuilder objects are not
        // StringBuilder is preferred in single threaded program and in loop operations since it is faster than StringBuffer

        StringBuffer sbf = new StringBuffer("Imam");
        sbf.append(12);
        sbf.reverse();
        System.out.println(sbf);
        System.out.println(sbf.insert(2,"Biplob"));

        StringBuilder sbl = new StringBuilder("Imam");
        sbl.append("Biplob");
        System.out.println(sbl);
        System.out.println(sbl.indexOf("m"));
        System.out.println(sbl.lastIndexOf("m"));

        // StringBuffer to StringBuilder conversion
        String str = sbf.toString();
        StringBuilder sbl2 = new StringBuilder(str);
        System.out.println(sbl2);

    }

}
