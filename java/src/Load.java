import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.net.MalformedURLException;
import java.net.URL;

public class Load {

    private static final int STATUS_OK = 200;

    /**
     * Implements Unirest to make an API request.
     * @param url String of URL
     * @throws UnirestException if URL cannot be retrieved as String
     * @throws MalformedURLException if the user has inputted a bad URL
     * @throws InstantiationException if Unirest does not signal that the retrival
     * was successful, an error will be assumed to have occured.
     */
    static void makeApiRequest(String url) throws UnirestException, MalformedURLException, InstantiationException {
        final HttpResponse<String> stringHttpResponse;

        // This will throw MalformedURLException if the url is malformed.
        new URL(url);

        stringHttpResponse = Unirest.get(url).asString();
        // Check to see if the request was successful; if so, convert the payload JSON into Java objects
        if (stringHttpResponse.getStatus() != STATUS_OK) {
            throw new InstantiationException();
        }
    }

    /**
     * Converts makes an API request on a URL string and returns the body of the JSON file as a String.
     * @param url String
     * @return String with JSON file as a String
     */
    public static String getUrlContentsAsString(String url) {

        //Make an HTTP request to the above URL
        try {
            makeApiRequest(url);
        } catch (UnirestException e) {
            e.printStackTrace();
            System.out.println("Network not responding");
        } catch (MalformedURLException e) {
            System.out.println("url To JSON string catch");

            System.out.println("Bad URL: " + url);
        } catch (InstantiationException e) {
            System.out.println("Instantiation exception");
        }

        HttpResponse<String> stringHttpResponse = null;
        try {
            stringHttpResponse = Unirest.get(url).asString();
        } catch (UnirestException e) {
            e.printStackTrace();
            System.out.println("Network not responding");
        }
        String httpResponseBody = stringHttpResponse.getBody();
        return httpResponseBody;
    }
}
