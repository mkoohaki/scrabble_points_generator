package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class WordController {

    @FXML
    TextField word;

    @FXML
    Label result, totalResult;

    @FXML
    TextArea history;

    @FXML
    Button submitAlabel, submitBlabel, submitClabel, submitDlabel, submitElabel, submitFlabel, submitGlabel, submitHlabel,
           submitIlabel, submitJlabel, submitKlabel, submitLlabel, submitMlabel, submitNlabel, submitOlabel, submitPlabel,
           submitQlabel, submitRlabel, submitSlabel, submitTlabel, submitUlabel, submitVlabel, submitWlabel, submitXlabel,
           submitYlabel, submitZlabel;

    @FXML
    Label labelA, labelB, labelC, labelD, labelE, labelF, labelG, labelH, labelI, labelJ, labelK, labelL, labelM, labelN, labelO,
          labelP, labelQ, labelR, labelS, labelT, labelU, labelV, labelW, labelX, labelY, labelZ;

    private Window window = new Window();
    private Alert alert = new Alert(Alert.AlertType.ERROR);

    private static final int MAXIMUM_LETTER_NUMBER = 8;
    private static final int MINIMUM_LETTER_NUMBER = 2;
    private static final int MINIMUM_VOWEL_LETTER_NUMBER = 1;
    private short totalScore = 0;
    private short totalCount = 0;
    private String newWord;
    private ArrayList<String> wordBank = new ArrayList<String>();

    private static final int MAXIMUM_NUMBER_OF_A = 9, MAXIMUM_NUMBER_OF_B = 2, MAXIMUM_NUMBER_OF_C = 2, MAXIMUM_NUMBER_OF_D = 4,
                             MAXIMUM_NUMBER_OF_E = 12, MAXIMUM_NUMBER_OF_F = 2, MAXIMUM_NUMBER_OF_G = 3, MAXIMUM_NUMBER_OF_H = 2,
                             MAXIMUM_NUMBER_OF_I = 8, MAXIMUM_NUMBER_OF_J = 1, MAXIMUM_NUMBER_OF_K = 1, MAXIMUM_NUMBER_OF_L = 4,
                             MAXIMUM_NUMBER_OF_M = 2, MAXIMUM_NUMBER_OF_N = 6, MAXIMUM_NUMBER_OF_O = 8, MAXIMUM_NUMBER_OF_P = 2,
                             MAXIMUM_NUMBER_OF_Q = 1, MAXIMUM_NUMBER_OF_R = 6, MAXIMUM_NUMBER_OF_S = 4, MAXIMUM_NUMBER_OF_T = 6,
                             MAXIMUM_NUMBER_OF_U = 4, MAXIMUM_NUMBER_OF_V = 2, MAXIMUM_NUMBER_OF_W = 2, MAXIMUM_NUMBER_OF_X = 1,
                             MAXIMUM_NUMBER_OF_Y = 2, MAXIMUM_NUMBER_OF_Z = 1, TOTAL_NUMBER_OF_LETTERS = 97;

    public static final char a = 'a', b = 'b', c = 'c', d = 'd', e = 'e', f = 'f', g = 'g', h = 'h', ii = 'i', j = 'j', k = 'k',
                             l = 'l', m = 'm', n = 'n', o = 'o', p = 'p', q = 'q', r = 'r', s = 's', t = 't', u = 'u', v = 'v',
                             w = 'w', x = 'x', y = 'y', z = 'z';

    public int counterA = MAXIMUM_NUMBER_OF_A, counterB = MAXIMUM_NUMBER_OF_B, counterC = MAXIMUM_NUMBER_OF_C, counterD = MAXIMUM_NUMBER_OF_D,
               counterE = MAXIMUM_NUMBER_OF_E, counterF = MAXIMUM_NUMBER_OF_F, counterG = MAXIMUM_NUMBER_OF_G, counterH = MAXIMUM_NUMBER_OF_H,
               counterI = MAXIMUM_NUMBER_OF_I, counterJ = MAXIMUM_NUMBER_OF_J, counterK = MAXIMUM_NUMBER_OF_K, counterL = MAXIMUM_NUMBER_OF_L,
               counterM = MAXIMUM_NUMBER_OF_M, counterN = MAXIMUM_NUMBER_OF_N, counterO = MAXIMUM_NUMBER_OF_O, counterP = MAXIMUM_NUMBER_OF_P,
               counterQ = MAXIMUM_NUMBER_OF_Q, counterR = MAXIMUM_NUMBER_OF_R, counterS = MAXIMUM_NUMBER_OF_S, counterT = MAXIMUM_NUMBER_OF_T,
               counterU = MAXIMUM_NUMBER_OF_U, counterV = MAXIMUM_NUMBER_OF_V, counterW = MAXIMUM_NUMBER_OF_W, counterX = MAXIMUM_NUMBER_OF_X,
               counterY = MAXIMUM_NUMBER_OF_Y, counterZ = MAXIMUM_NUMBER_OF_Z;

    @FXML
    public void submit(ActionEvent event) throws IOException {

        int vowelLetterNumber = 0;
        String vowelLetters = "aeiouy";
        String validCharacters = "abcdefghijklmnopqrstuvwxyz";
        boolean notAllowedCharacter = true;
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0, countG = 0, countH = 0, countI = 0,
            countJ = 0, countK = 0, countL = 0, countM = 0, countN = 0, countO = 0, countP = 0, countQ = 0, countR = 0,
            countS = 0, countT = 0, countU = 0, countV = 0, countW = 0, countX = 0, countY = 0, countZ = 0;
        String inputWord = word.getText();
        char[] ch = new char[word.getLength()];

        if (((countA < counterA  || countE < counterE || countI < counterI || countO < counterO || countU < counterU || countY < counterY) && totalCount != TOTAL_NUMBER_OF_LETTERS-1)) {
            if (!word.getText().equals("")) {
                if (word.getLength() >= MINIMUM_LETTER_NUMBER) {
                    if (word.getLength() <= MAXIMUM_LETTER_NUMBER) {
                        for (int i = 0; i < word.getLength(); i++) {

                            ch[i] = word.getText().toLowerCase().charAt(i);

                            if (!validCharacters.contains(Character.toString(ch[i]))) {
                                notAllowedCharacter = false;
                                break;
                            }
                            if (vowelLetters.contains(Character.toString(ch[i]))) {
                                vowelLetterNumber++;
                            }
                        }
                        if (vowelLetterNumber >= MINIMUM_VOWEL_LETTER_NUMBER) {
                            if (notAllowedCharacter) {

                                for (int i = 0; i < word.getLength(); i++) {

                                    ch[i] = word.getText().toLowerCase().charAt(i);

                                    if (ch[i] == a) countA++;
                                    else if (ch[i] == b) countB++;
                                    else if (ch[i] == c) countC++;
                                    else if (ch[i] == d) countD++;
                                    else if (ch[i] == e) countE++;
                                    else if (ch[i] == f) countF++;
                                    else if (ch[i] == g) countG++;
                                    else if (ch[i] == h) countH++;
                                    else if (ch[i] == ii) countI++;
                                    else if (ch[i] == j) countJ++;
                                    else if (ch[i] == k) countK++;
                                    else if (ch[i] == l) countL++;
                                    else if (ch[i] == m) countM++;
                                    else if (ch[i] == n) countN++;
                                    else if (ch[i] == o) countO++;
                                    else if (ch[i] == p) countP++;
                                    else if (ch[i] == q) countQ++;
                                    else if (ch[i] == r) countR++;
                                    else if (ch[i] == s) countS++;
                                    else if (ch[i] == t) countT++;
                                    else if (ch[i] == u) countU++;
                                    else if (ch[i] == v) countV++;
                                    else if (ch[i] == w) countW++;
                                    else if (ch[i] == x) countX++;
                                    else if (ch[i] == y) countY++;
                                    else if (ch[i] == z) countZ++;
                                }

                                if (countA <= counterA && countB <= counterB && countC <= counterC && countD <= counterD &&
                                        countE <= counterE && countF <= counterF && countG <= counterG && countH <= counterH &&
                                        countI <= counterI && countJ <= counterJ && countK <= counterK && countL <= counterL &&
                                        countM <= counterM && countN <= counterN && countO <= counterO && countP <= counterP &&
                                        countQ <= counterQ && countR <= counterR && countS <= counterS && countT <= counterT &&
                                        countU <= counterU && countV <= counterV && countW <= counterW && countX <= counterX &&
                                        countY <= counterY && countZ <= counterZ) {

                                    if (addWord(inputWord)) {

                                        try {
                                            labelA.setText(String.valueOf(counterA -= countA)); if(counterA == 0) submitAlabel.setText("");
                                            labelB.setText(String.valueOf(counterB -= countB)); if(counterB == 0) submitBlabel.setText("");
                                            labelC.setText(String.valueOf(counterC -= countC)); if(counterC == 0) submitClabel.setText("");
                                            labelD.setText(String.valueOf(counterD -= countD)); if(counterD == 0) submitDlabel.setText("");
                                            labelE.setText(String.valueOf(counterE -= countE)); if(counterE == 0) submitElabel.setText("");
                                            labelF.setText(String.valueOf(counterF -= countF)); if(counterF == 0) submitFlabel.setText("");
                                            labelG.setText(String.valueOf(counterG -= countG)); if(counterG == 0) submitGlabel.setText("");
                                            labelH.setText(String.valueOf(counterH -= countH)); if(counterH == 0) submitHlabel.setText("");
                                            labelI.setText(String.valueOf(counterI -= countI)); if(counterI == 0) submitIlabel.setText("");
                                            labelJ.setText(String.valueOf(counterJ -= countJ)); if(counterJ == 0) submitJlabel.setText("");
                                            labelK.setText(String.valueOf(counterK -= countK)); if(counterK == 0) submitKlabel.setText("");
                                            labelL.setText(String.valueOf(counterL -= countL)); if(counterL == 0) submitLlabel.setText("");
                                            labelM.setText(String.valueOf(counterM -= countM)); if(counterM == 0) submitMlabel.setText("");
                                            labelN.setText(String.valueOf(counterN -= countN)); if(counterN == 0) submitNlabel.setText("");
                                            labelO.setText(String.valueOf(counterO -= countO)); if(counterO == 0) submitOlabel.setText("");
                                            labelP.setText(String.valueOf(counterP -= countP)); if(counterP == 0) submitPlabel.setText("");
                                            labelQ.setText(String.valueOf(counterQ -= countQ)); if(counterQ == 0) submitQlabel.setText("");
                                            labelR.setText(String.valueOf(counterR -= countR)); if(counterR == 0) submitRlabel.setText("");
                                            labelS.setText(String.valueOf(counterS -= countS)); if(counterS == 0) submitSlabel.setText("");
                                            labelT.setText(String.valueOf(counterT -= countT)); if(counterT == 0) submitTlabel.setText("");
                                            labelU.setText(String.valueOf(counterU -= countU)); if(counterU == 0) submitUlabel.setText("");
                                            labelV.setText(String.valueOf(counterV -= countV)); if(counterV == 0) submitVlabel.setText("");
                                            labelW.setText(String.valueOf(counterW -= countW)); if(counterW == 0) submitWlabel.setText("");
                                            labelX.setText(String.valueOf(counterX -= countX)); if(counterX == 0) submitXlabel.setText("");
                                            labelY.setText(String.valueOf(counterY -= countY)); if(counterY == 0) submitYlabel.setText("");
                                            labelZ.setText(String.valueOf(counterZ -= countZ)); if(counterZ == 0) submitZlabel.setText("");

                                            WordModel wordModel = new WordModel(inputWord);

                                            result.setText(wordModel.getScoreString());
                                            totalCount += (countA + countB + countC + countD + countE + countF + countG + countH + countI +
                                                    countJ + countK + countL + countM + countN + countO + countP + countQ + countR +
                                                    countS + countT + countU + countV + countW + countX + countY + countZ);
                                            int newScore = Integer.parseInt(wordModel.getScoreString());
                                            totalScore += newScore;
                                            totalResult.setText(String.valueOf(totalScore));
                                            history.setText(wordModel.getWordBank(wordBank));

                                            if (totalCount > TOTAL_NUMBER_OF_LETTERS - 2) {
                                                window.open("gameOver", "Word Creator", 400, 200);
                                                window.close(event);
                                            }
                                            word.setText("");
                                        } catch (Exception e) {
                                            System.err.println("Cannot load file! " + e);
                                        }
                                    } else {
                                        alert.setTitle("Incorrect credentials!");
                                        alert.setContentText("Word is a duplicate, try again!");
                                        alert.show();
                                        word.setText("");
                                    }
                                } else {
                                    alert.setTitle("Incorrect credentials!");
                                    alert.setContentText("Word contains letter that is no longer available “in bag”, try again!");
                                    alert.show();
                                    word.setText("");
                                }
                            } else {
                                alert.setTitle("Incorrect credentials!");
                                alert.setContentText("The word should contain just English letters, try again!");
                                alert.show();
                                word.setText("");
                            }
                        } else {
                            alert.setTitle("Incorrect credentials!");
                            alert.setContentText("Word does not include vowel, try again!");
                            alert.show();
                            word.setText("");
                        }
                    } else {
                        alert.setTitle("Incorrect credentials!");
                        alert.setContentText("Word is too long (more than 8 characters), try again!");
                        alert.show();
                        word.setText("");
                    }
                } else {
                    alert.setTitle("Incorrect credentials!");
                    alert.setContentText("Word is too short (only 1 character), try again!");
                    alert.show();
                    word.setText("");
                }
            } else {
                alert.setTitle("Incorrect credentials!");
                alert.setContentText("Word is blank, try again!");
                alert.show();
            }
        } else {
            try {
                window.open("gameOver", "Word Creator", 400, 200);
                window.close(event);
            } catch (Exception e) {
                System.err.println("Cannot load file!");
            }
        }
    }

    @FXML
    private void submitA() {
        try {
            if (counterA > 0) {
                newWord = word.getText() + a;
                word.setText(newWord);
                result.setText("");
            }
        }
        catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitB() {
        try {
            if (counterB > 0) {
                newWord = word.getText() + b;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitC() {
        try {
            if (counterC > 0) {
                newWord = word.getText() + c;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitD() {
        try {
            if (counterD > 0) {
                newWord = word.getText() + d;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitE() {
        try {
            if (counterE > 0) {
                newWord = word.getText() + e;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitF() {
        try {
            if (counterF > 0) {
                newWord = word.getText() + f;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitG() {
        try {
            if (counterG > 0) {
                newWord = word.getText() + g;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitH() {
        try {
            if (counterH > 0) {
                newWord = word.getText() + h;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitI() {
        try {
            if (counterI > 0) {
                newWord = word.getText() + ii;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitJ() {
        try {
            if (counterJ > 0) {
                newWord = word.getText() + j;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitK() {
        try {
            if (counterK > 0) {
                newWord = word.getText() + k;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitL() {
        try {
            if (counterL > 0) {
                newWord = word.getText() + l;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private void submitM() {
        try {
            if (counterM > 0) {
                newWord = word.getText() + m;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitN() {
        try {
            if (counterN > 0) {
                newWord = word.getText() + n;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitO() {
        try {
            if (counterO > 0) {
                newWord = word.getText() + o;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitP() {
        try {
            if (counterP > 0) {
                newWord = word.getText() + p;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitQ() {
        try {
            if (counterQ > 0) {
                newWord = word.getText() + q;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitR() {
        try {
            if (counterR > 0) {
                newWord = word.getText() + r;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitS() {
        try {
            if (counterS > 0) {
                newWord = word.getText() + s;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitT() {
        try {
            if (counterT > 0) {
                newWord = word.getText() + t;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitU() {
        try {
            if (counterU > 0) {
                newWord = word.getText() + u;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitV() {
        try {
            if (counterV > 0) {
                newWord = word.getText() + v;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitW() {
        try {
            if (counterW > 0) {
                newWord = word.getText() + w;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitX() {
        try {
            if (counterX > 0) {
                newWord = word.getText() + x;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitY() {
        try {
            if (counterY > 0) {
                newWord = word.getText() + y;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void submitZ() {
        try {
            if (counterZ > 0) {
                newWord = word.getText() + z;
                word.setText(newWord);
                result.setText("");
            }
        } catch (Exception e) {
            System.err.println("The key does not work!" + e);
        }
    }

    @FXML
    private void restart(ActionEvent event) {

        try {
            window.open("word", "Scrabble Points Generator", 600, 800);
            window.close(event);
        } catch (Exception e) {
            System.err.println("Cannot restart file!");
        }
    }

    @FXML
    public void clear() {
        try {
            word.setText("");
        } catch (Exception e) {
            System.err.println("Cannot clear text field");
        }
    }

    @FXML
    public void del() {
        try {
            if (!word.getText().equals(""))
                word.setText(word.getText().substring (0,word.getLength()-1));
        } catch (Exception e) {
            System.err.println("Cannot delete letter text");
        }
    }

    public boolean addWord(String word) {

        for (int i = 0; i < wordBank.size(); i++) {
            if (word.equals(wordBank.get(i)))
                return false;
        }
        this.wordBank.add(word);
        return true;
    }
}
