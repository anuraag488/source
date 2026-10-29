package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ix */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0777ix implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21853a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ l22 f21854b;

    public /* synthetic */ C0777ix(byte b) {
        this.f21853a = b;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e9  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        Object obj2;
        long j;
        z50 z50Var;
        t82 t82Var;
        int iM132h;
        int i;
        byte b = this.f21853a;
        ju4 ju4Var = ju4.f22634a;
        l22 l22Var = this.f21854b;
        switch (b) {
            case 0:
                l22Var.f23748z.m13400i(((Number) ((C0910mi) obj).m8328d()).floatValue() % 1.0f);
                return ju4Var;
            case 1:
                z50 z50Var2 = (z50) obj;
                float f = l22Var.f23744v;
                o90 o90Var = l22Var.f23746x;
                float fMo3580c = z50Var2.mo3580c() * f;
                float fMo3580c2 = z50Var2.mo3580c() * l22Var.f23743u;
                boolean z = p11.m9351b(l22Var.f23745w, 0.0f) > 0 && l22Var.f23737H > 0.0f;
                long jMo8940d = z50Var2.f35750a.mo8940d();
                float f2 = l22Var.f23741s.f27547j;
                float f3 = l22Var.f23737H;
                boolean z2 = f3 > 0.0f && f3 < 1.0f;
                a83 a83Var = o90Var.f26477f;
                if (fMo3580c > 0.0f) {
                    h74 h74Var = o90Var.f26472a;
                    if (h74Var != null) {
                        j = jMo8940d;
                        if (j == h74Var.f20418a && fMo3580c == o90Var.f26473b) {
                            if (z2 && o90Var.f26476e == null) {
                                o90Var.f26476e = new cu2(o90Var.f26474c, o90Var.f26475d);
                            }
                            z50Var = z50Var2;
                        }
                        if (l22Var.f23732C != a83Var.m132h()) {
                            iM132h = a83Var.m132h();
                            if (iM132h < 5) {
                                i = 5;
                            } else {
                                i = iM132h;
                            }
                            l22Var.f23732C = i;
                        }
                        if (l22Var.f23737H > 0.0f && ((t82Var = l22Var.f23731B) == null || t82Var.mo4971B())) {
                            l22Var.m7822R0();
                        }
                        h22 h22Var = new h22();
                        h22Var.f20277a = l22Var;
                        h22Var.f20278b = z;
                        h22Var.f20279c = fMo3580c;
                        h22Var.f20280d = fMo3580c2;
                        VarHandle.storeStoreFence();
                        return z50Var.m13338a(h22Var);
                    }
                    j = jMo8940d;
                    boolean z3 = z2;
                    int iMax = Math.max(5, (int) Math.round((((double) ((h74.m6272d(j) / 2.0f) - (f2 / 2.0f))) * 6.283185307179586d) / ((double) fMo3580c)));
                    if (iMax == a83Var.m132h()) {
                        z50Var = z50Var2;
                    } else if (iMax >= 3) {
                        float f4 = iMax;
                        float fCos = 1.0f / ((float) Math.cos(ew4.f18547b / f4));
                        int i2 = 2;
                        no0 no0Var = new no0(1.0f, 2);
                        float[] fArr = new float[iMax * 2];
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < iMax) {
                            int i5 = i2;
                            z50 z50Var3 = z50Var2;
                            long jM10704S = se0.m10704S(ew4.m5416d(fCos, i3 * (ew4.f18547b / f4) * 2.0f), ji1.m7130a(0.0f, 0.0f));
                            int i6 = i4 + 1;
                            fArr[i4] = se0.m10691D(jM10704S);
                            i4 += 2;
                            fArr[i6] = se0.m10692E(jM10704S);
                            i3++;
                            f4 = f4;
                            i2 = i5;
                            z50Var2 = z50Var3;
                        }
                        z50Var = z50Var2;
                        float f5 = f4;
                        o90Var.f26474c = lb5.m7931l(fArr, no0Var, null).m6921a();
                        no0 no0Var2 = new no0(0.35f, 0.4f);
                        no0 no0Var3 = new no0(0.5f, i2);
                        r52 r52VarM10660c0 = sc6.m10660c0(0, iMax);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = r52VarM10660c0.iterator();
                        while (true) {
                            q52 q52Var = (q52) it;
                            if (q52Var.f28225c) {
                                q52Var.nextInt();
                                mb0.m8260A0(arrayList, kx5.m7694Y(no0Var2, no0Var3));
                            } else {
                                float[] fArr2 = new float[iMax * 4];
                                int i7 = 0;
                                for (int i8 = 0; i8 < iMax; i8++) {
                                    float f6 = ew4.f18547b / f5;
                                    long jM5416d = ew4.m5416d(1.0f, f6 * 2.0f * i8);
                                    fArr2[i7] = se0.m10691D(jM5416d) + 0.0f;
                                    fArr2[i7 + 1] = se0.m10692E(jM5416d) + 0.0f;
                                    long jM5416d2 = ew4.m5416d(0.75f, f6 * ((i8 * 2) + 1));
                                    int i9 = i7 + 3;
                                    fArr2[i7 + 2] = se0.m10691D(jM5416d2) + 0.0f;
                                    i7 += 4;
                                    fArr2[i9] = se0.m10692E(jM5416d2) + 0.0f;
                                }
                                ir3 ir3VarM6921a = lb5.m7931l(fArr2, no0Var2, arrayList).m6921a();
                                o90Var.f26475d = ir3VarM6921a;
                                if (z3) {
                                    o90Var.f26476e = new cu2(o90Var.f26474c, ir3VarM6921a);
                                }
                            }
                        }
                    } else {
                        obj2 = null;
                        C1077qn.m9987m("Circle must have at least three vertices");
                    }
                    o90Var.f26472a = h74.m6269a(j);
                    o90Var.f26473b = fMo3580c;
                    a83Var.m133i(iMax);
                    if (l22Var.f23732C != a83Var.m132h()) {
                        iM132h = a83Var.m132h();
                        if (iM132h < 5) {
                            i = 5;
                        } else {
                            i = iM132h;
                        }
                        l22Var.f23732C = i;
                    }
                    if (l22Var.f23737H > 0.0f) {
                        l22Var.m7822R0();
                    }
                    h22 h22Var2 = new h22();
                    h22Var2.f20277a = l22Var;
                    h22Var2.f20278b = z;
                    h22Var2.f20279c = fMo3580c;
                    h22Var2.f20280d = fMo3580c2;
                    VarHandle.storeStoreFence();
                    return z50Var.m13338a(h22Var2);
                }
                obj2 = null;
                C1077qn.m9987m("Wavelength should be greater than zero");
                return obj2;
            case 2:
                z62.m13348G(l22Var.f23738I);
                return ju4Var;
            case 3:
                z62.m13348G(l22Var.f23738I);
                return ju4Var;
            default:
                z62.m13348G(l22Var.f23738I);
                return ju4Var;
        }
    }
}
