public boolean squirrelPlay(int temp, boolean isSummer) {
    int upperLimit = isSummer ? 100 : 90;


    if (temp >= 60 && temp <= upperLimit) {
        return true;
    } else {
        return false;
    }
}
