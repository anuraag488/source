package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tx1 {

    /* JADX INFO: renamed from: a */
    public int f31506a;

    /* JADX INFO: renamed from: b */
    public ArrayList f31507b;

    /* JADX INFO: renamed from: c */
    public ak3 f31508c;

    /* JADX INFO: renamed from: d */
    public sv1[] f31509d;

    /* JADX INFO: renamed from: e */
    public int f31510e;

    /* JADX INFO: renamed from: f */
    public int f31511f;

    /* JADX INFO: renamed from: g */
    public int f31512g;

    /* JADX INFO: renamed from: a */
    public final int m11191a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f31509d.length;
            while (true) {
                length--;
                i2 = this.f31510e;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f31509d[length].f30588c;
                i -= i4;
                this.f31512g -= i4;
                this.f31511f--;
                i3++;
            }
            sv1[] sv1VarArr = this.f31509d;
            System.arraycopy(sv1VarArr, i2 + 1, sv1VarArr, i2 + 1 + i3, this.f31511f);
            this.f31510e += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final s50 m11192b(int i) throws IOException {
        if (i >= 0) {
            sv1[] sv1VarArr = vx1.f32905a;
            if (i <= sv1VarArr.length - 1) {
                return sv1VarArr[i].f30586a;
            }
        }
        int length = this.f31510e + 1 + (i - vx1.f32905a.length);
        if (length >= 0) {
            sv1[] sv1VarArr2 = this.f31509d;
            if (length < sv1VarArr2.length) {
                return sv1VarArr2[length].f30586a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m11193c(sv1 sv1Var) {
        this.f31507b.add(sv1Var);
        int i = sv1Var.f30588c;
        int i2 = this.f31506a;
        if (i > i2) {
            AbstractC0990oo.m9206a0(null, this.f31509d);
            this.f31510e = this.f31509d.length - 1;
            this.f31511f = 0;
            this.f31512g = 0;
            return;
        }
        m11191a((this.f31512g + i) - i2);
        int i3 = this.f31511f + 1;
        sv1[] sv1VarArr = this.f31509d;
        if (i3 > sv1VarArr.length) {
            sv1[] sv1VarArr2 = new sv1[sv1VarArr.length * 2];
            System.arraycopy(sv1VarArr, 0, sv1VarArr2, sv1VarArr.length, sv1VarArr.length);
            this.f31510e = this.f31509d.length - 1;
            this.f31509d = sv1VarArr2;
            sv1VarArr = sv1VarArr2;
        }
        int i4 = this.f31510e;
        this.f31510e = i4 - 1;
        sv1VarArr[i4] = sv1Var;
        this.f31511f++;
        this.f31512g += i;
    }

    /* JADX INFO: renamed from: d */
    public final s50 m11194d() throws EOFException {
        ak3 ak3Var = this.f31508c;
        byte bM3026e = ak3Var.m3026e();
        byte[] bArr = zv4.f36415a;
        int i = bM3026e & 255;
        int i2 = 0;
        boolean z = (bM3026e & 128) == 128;
        long jM11195e = m11195e(i, 127);
        if (!z) {
            return ak3Var.m3027g(jM11195e);
        }
        w30 w30Var = new w30();
        e00 e00Var = ez1.f18598c;
        e00 e00Var2 = e00Var;
        int i3 = 0;
        for (long j = 0; j < jM11195e; j++) {
            byte bM3026e2 = ak3Var.m3026e();
            byte[] bArr2 = zv4.f36415a;
            i2 = (i2 << 8) | (bM3026e2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                e00Var2 = ((e00[]) e00Var2.f17554c)[(i2 >>> (i3 - 8)) & 255];
                if (((e00[]) e00Var2.f17554c) == null) {
                    w30Var.m12054O(e00Var2.f17552a);
                    i3 -= e00Var2.f17553b;
                    e00Var2 = e00Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            e00 e00Var3 = ((e00[]) e00Var2.f17554c)[(i2 << (8 - i3)) & 255];
            int i4 = e00Var3.f17553b;
            if (((e00[]) e00Var3.f17554c) != null || i4 > i3) {
                break;
            }
            w30Var.m12054O(e00Var3.f17552a);
            i3 -= i4;
            e00Var2 = e00Var;
        }
        return w30Var.m12069u(w30Var.f33056b);
    }

    /* JADX INFO: renamed from: e */
    public final int m11195e(int i, int i2) throws EOFException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bM3026e = this.f31508c.m3026e();
            byte[] bArr = zv4.f36415a;
            int i5 = bM3026e & 255;
            if ((bM3026e & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (bM3026e & 127) << i4;
            i4 += 7;
        }
    }
}
