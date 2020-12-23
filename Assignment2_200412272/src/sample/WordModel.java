package sample;

import java.util.List;

public class WordModel {

    public short score = 0;
    private String word;
    private String scoreString;
    private static final short scoreA = 1, scoreB = 3, scoreC = 3, scoreD = 2, scoreE = 1, scoreF = 4, scoreG = 2, scoreH = 4, scoreI = 1,
                               scoreJ = 8, scoreK = 5, scoreL = 1, scoreM = 3, scoreN = 1, scoreO = 1, scoreP = 3, scoreQ = 10, scoreR = 1,
                               scoreS = 1, scoreT = 1, scoreU = 1, scoreV = 4, scoreW = 4, scoreX = 8, scoreY = 4, scoreZ = 10;

    private static final char a = 'a', b = 'b', c = 'c', d = 'd', e = 'e', f = 'f', g = 'g', h = 'h', ii = 'i', j = 'j', k = 'k', l = 'l', m = 'm',
                             n = 'n', o = 'o', p = 'p', q = 'q', r = 'r', s = 's', t = 't', u = 'u', v = 'v', w = 'w', x = 'x', y = 'y', z = 'z';

    public WordModel() {
    }

    public WordModel(String word) {
        this.word = word;
        scoreCalculator();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getScoreString() {
        return scoreString;
    }

    public void setScoreString(String scoreString) {
        this.scoreString = scoreString;
    }

    private void scoreCalculator() {

        char[] ch = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {

            ch[i] = word.toLowerCase().charAt(i);

            if(ch[i] == a) score += scoreA;
            else if(ch[i] == b) score += scoreB;
            else if(ch[i] == c) score += scoreC;
            else if(ch[i] == d) score += scoreD;
            else if(ch[i] == e) score += scoreE;
            else if(ch[i] == f) score += scoreF;
            else if(ch[i] == g) score += scoreG;
            else if(ch[i] == h) score += scoreH;
            else if(ch[i] == ii) score += scoreI;
            else if(ch[i] == j) score += scoreJ;
            else if(ch[i] == k) score += scoreK;
            else if(ch[i] == l) score += scoreL;
            else if(ch[i] == m) score += scoreM;
            else if(ch[i] == n) score += scoreN;
            else if(ch[i] == o) score += scoreO;
            else if(ch[i] == p) score += scoreP;
            else if(ch[i] == q) score += scoreQ;
            else if(ch[i] == r) score += scoreR;
            else if(ch[i] == s) score += scoreS;
            else if(ch[i] == t) score += scoreT;
            else if(ch[i] == u) score += scoreU;
            else if(ch[i] == v) score += scoreV;
            else if(ch[i] == w) score += scoreW;
            else if(ch[i] == x) score += scoreX;
            else if(ch[i] == y) score += scoreY;
            else if(ch[i] == z) score += scoreZ;
        }
        String storeConverted = String.valueOf(score);
        setScoreString(storeConverted);
    }
    WordController wordController = new WordController();
    public String getWordBank(List oldWords) {
        String words;
        if (oldWords.size() == 1) {
            words = "(" + oldWords.get(0) + ")";
        } else {
            words = "(";
            for (int i = 0; i < oldWords.size(); i++) {
                if (i != oldWords.size() - 1)
                    words = words + oldWords.get(i) + ",\n";
                else
                    words = words + oldWords.get(i);
            }
            words = words + ")";
        }
        return words;
    }
}
