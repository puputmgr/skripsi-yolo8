package com.asrul.skripsi.data;

import com.asrul.skripsi.R;
import com.asrul.skripsi.data.alphabet.Alphabet;
import com.asrul.skripsi.data.word.Word;

import java.util.ArrayList;

public class Data {

    private final char[] alphabetData = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private final int[] signData = new int[]{
            R.drawable.a1,
            R.drawable.b2,
            R.drawable.c1,
            R.drawable.d1,
            R.drawable.e1,
            R.drawable.f1,
            R.drawable.g1,
            R.drawable.h1,
            R.drawable.i1,
            R.drawable.j1,
            R.drawable.k1,
            R.drawable.l1,
            R.drawable.m1,
            R.drawable.n1,
            R.drawable.o1,
            R.drawable.p1,
            R.drawable.q1,
            R.drawable.r1,
            R.drawable.s1,
            R.drawable.t1,
            R.drawable.u1,
            R.drawable.v1,
            R.drawable.w1,
            R.drawable.x1,
            R.drawable.y1,
            R.drawable.z1,
    };

    public ArrayList<Alphabet> getAlphabetData() {
        ArrayList<Alphabet> alphabetList = new ArrayList<>();

        for (int i = 0; i < alphabetData.length; i++) {
            Alphabet alphabet = new Alphabet();
            alphabet.setAlphabet(alphabetData.clone()[i]);
            alphabet.setSign(signData.clone()[i]);
            alphabetList.add(alphabet);
        }

        return alphabetList;
    }

    private final String[] wordData = new String[]{
            "Halo",
            "Terima kasih",
            "Sama-sama"
    };
    private final int[] gestureData = new int[] {
            R.drawable.halo,
            R.drawable.terimakasih,
            R.drawable.samasama
    };

    public ArrayList<Word> getWord() {
        ArrayList<Word> wordList = new ArrayList<>();

        for (int i =0; i < wordData.length; i++) {
            Word word = new Word();
            word.setWord(wordData.clone()[i]);
            word.setGesture(gestureData.clone()[i]);
            wordList.add(word);
        }

        return wordList;
    }
}
