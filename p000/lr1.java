package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lr1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f24306a;

    /* JADX INFO: renamed from: b */
    public final int f24307b;

    /* JADX INFO: renamed from: c */
    public int f24308c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f24309d;

    /* JADX INFO: renamed from: e */
    public final lv2 f24310e;

    /* JADX INFO: renamed from: f */
    public final dg4 f24311f;

    public lr1(ArrayList arrayList, int i) {
        this.f24306a = arrayList;
        this.f24307b = i;
        if (i < 0) {
            kd3.m7502a("Invalid start index");
        }
        this.f24309d = new ArrayList();
        lv2 lv2Var = new lv2();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            uc2 uc2Var = (uc2) this.f24306a.get(i3);
            int i4 = uc2Var.f31784c;
            int i5 = uc2Var.f31785d;
            lv2Var.m8121h(i4, new ju1(i3, i2, i5));
            i2 += i5;
        }
        this.f24310e = lv2Var;
        C0898m6 c0898m6 = new C0898m6((byte) 3);
        c0898m6.f24677b = this;
        VarHandle.storeStoreFence();
        this.f24311f = new dg4(c0898m6);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8099a(int i, int i2) {
        ju1 ju1Var;
        int i3;
        int i4;
        lv2 lv2Var = this.f24310e;
        ju1 ju1Var2 = (ju1) lv2Var.m8197b(i);
        if (ju1Var2 == null) {
            return false;
        }
        int i5 = ju1Var2.f22625b;
        int i6 = i2 - ju1Var2.f22626c;
        ju1Var2.f22626c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = lv2Var.f24667c;
        long[] jArr = lv2Var.f24665a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (ju1Var = (ju1) objArr[(i7 << 3) + i9]).f22625b) >= i5 && ju1Var != ju1Var2 && (i4 = i3 + i6) >= 0) {
                        ju1Var.f22625b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
