package p000;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class if2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f21331a;

    /* JADX INFO: renamed from: b */
    public TextPaint f21332b;

    /* JADX INFO: renamed from: c */
    public int f21333c;

    /* JADX INFO: renamed from: d */
    public float f21334d;

    /* JADX INFO: renamed from: e */
    public float f21335e;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f21336f;

    /* JADX INFO: renamed from: g */
    public boolean f21337g;

    /* JADX INFO: renamed from: h */
    public CharSequence f21338h;

    /* JADX INFO: renamed from: a */
    public final CharSequence m6790a() {
        CharSequence charSequence = this.f21338h;
        if (charSequence == null) {
            charSequence = this.f21331a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (C0638f5.m5554y(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.f21338h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX INFO: renamed from: b */
    public final float m6791b() {
        CharSequence charSequence = this.f21331a;
        TextPaint textPaint = this.f21332b;
        if (!Float.isNaN(this.f21334d)) {
            return this.f21334d;
        }
        if (!this.f21337g) {
            this.f21336f = BoringLayout.isBoring(charSequence, textPaint, ll4.m8035b(this.f21333c), true, null);
            this.f21337g = true;
        }
        BoringLayout.Metrics metrics = this.f21336f;
        float fCeil = metrics != null ? metrics.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m6790a(), 0, m6790a().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (C0638f5.m5554y(spanned, ak2.class) || C0638f5.m5554y(spanned, zj2.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f21334d = fCeil;
        return fCeil;
    }
}
