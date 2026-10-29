package p000;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 {

    /* JADX INFO: renamed from: a */
    public w30 f32225a;

    /* JADX INFO: renamed from: b */
    public int f32226b;

    /* JADX INFO: renamed from: c */
    public boolean f32227c;

    /* JADX INFO: renamed from: d */
    public int f32228d;

    /* JADX INFO: renamed from: e */
    public sv1[] f32229e;

    /* JADX INFO: renamed from: f */
    public int f32230f;

    /* JADX INFO: renamed from: g */
    public int f32231g;

    /* JADX INFO: renamed from: h */
    public int f32232h;

    /* JADX INFO: renamed from: a */
    public final void m11677a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f32229e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f32230f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f32229e[length].f30588c;
                i -= i4;
                this.f32232h -= i4;
                this.f32231g--;
                i3++;
                length--;
            }
            sv1[] sv1VarArr = this.f32229e;
            int i5 = i2 + 1;
            System.arraycopy(sv1VarArr, i5, sv1VarArr, i5 + i3, this.f32231g);
            sv1[] sv1VarArr2 = this.f32229e;
            int i6 = this.f32230f + 1;
            Arrays.fill(sv1VarArr2, i6, i6 + i3, (Object) null);
            this.f32230f += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11678b(sv1 sv1Var) {
        int i = sv1Var.f30588c;
        int i2 = this.f32228d;
        if (i > i2) {
            AbstractC0990oo.m9206a0(null, this.f32229e);
            this.f32230f = this.f32229e.length - 1;
            this.f32231g = 0;
            this.f32232h = 0;
            return;
        }
        m11677a((this.f32232h + i) - i2);
        int i3 = this.f32231g + 1;
        sv1[] sv1VarArr = this.f32229e;
        if (i3 > sv1VarArr.length) {
            sv1[] sv1VarArr2 = new sv1[sv1VarArr.length * 2];
            System.arraycopy(sv1VarArr, 0, sv1VarArr2, sv1VarArr.length, sv1VarArr.length);
            this.f32230f = this.f32229e.length - 1;
            this.f32229e = sv1VarArr2;
            sv1VarArr = sv1VarArr2;
        }
        int i4 = this.f32230f;
        this.f32230f = i4 - 1;
        sv1VarArr[i4] = sv1Var;
        this.f32231g++;
        this.f32232h += i;
    }

    /* JADX INFO: renamed from: c */
    public final void m11679c(s50 s50Var) throws EOFException {
        w30 w30Var = this.f32225a;
        int[] iArr = ez1.f18596a;
        int iMo4261b = s50Var.mo4261b();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iMo4261b; i++) {
            byte bMo4265g = s50Var.mo4265g(i);
            byte[] bArr = zv4.f36415a;
            j2 += (long) ez1.f18597b[bMo4265g & 255];
        }
        if (((int) ((j2 + 7) >> 3)) >= s50Var.mo4261b()) {
            m11681e(s50Var.mo4261b(), 127, 0);
            w30Var.m12052M(s50Var);
            return;
        }
        w30 w30Var2 = new w30();
        int[] iArr2 = ez1.f18596a;
        int iMo4261b2 = s50Var.mo4261b();
        int i2 = 0;
        for (int i3 = 0; i3 < iMo4261b2; i3++) {
            byte bMo4265g2 = s50Var.mo4265g(i3);
            byte[] bArr2 = zv4.f36415a;
            int i4 = bMo4265g2 & 255;
            int i5 = ez1.f18596a[i4];
            byte b = ez1.f18597b[i4];
            j = (j << b) | ((long) i5);
            i2 += b;
            while (i2 >= 8) {
                i2 -= 8;
                w30Var2.m12054O((int) (j >> i2));
            }
        }
        if (i2 > 0) {
            w30Var2.m12054O((int) ((j << (8 - i2)) | (255 >>> i2)));
        }
        s50 s50VarM12069u = w30Var2.m12069u(w30Var2.f33056b);
        m11681e(s50VarM12069u.mo4261b(), 127, 128);
        w30Var.m12052M(s50VarM12069u);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX INFO: renamed from: d */
    public final void m11680d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f32227c) {
            int i = this.f32226b;
            if (i < this.f32228d) {
                m11681e(i, 31, 32);
            }
            this.f32227c = false;
            this.f32226b = Integer.MAX_VALUE;
            m11681e(this.f32228d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sv1 sv1Var = (sv1) arrayList.get(i2);
            s50 s50VarMo4270n = sv1Var.f30586a.mo4270n();
            s50 s50Var = sv1Var.f30587b;
            Integer num = (Integer) vx1.f32906b.get(s50VarMo4270n);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    sv1[] sv1VarArr = vx1.f32905a;
                    if (z62.m13387o(sv1VarArr[iIntValue].f30587b, s50Var)) {
                        length = length2;
                    } else if (z62.m13387o(sv1VarArr[length2].f30587b, s50Var)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f32229e.length;
                for (int i3 = this.f32230f + 1; i3 < length3; i3++) {
                    if (z62.m13387o(this.f32229e[i3].f30586a, s50VarMo4270n)) {
                        if (z62.m13387o(this.f32229e[i3].f30587b, s50Var)) {
                            length2 = vx1.f32905a.length + (i3 - this.f32230f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f32230f) + vx1.f32905a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                m11681e(length2, 127, 128);
            } else if (length == -1) {
                this.f32225a.m12054O(64);
                m11679c(s50VarMo4270n);
                m11679c(s50Var);
                m11678b(sv1Var);
            } else {
                s50 s50Var2 = sv1.f30580d;
                s50VarMo4270n.getClass();
                if (!s50VarMo4270n.mo4268k(0, s50Var2, s50Var2.mo4261b()) || z62.m13387o(sv1.f30585i, s50VarMo4270n)) {
                    m11681e(length, 63, 64);
                    m11679c(s50Var);
                    m11678b(sv1Var);
                } else {
                    m11681e(length, 15, 0);
                    m11679c(s50Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11681e(int i, int i2, int i3) {
        w30 w30Var = this.f32225a;
        if (i < i2) {
            w30Var.m12054O(i | i3);
            return;
        }
        w30Var.m12054O(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            w30Var.m12054O(128 | (i4 & 127));
            i4 >>>= 7;
        }
        w30Var.m12054O(i4);
    }
}
