package dec26;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractAttributes {

    public static void main(String[] args) {
        String document = "<html><head><title>My Page</title></head><body><p>This is my page.</p></body></html>";

        // Create a Pattern object for the HTML tag
        Pattern pattern = Pattern.compile("<([^>]+)>(.*)</([^>]+)>");

        // Create a Matcher object for the document
        Matcher matcher = pattern.matcher(document);

        // Create a Map to store the attributes
        Map<String, String> attributes = new HashMap<>();

        // Iterate over the matches
        while (matcher.find()) {
            // Get the tag name
            String tagName = matcher.group(1);

            // Get the attribute values
            String[] attributeValues = matcher.group(2).split(" ");

            // Iterate over the attribute values
            for (String attributeValue : attributeValues) {
                // Split the attribute value into the name and value
                String[] attribute = attributeValue.split("=");

                // Add the attribute to the Map
                attributes.put(attribute[0], attribute[1].replace("\"", ""));
            }
        }

        // Print the attributes
        for (String attributeName : attributes.keySet()) {
            System.out.println(attributeName + ": " + attributes.get(attributeName));
        }
    }
}