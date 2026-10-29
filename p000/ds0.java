package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ds0 {

    /* JADX INFO: renamed from: a */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f17313a;

    /* JADX INFO: renamed from: b */
    public jp0 f17314b;

    /* JADX INFO: renamed from: c */
    public Object f17315c;

    /* JADX INFO: renamed from: d */
    public boolean f17316d;

    /* JADX INFO: renamed from: e */
    public boolean f17317e;

    /* JADX INFO: renamed from: f */
    public boolean f17318f;

    /* JADX INFO: renamed from: g */
    public boolean f17319g;

    /* JADX INFO: renamed from: h */
    public boolean f17320h;

    /* JADX INFO: renamed from: i */
    public boolean f17321i;

    /* JADX INFO: renamed from: j */
    public xk4 f17322j;

    /* JADX INFO: renamed from: k */
    public jl4 f17323k;

    /* JADX INFO: renamed from: l */
    public vi3 f17324l;

    /* JADX INFO: renamed from: m */
    public yp1 f17325m;

    /* JADX INFO: renamed from: n */
    public jl3 f17326n;

    /* JADX INFO: renamed from: o */
    public jl3 f17327o;

    /* JADX INFO: renamed from: p */
    public CursorAnchorInfo.Builder f17328p;

    /* JADX INFO: renamed from: q */
    public float[] f17329q;

    /* JADX INFO: renamed from: r */
    public Matrix f17330r;

    /* JADX INFO: renamed from: a */
    public final void m4664a() {
        jl3 jl3Var;
        float f;
        int i;
        Matrix matrix = this.f17330r;
        float[] fArr = this.f17329q;
        jp0 jp0Var = this.f17314b;
        pg2 pg2Var = (pg2) jp0Var.f22482c;
        InputMethodManager inputMethodManager = (InputMethodManager) pg2Var.getValue();
        View view = (View) jp0Var.f22481b;
        if (inputMethodManager.isActive(view)) {
            this.f17325m.invoke(rq2.m10391a(fArr));
            this.f17313a.m10617q(fArr);
            se0.m10709X(matrix, fArr);
            CursorAnchorInfo.Builder builder = this.f17328p;
            xk4 xk4Var = this.f17322j;
            long j = xk4Var.f34342b;
            vi3 vi3Var = this.f17324l;
            jl4 jl4Var = this.f17323k;
            yu2 yu2Var = jl4Var.f22401b;
            jl3 jl3Var2 = this.f17326n;
            float f2 = jl3Var2.f22399d;
            float f3 = jl3Var2.f22397b;
            jl3 jl3Var3 = this.f17327o;
            boolean z = this.f17318f;
            boolean z2 = this.f17319g;
            boolean z3 = this.f17320h;
            boolean z4 = this.f17321i;
            builder.reset();
            builder.setMatrix(matrix);
            ql4 ql4Var = xk4Var.f34343c;
            int iM9903g = ql4.m9903g(j);
            builder.setSelectionRange(iM9903g, ql4.m9902f(j));
            if (!z || iM9903g < 0) {
                jl3Var = jl3Var3;
            } else {
                vi3Var.m11898a(iM9903g);
                jl3 jl3VarM7177c = jl4Var.m7177c(iM9903g);
                float fM10674o = sc6.m10674o(jl3VarM7177c.f22396a, 0.0f, (int) (jl4Var.f22402c >> 32));
                boolean zM13395w = z62.m13395w(jl3Var2, fM10674o, jl3VarM7177c.f22397b);
                boolean zM13395w2 = z62.m13395w(jl3Var2, fM10674o, jl3VarM7177c.f22399d);
                boolean z5 = jl4Var.m7175a(iM9903g) == oo3.f26926b;
                int i2 = (zM13395w || zM13395w2) ? 1 : 0;
                if (!zM13395w || !zM13395w2) {
                    i2 |= 2;
                }
                if (z5) {
                    i2 |= 4;
                }
                int i3 = i2;
                float f4 = jl3VarM7177c.f22397b;
                float f5 = jl3VarM7177c.f22399d;
                builder = builder;
                jl3Var = jl3Var3;
                builder.setInsertionMarkerLocation(fM10674o, f4, f5, f5, i3);
            }
            if (z2) {
                int iM9903g2 = ql4Var != null ? ql4.m9903g(ql4Var.f28558a) : -1;
                int iM9902f = ql4Var != null ? ql4.m9902f(ql4Var.f28558a) : -1;
                if (iM9903g2 >= 0 && iM9903g2 < iM9902f) {
                    builder.setComposingText(iM9903g2, xk4Var.f34341a.f24092b.subSequence(iM9903g2, iM9902f));
                    vi3Var.m11898a(iM9903g2);
                    vi3Var.m11898a(iM9902f);
                    float[] fArr2 = new float[(iM9902f - iM9903g2) * 4];
                    yu2Var.m13242a(sc6.m10657b(iM9903g2, iM9902f), fArr2);
                    int i4 = iM9903g2;
                    while (i4 < iM9902f) {
                        vi3Var.m11898a(i4);
                        int i5 = (i4 - iM9903g2) * 4;
                        int i6 = iM9903g2;
                        float f6 = fArr2[i5];
                        float f7 = fArr2[i5 + 1];
                        int i7 = iM9902f;
                        float f8 = fArr2[i5 + 2];
                        float f9 = fArr2[i5 + 3];
                        float[] fArr3 = fArr2;
                        int i8 = (jl3Var2.f22396a < f8 ? 1 : 0) & (f6 < jl3Var2.f22398c ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                        if (!z62.m13395w(jl3Var2, f6, f7) || !z62.m13395w(jl3Var2, f8, f9)) {
                            i8 |= 2;
                        }
                        int i9 = i8;
                        if (jl4Var.m7175a(i4) == oo3.f26926b) {
                            f = f7;
                            i = i9 | 4;
                        } else {
                            f = f7;
                            i = i9;
                        }
                        builder.addCharacterBounds(i4, f6, f, f8, f9, i);
                        i4++;
                        f2 = f2;
                        iM9903g2 = i6;
                        fArr2 = fArr3;
                        iM9902f = i7;
                    }
                }
            }
            float f10 = f2;
            if (z3) {
                builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(gq6.m6071I(jl3Var)).setHandwritingBounds(gq6.m6071I(jl3Var)).build());
            }
            if (Build.VERSION.SDK_INT >= 34 && z4 && !jl3Var2.m7171g()) {
                int i10 = yu2Var.f35537f - 1;
                if (i10 < 0) {
                    i10 = 0;
                }
                int iM10675p = sc6.m10675p(yu2Var.m13246e(f3), 0, i10);
                int iM10675p2 = sc6.m10675p(yu2Var.m13246e(f10), 0, i10);
                if (iM10675p <= iM10675p2) {
                    while (true) {
                        builder.addVisibleLineBounds(jl4Var.m7178d(iM10675p), yu2Var.m13247f(iM10675p), jl4Var.m7179e(iM10675p), yu2Var.m13243b(iM10675p));
                        if (iM10675p == iM10675p2) {
                            break;
                        } else {
                            iM10675p++;
                        }
                    }
                }
            }
            ((InputMethodManager) pg2Var.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f17317e = false;
        }
    }
}
