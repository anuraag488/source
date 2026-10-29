package p000;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l44 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public u30 f23783a;

    /* JADX INFO: renamed from: b */
    public float f23784b;

    /* JADX INFO: renamed from: c */
    public d83 f23785c;

    /* JADX INFO: renamed from: d */
    public wy0 f23786d;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        dt0.m4692U(textPaint, this.f23784b);
        textPaint.setShader((Shader) this.f23786d.getValue());
    }
}
