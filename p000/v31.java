package p000;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v31 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public qq2 f32358a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        qq2 qq2Var = this.f32358a;
        if (textPaint != null) {
            if (z62.m13387o(qq2Var, uf1.f31820j)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(qq2Var instanceof pd4)) {
                C0670g.m5864c();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            pd4 pd4Var = (pd4) qq2Var;
            textPaint.setStrokeWidth(pd4Var.f27547j);
            textPaint.setStrokeMiter(pd4Var.f27548k);
            int i = pd4Var.f27550m;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = pd4Var.f27549l;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
