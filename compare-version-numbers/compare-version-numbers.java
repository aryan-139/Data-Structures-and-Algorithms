class Solution {
    public int compareVersion(String version1, String version2) {
        //simply creating two arrays which contain the version number which is split using the regex of \\.
    String[] levels1 = version1.split("\\.");
    String[] levels2 = version2.split("\\.");
    //run through the maximum length of levels
    int length = Math.max(levels1.length, levels2.length);
    for (int i = 0; i < length; i++) {
        //keeep comparing the v1 and v2 that is the version numbers and if at any point it is less or greater then return, if equal then continue
        Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
        Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
        int compare = v1.compareTo(v2);
        if (compare != 0) {
            return compare;
        }
    }
    
    return 0;
}
}