public class WordProcessor {
    String text = "";

    public String toUpperCase() {
        text = text.toUpperCase();
        return text;
    }

    public String toLowerCase() {
        text = text.toLowerCase();
        return text;
    }

    public String toSnakeCase() {
        text = text.toLowerCase();
        text = text.trim().replaceAll("\\s+", "_");
        return text;
    }

    public String toCamelCase() {
        return "4";
    }


    public String toPascalCase() {
        return "5";
    }


    public String toKebabCase() {
        return "6";
    }


    public String toTitleCase() {
        return "7";
    }

    public void setText(String textInput) {
        text = textInput;
    }


    public String getText() {
        return text;
    }
}
