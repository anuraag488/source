package p000;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e10 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17578a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f17579b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f17580c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Serializable f17581d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f17582e;

    public /* synthetic */ e10(byte b) {
        this.f17578a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        float[] fArr;
        ju4 ju4Var;
        long j;
        int i;
        float fM5418a;
        float fM5418a2;
        byte b = this.f17578a;
        ju4 ju4Var2 = ju4.f22634a;
        switch (b) {
            case 0:
                jl3 jl3Var = (jl3) this.f17580c;
                ql3 ql3Var = (ql3) this.f17581d;
                long j2 = this.f17579b;
                o00 o00Var = (o00) this.f17582e;
                yf2 yf2Var = (yf2) obj;
                yf2Var.m13113a();
                float f = jl3Var.f22396a;
                float f2 = jl3Var.f22397b;
                j70 j70Var = yf2Var.f35194a;
                ((ar3) j70Var.f22064b.f22481b).m3130A(f, f2);
                try {
                    u31.m11219M(yf2Var, (t02) ql3Var.f28555a, j2, 0L, 0.0f, o00Var, 0, 890);
                    return ju4Var2;
                } finally {
                    ((ar3) j70Var.f22064b.f22481b).m3130A(-f, -f2);
                }
            default:
                long j3 = this.f17579b;
                float[] fArr2 = (float[]) this.f17580c;
                ol3 ol3Var = (ol3) this.f17581d;
                nl3 nl3Var = (nl3) this.f17582e;
                n73 n73Var = (n73) obj;
                int i2 = n73Var.f25498b;
                C1328xe c1328xe = n73Var.f25497a;
                int iM9902f = n73Var.f25499c;
                int iM9903g = i2 > ql4.m9903g(j3) ? n73Var.f25498b : ql4.m9903g(j3);
                if (iM9902f >= ql4.m9902f(j3)) {
                    iM9902f = ql4.m9902f(j3);
                }
                long jM10657b = sc6.m10657b(n73Var.m8572d(iM9903g), n73Var.m8572d(iM9902f));
                int i3 = ol3Var.f26851a;
                hl4 hl4Var = c1328xe.f34185c;
                int iM9903g2 = ql4.m9903g(jM10657b);
                int iM9902f2 = ql4.m9902f(jM10657b);
                Layout layout = hl4Var.f20679f;
                int length = layout.getText().length();
                if (iM9903g2 < 0) {
                    r32.m10186a("startOffset must be > 0");
                }
                if (iM9903g2 >= length) {
                    r32.m10186a("startOffset must be less than text length");
                }
                if (iM9902f2 <= iM9903g2) {
                    r32.m10186a("endOffset must be greater than startOffset");
                }
                if (iM9902f2 > length) {
                    r32.m10186a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i3 < (iM9902f2 - iM9903g2) * 4) {
                    r32.m10186a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iM6434g = hl4Var.m6434g(iM9903g2);
                int iM6434g2 = hl4Var.m6434g(iM9902f2 - 1);
                ex1 ex1Var = new ex1(hl4Var);
                if (iM6434g <= iM6434g2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iM6434g);
                        fArr = fArr2;
                        int iM6433f = hl4Var.m6433f(iM6434g);
                        int iMax = Math.max(iM9903g2, lineStart);
                        int iMin = Math.min(iM9902f2, iM6433f);
                        float fM6436i = hl4Var.m6436i(iM6434g);
                        float fM6432e = hl4Var.m6432e(iM6434g);
                        ju4Var = ju4Var2;
                        j = jM10657b;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iM6434g) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fM5418a3 = ex1Var.m5418a(iMax, false, false, false);
                                    i = iMin;
                                    fM5418a = ex1Var.m5418a(iMax + 1, true, true, false);
                                    fM5418a2 = fM5418a3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fM5418a = ex1Var.m5418a(iMax, false, false, false);
                                        fM5418a2 = ex1Var.m5418a(iMax + 1, true, true, false);
                                    } else {
                                        fM5418a2 = ex1Var.m5418a(iMax, false, false, true);
                                        fM5418a = ex1Var.m5418a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i3] = fM5418a;
                                fArr[i3 + 1] = fM6436i;
                                fArr[i3 + 2] = fM5418a2;
                                fArr[i3 + 3] = fM6432e;
                                i3 += 4;
                                iMax++;
                                iMin = i;
                            } else {
                                fM5418a = ex1Var.m5418a(iMax, z, z, true);
                                i = iMin;
                                fM5418a2 = ex1Var.m5418a(iMax + 1, true, true, true);
                            }
                            z = false;
                            fArr[i3] = fM5418a;
                            fArr[i3 + 1] = fM6436i;
                            fArr[i3 + 2] = fM5418a2;
                            fArr[i3 + 3] = fM6432e;
                            i3 += 4;
                            iMax++;
                            iMin = i;
                        }
                        if (iM6434g != iM6434g2) {
                            iM6434g++;
                            jM10657b = j;
                            fArr2 = fArr;
                            ju4Var2 = ju4Var;
                        }
                    }
                } else {
                    fArr = fArr2;
                    ju4Var = ju4Var2;
                    j = jM10657b;
                }
                int iM9901e = (ql4.m9901e(j) * 4) + ol3Var.f26851a;
                for (int i4 = ol3Var.f26851a; i4 < iM9901e; i4 += 4) {
                    int i5 = i4 + 1;
                    float f3 = fArr[i5];
                    float f4 = nl3Var.f25933a;
                    fArr[i5] = f3 + f4;
                    int i6 = i4 + 3;
                    fArr[i6] = fArr[i6] + f4;
                }
                ol3Var.f26851a = iM9901e;
                nl3Var.f25933a += c1328xe.f34187e;
                return ju4Var;
        }
    }
}
