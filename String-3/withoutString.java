public String withoutString(String base, String remove) {

    return base.replaceAll("(?i)" + java.util.regex.Pattern.quote(remove), "");
}
