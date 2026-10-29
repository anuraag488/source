package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 {

    /* JADX INFO: renamed from: a */
    public C0943ne f19024a;

    /* JADX INFO: renamed from: b */
    public z32 f19025b;

    /* JADX INFO: renamed from: c */
    public Object f19026c;

    /* JADX INFO: renamed from: d */
    public boolean f19027d;

    /* JADX INFO: renamed from: e */
    public boolean f19028e;

    /* JADX INFO: renamed from: f */
    public boolean f19029f;

    /* JADX INFO: renamed from: g */
    public boolean f19030g;

    /* JADX INFO: renamed from: h */
    public boolean f19031h;

    /* JADX INFO: renamed from: i */
    public boolean f19032i;

    /* JADX INFO: renamed from: j */
    public xk4 f19033j;

    /* JADX INFO: renamed from: k */
    public jl4 f19034k;

    /* JADX INFO: renamed from: l */
    public vi3 f19035l;

    /* JADX INFO: renamed from: m */
    public jl3 f19036m;

    /* JADX INFO: renamed from: n */
    public jl3 f19037n;

    /* JADX INFO: renamed from: o */
    public CursorAnchorInfo.Builder f19038o;

    /* JADX INFO: renamed from: p */
    public float[] f19039p;

    /* JADX INFO: renamed from: q */
    public Matrix f19040q;

    /* JADX INFO: renamed from: a */
    public final void m5726a() {
        jl3 jl3Var;
        float f;
        int i;
        Matrix matrix = this.f19040q;
        float[] fArr = this.f19039p;
        z32 z32Var = this.f19025b;
        InputMethodManager inputMethodManagerM13307C = z32Var.m13307C();
        View view = (View) z32Var.f35738b;
        if (!inputMethodManagerM13307C.isActive(view) || this.f19033j == null || this.f19035l == null || this.f19034k == null || this.f19036m == null || this.f19037n == null) {
            return;
        }
        rq2.m10395e(fArr);
        this.f19024a.invoke(rq2.m10391a(fArr));
        jl3 jl3Var2 = this.f19037n;
        rq2.m10399i(fArr, -jl3Var2.f22396a, -jl3Var2.f22397b);
        se0.m10709X(matrix, fArr);
        CursorAnchorInfo.Builder builder = this.f19038o;
        xk4 xk4Var = this.f19033j;
        long j = xk4Var.f34342b;
        vi3 vi3Var = this.f19035l;
        jl4 jl4Var = this.f19034k;
        yu2 yu2Var = jl4Var.f22401b;
        jl3 jl3Var3 = this.f19036m;
        float f2 = jl3Var3.f22399d;
        float f3 = jl3Var3.f22397b;
        jl3 jl3Var4 = this.f19037n;
        boolean z = this.f19029f;
        boolean z2 = this.f19030g;
        boolean z3 = this.f19031h;
        boolean z4 = this.f19032i;
        builder.reset();
        builder.setMatrix(matrix);
        ql4 ql4Var = xk4Var.f34343c;
        int iM9903g = ql4.m9903g(j);
        builder.setSelectionRange(iM9903g, ql4.m9902f(j));
        if (!z || iM9903g < 0) {
            jl3Var = jl3Var4;
        } else {
            vi3Var.m11898a(iM9903g);
            jl3 jl3VarM7177c = jl4Var.m7177c(iM9903g);
            float fM10674o = sc6.m10674o(jl3VarM7177c.f22396a, 0.0f, (int) (jl4Var.f22402c >> 32));
            boolean zM7678E = kx5.m7678E(jl3Var3, fM10674o, jl3VarM7177c.f22397b);
            boolean zM7678E2 = kx5.m7678E(jl3Var3, fM10674o, jl3VarM7177c.f22399d);
            boolean z5 = jl4Var.m7175a(iM9903g) == oo3.f26926b;
            int i2 = (zM7678E || zM7678E2) ? 1 : 0;
            if (!zM7678E || !zM7678E2) {
                i2 |= 2;
            }
            if (z5) {
                i2 |= 4;
            }
            int i3 = i2;
            float f4 = jl3VarM7177c.f22397b;
            float f5 = jl3VarM7177c.f22399d;
            builder = builder;
            jl3Var = jl3Var4;
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
                    int i8 = (jl3Var3.f22396a < f8 ? 1 : 0) & (f6 < jl3Var3.f22398c ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!kx5.m7678E(jl3Var3, f6, f7) || !kx5.m7678E(jl3Var3, f8, f9)) {
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
        if (Build.VERSION.SDK_INT >= 34 && z4 && !jl3Var3.m7171g()) {
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
        z32Var.m13307C().updateCursorAnchorInfo(view, builder.build());
        this.f19028e = false;
    }
}
