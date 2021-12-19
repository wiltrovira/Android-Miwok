package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    /**
     * Constructor para la clase Word
     * @param miwokTranslation   Palabra en miwok
     * @param defaultTranslation Palabra en inglés
     */
    public Word(String defaultTranslation, String miwokTranslation) {
//        this.mDefaultTranslation = defaultTranslation;
//        this.mMiwokTranslation = miwokTranslation;
        this.setDefaultTranslation(defaultTranslation);
        this.setMiwokTranslation(miwokTranslation);
    }

    /**
     * Devuelve la palabra en miwok
     * @return traducción a miwok
     */
    public String getMiwokTranslation() {
        return this.mMiwokTranslation;
    }

    /**
     * Devuelve la palabra en inglés
     * @return traducción al inglés
     */
    public String getDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    /**
     * Guarda la palabra en inglés
     * @param defaultTranslation palabra en inglés
     */

    private void setDefaultTranslation(String defaultTranslation) {
        this.mDefaultTranslation = defaultTranslation;
    }

    /**
     * Guarda la palabra en miwok
     * @param miwokTranslation palabra en miwok
     */
    private void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
    }

}
