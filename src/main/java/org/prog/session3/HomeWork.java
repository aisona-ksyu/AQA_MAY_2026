package org.prog.session3;

//TODO: print only valid emails
//TODO: valid email has:
//TODO: - at least 3 symbols before @
//TODO: - at least 7 symbols in domain (after @) (cannot start or end with dot)
//TODO: - 1 dot in domain
//TODO: - only one @

public class HomeWork {

    public static void main(String[] args) {
        String[] emails = {
                "asd.asd@asd.asd", //+
                "aa@asd.asd",
                "...@asd.asd", //+
                "asd.asd@asdasd.",
                "asd.asd@.asdasd",
                "asd@@.asdasd",
                "asd@@asd.asd",
                "some_email_that_is_very_long@long_domain_name.com",//+
                "back@to@ asdasd",
                "asd@TA.com",
                "asd@TRatata.com.com",
        "asd.as@email.com"};
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].contains("@")) {
                String domain = emails[i].substring(emails[i].indexOf("@") + 1);

                if (domain.indexOf(".") == domain.lastIndexOf(".")
                        && emails[i].indexOf("@") >= 3
                        && domain.length() >= 7
//                    && !emails[i].contains("@@")
//                        && emails[i].lastIndexOf(".") > emails[i].indexOf("@")
                        && emails[i].indexOf("@") == emails[i].lastIndexOf("@")
                        && !domain.startsWith(".")
                        && !domain.endsWith(".")
                ) {
                    System.out.println("Valid email - " + emails[i]);
                }
            }
        }

    }
}