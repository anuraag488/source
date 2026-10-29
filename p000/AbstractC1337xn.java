package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: xn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1337xn {

    /* JADX INFO: renamed from: a */
    public static final C1114rn f34434a = new C1114rn((byte) 3);

    /* JADX INFO: renamed from: b */
    public static final C1114rn f34435b = new C1114rn((byte) 2);

    /* JADX INFO: renamed from: c */
    public static final C1151sn f34436c = new C1151sn();

    /* JADX INFO: renamed from: d */
    public static final wv1 f34437d;

    static {
        wv1 wv1Var = new wv1((byte) 29);
        VarHandle.storeStoreFence();
        f34437d = wv1Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m12715a(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12716b(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12717c(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i5;
            i5 += i8;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C1225un m12718d(float f) {
        return new C1225un(f, true, new C0670g((byte) 29));
    }

    /* JADX INFO: renamed from: e */
    public static C1225un m12719e(float f) {
        C1077qn c1077qn = new C1077qn((byte) 0);
        VarHandle.storeStoreFence();
        return new C1225un(f, false, c1077qn);
    }

    /* JADX INFO: renamed from: f */
    public static C1225un m12720f(float f, C0779iz c0779iz) {
        C1040pn c1040pn = new C1040pn((byte) 0);
        c1040pn.f27754b = c0779iz;
        VarHandle.storeStoreFence();
        return new C1225un(f, true, c1040pn);
    }
}
