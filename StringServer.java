import java.io.IOException;
import java.net.URI;

public String handleRequest(URI url) {
        String messages = "";
        if (url.getPath().equals("/")) {
            return String.format(messages);
        }
        else if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    num += "\n" + messages;
                    return String.format(messages);
                }
            }
            return "404 Not Found!";
        }
    }
