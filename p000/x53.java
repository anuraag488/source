package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x53 extends as4 {

    /* JADX INFO: renamed from: g */
    public int f34016g;

    /* JADX INFO: renamed from: i */
    public int f34018i;

    /* JADX INFO: renamed from: k */
    public int f34020k;

    /* JADX INFO: renamed from: f */
    public v53[] f34015f = new v53[16];

    /* JADX INFO: renamed from: h */
    public int[] f34017h = new int[16];

    /* JADX INFO: renamed from: j */
    public Object[] f34019j = new Object[16];

    /* JADX INFO: renamed from: U */
    public final void m12491U() {
        this.f34016g = 0;
        this.f34018i = 0;
        Arrays.fill(this.f34019j, 0, this.f34020k, (Object) null);
        this.f34020k = 0;
    }

    /* JADX INFO: renamed from: V */
    public final void m12492V(InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        if (this.f34016g != 0) {
            xa0 xa0Var = new xa0((byte) 3);
            xa0Var.f34095e = this;
            VarHandle.storeStoreFence();
            while (true) {
                v53 v53Var = ((x53) xa0Var.f34095e).f34015f[xa0Var.f34092b];
                cr1 cr1VarMo91b = v53Var.mo91b(xa0Var);
                InterfaceC0618en interfaceC0618en2 = interfaceC0618en;
                p84 p84Var2 = p84Var;
                om3 om3Var2 = om3Var;
                w53 w53Var2 = w53Var;
                try {
                    v53Var.mo90a(xa0Var, interfaceC0618en2, p84Var2, om3Var2, w53Var2);
                    int i = xa0Var.f34092b;
                    x53 x53Var = (x53) xa0Var.f34095e;
                    int i2 = x53Var.f34016g;
                    if (i < i2) {
                        v53 v53Var2 = x53Var.f34015f[i];
                        xa0Var.f34093c += v53Var2.f32421a;
                        xa0Var.f34094d += v53Var2.f32422b;
                        int i3 = i + 1;
                        xa0Var.f34092b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC0618en = interfaceC0618en2;
                        p84Var = p84Var2;
                        om3Var = om3Var2;
                        w53Var = w53Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (w53Var2 == null) {
                        throw th;
                    }
                    C1048pv c1048pv = new C1048pv((byte) 12);
                    c1048pv.f28016b = cr1VarMo91b;
                    c1048pv.f28017c = p84Var2;
                    c1048pv.f28018d = w53Var2;
                    VarHandle.storeStoreFence();
                    y42.m12837K0(th, c1048pv);
                    throw th;
                }
            }
        }
        m12491U();
    }

    /* JADX INFO: renamed from: W */
    public final boolean m12493W() {
        return this.f34016g == 0;
    }

    /* JADX INFO: renamed from: X */
    public final void m12494X(v53 v53Var) {
        int i = this.f34016g;
        v53[] v53VarArr = this.f34015f;
        if (i == v53VarArr.length) {
            v53[] v53VarArr2 = new v53[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(v53VarArr, 0, v53VarArr2, 0, i);
            this.f34015f = v53VarArr2;
        }
        int i2 = this.f34018i;
        int i3 = v53Var.f32421a;
        int i4 = v53Var.f32422b;
        int i5 = i2 + i3;
        int[] iArr = this.f34017h;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC0990oo.m9199T(iArr, iArr2, 0, 0, length);
            this.f34017h = iArr2;
        }
        int i7 = this.f34020k + i4;
        Object[] objArr = this.f34019j;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f34019j = objArr2;
        }
        v53[] v53VarArr3 = this.f34015f;
        int i9 = this.f34016g;
        this.f34016g = i9 + 1;
        v53VarArr3[i9] = v53Var;
        this.f34018i += v53Var.f32421a;
        this.f34020k += i4;
    }
}
