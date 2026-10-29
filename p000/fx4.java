package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fx4 implements ax4 {

    /* JADX INFO: renamed from: a */
    public kv2 f19380a;

    /* JADX INFO: renamed from: b */
    public lv2 f19381b;

    /* JADX INFO: renamed from: c */
    public short f19382c;

    /* JADX INFO: renamed from: d */
    public g51 f19383d;

    /* JADX INFO: renamed from: e */
    public int[] f19384e;

    /* JADX INFO: renamed from: f */
    public float[] f19385f;

    /* JADX INFO: renamed from: g */
    public AbstractC0654fk f19386g;

    /* JADX INFO: renamed from: h */
    public AbstractC0654fk f19387h;

    /* JADX INFO: renamed from: i */
    public AbstractC0654fk f19388i;

    /* JADX INFO: renamed from: j */
    public AbstractC0654fk f19389j;

    /* JADX INFO: renamed from: k */
    public float[] f19390k;

    /* JADX INFO: renamed from: l */
    public float[] f19391l;

    /* JADX INFO: renamed from: m */
    public js1 f19392m;

    /* JADX INFO: renamed from: b */
    public final int m5842b(int i) {
        int i2;
        kv2 kv2Var = this.f19380a;
        int i3 = kv2Var.f23538b;
        if (i3 <= 0) {
            kx5.m7733s0("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = kv2Var.f23537a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    /* JADX INFO: renamed from: d */
    public final float m5843d(int i, int i2, boolean z) {
        g51 g51Var;
        float f;
        kv2 kv2Var = this.f19380a;
        if (i >= kv2Var.f23538b - 1) {
            f = i2;
        } else {
            int iM7635c = kv2Var.m7635c(i);
            int iM7635c2 = kv2Var.m7635c(i + 1);
            if (i2 != iM7635c) {
                int i3 = iM7635c2 - iM7635c;
                ex4 ex4Var = (ex4) this.f19381b.m8197b(iM7635c);
                if (ex4Var == null || (g51Var = ex4Var.f18563b) == null) {
                    g51Var = this.f19383d;
                }
                float f2 = i3;
                float fMo3662c = g51Var.mo3662c((i2 - iM7635c) / f2);
                return z ? fMo3662c : ((f2 * fMo3662c) + iM7635c) / 1000.0f;
            }
            f = iM7635c;
        }
        return f / 1000.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m5844e(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        float[] fArr;
        lv2 lv2Var = this.f19381b;
        kv2 kv2Var = this.f19380a;
        boolean z = this.f19392m != zw4.f36434c;
        if (this.f19386g == null) {
            this.f19386g = abstractC0654fk.mo4035c();
            this.f19387h = abstractC0654fk3.mo4035c();
            int i = kv2Var.f23538b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = kv2Var.m7635c(i2) / 1000.0f;
            }
            this.f19385f = fArr2;
            int i3 = kv2Var.f23538b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f19384e = iArr;
        }
        if (z) {
            if (this.f19392m != zw4.f36434c && z62.m13387o(this.f19388i, abstractC0654fk) && z62.m13387o(this.f19389j, abstractC0654fk2)) {
                return;
            }
            this.f19388i = abstractC0654fk;
            this.f19389j = abstractC0654fk2;
            int iMo4034b = abstractC0654fk.mo4034b() + (abstractC0654fk.mo4034b() % 2);
            this.f19390k = new float[iMo4034b];
            this.f19391l = new float[iMo4034b];
            int i5 = kv2Var.f23538b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iM7635c = kv2Var.m7635c(i6);
                ex4 ex4Var = (ex4) lv2Var.m8197b(iM7635c);
                if (iM7635c == 0 && ex4Var == null) {
                    fArr = new float[iMo4034b];
                    for (int i7 = 0; i7 < iMo4034b; i7++) {
                        fArr[i7] = abstractC0654fk.mo3608a(i7);
                    }
                } else if (iM7635c == this.f19382c && ex4Var == null) {
                    fArr = new float[iMo4034b];
                    for (int i8 = 0; i8 < iMo4034b; i8++) {
                        fArr[i8] = abstractC0654fk2.mo3608a(i8);
                    }
                } else {
                    AbstractC0654fk abstractC0654fk4 = ex4Var.f18562a;
                    float[] fArr4 = new float[iMo4034b];
                    for (int i9 = 0; i9 < iMo4034b; i9++) {
                        fArr4[i9] = abstractC0654fk4.mo3608a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.f19392m = new js1(this.f19384e, this.f19385f, fArr3);
        }
    }

    @Override // p000.ax4
    /* JADX INFO: renamed from: k */
    public final int mo3359k() {
        return 0;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: p */
    public final AbstractC0654fk mo4794p(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        long j2 = j / 1000000;
        int[] iArr = zw4.f36432a;
        long j3 = this.f19382c;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return abstractC0654fk3;
        }
        m5844e(abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
        AbstractC0654fk abstractC0654fk4 = this.f19387h;
        int i = 0;
        if (this.f19392m != zw4.f36434c) {
            int i2 = (int) j4;
            float fM5843d = m5843d(m5842b(i2), i2, false);
            float[] fArr = this.f19391l;
            C0915mn[][] c0915mnArr = (C0915mn[][]) this.f19392m.f22555a;
            float f = c0915mnArr[0][0].f25040a;
            float f2 = c0915mnArr[c0915mnArr.length - 1][0].f25041b;
            if (fM5843d < f) {
                fM5843d = f;
            }
            if (fM5843d <= f2) {
                f2 = fM5843d;
            }
            int length = fArr.length;
            boolean z = false;
            for (C0915mn[] c0915mnArr2 : c0915mnArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    C0915mn c0915mn = c0915mnArr2[i4];
                    if (f2 <= c0915mn.f25041b) {
                        if (c0915mn.f25055p) {
                            fArr[i3] = c0915mn.f25056q;
                            fArr[i3 + 1] = c0915mn.f25057r;
                        } else {
                            c0915mn.m8362c(f2);
                            fArr[i3] = c0915mn.m8360a();
                            fArr[i3 + 1] = c0915mn.m8361b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                abstractC0654fk4.mo3610e(fArr[i], i);
                i++;
            }
        } else {
            AbstractC0654fk abstractC0654fkMo4795s = mo4795s((j4 - 1) * 1000000, abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
            AbstractC0654fk abstractC0654fkMo4795s2 = mo4795s(j4 * 1000000, abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
            int iMo4034b = abstractC0654fkMo4795s.mo4034b();
            while (i < iMo4034b) {
                abstractC0654fk4.mo3610e((abstractC0654fkMo4795s.mo3608a(i) - abstractC0654fkMo4795s2.mo3608a(i)) * 1000.0f, i);
                i++;
            }
        }
        return abstractC0654fk4;
    }

    @Override // p000.ax4
    /* JADX INFO: renamed from: r */
    public final int mo3360r() {
        return this.f19382c;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: s */
    public final AbstractC0654fk mo4795s(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        AbstractC0654fk abstractC0654fk4;
        AbstractC0654fk abstractC0654fk5;
        AbstractC0654fk abstractC0654fk6 = abstractC0654fk;
        AbstractC0654fk abstractC0654fk7 = abstractC0654fk2;
        kv2 kv2Var = this.f19380a;
        long j2 = j / 1000000;
        int[] iArr = zw4.f36432a;
        short s = this.f19382c;
        long j3 = s;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i = (int) j3;
        lv2 lv2Var = this.f19381b;
        ex4 ex4Var = (ex4) lv2Var.m8197b(i);
        if (ex4Var != null) {
            return ex4Var.f18562a;
        }
        if (i >= s) {
            return abstractC0654fk7;
        }
        if (i <= 0) {
            return abstractC0654fk6;
        }
        m5844e(abstractC0654fk6, abstractC0654fk7, abstractC0654fk3);
        AbstractC0654fk abstractC0654fk8 = this.f19386g;
        int i2 = 0;
        if (this.f19392m != zw4.f36434c) {
            float fM5843d = m5843d(m5842b(i), i, false);
            float[] fArr = this.f19390k;
            C0915mn[][] c0915mnArr = (C0915mn[][]) this.f19392m.f22555a;
            int length = c0915mnArr.length - 1;
            float f = c0915mnArr[0][0].f25040a;
            float f2 = c0915mnArr[length][0].f25041b;
            int length2 = fArr.length;
            if (fM5843d < f || fM5843d > f2) {
                if (fM5843d > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fM5843d - f;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2 - 1) {
                    C0915mn c0915mn = c0915mnArr[length][i4];
                    boolean z = c0915mn.f25055p;
                    float f4 = c0915mn.f25057r;
                    float f5 = c0915mn.f25056q;
                    if (z) {
                        float f6 = c0915mn.f25040a;
                        float f7 = c0915mn.f25050k;
                        float f8 = c0915mn.f25042c;
                        fArr[i3] = (f5 * f3) + ((c0915mn.f25044e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = c0915mn.f25043d;
                        fArr[i3 + 1] = (f4 * f3) + ((c0915mn.f25045f - f10) * f9) + f10;
                    } else {
                        c0915mn.m8362c(f);
                        fArr[i3] = (c0915mn.m8360a() * f3) + (c0915mn.f25053n * c0915mn.f25047h) + f5;
                        fArr[i3 + 1] = (c0915mn.m8361b() * f3) + (c0915mn.f25054o * c0915mn.f25048i) + f4;
                    }
                    i3 += 2;
                    i4++;
                    c0915mnArr = c0915mnArr;
                }
            } else {
                int length3 = c0915mnArr.length;
                int i5 = 0;
                boolean z2 = false;
                while (i5 < length3) {
                    int i6 = i2;
                    int i7 = i6;
                    while (i6 < length2 - 1) {
                        C0915mn c0915mn2 = c0915mnArr[i5][i7];
                        if (fM5843d <= c0915mn2.f25041b) {
                            if (c0915mn2.f25055p) {
                                float f11 = c0915mn2.f25040a;
                                float f12 = c0915mn2.f25050k;
                                float f13 = c0915mn2.f25042c;
                                fArr[i6] = ((c0915mn2.f25044e - f13) * (fM5843d - f11) * f12) + f13;
                                float f14 = c0915mn2.f25043d;
                                fArr[i6 + 1] = ((c0915mn2.f25045f - f14) * (fM5843d - f11) * f12) + f14;
                            } else {
                                c0915mn2.m8362c(fM5843d);
                                fArr[i6] = (c0915mn2.f25053n * c0915mn2.f25047h) + c0915mn2.f25056q;
                                fArr[i6 + 1] = (c0915mn2.f25054o * c0915mn2.f25048i) + c0915mn2.f25057r;
                            }
                            z2 = true;
                        }
                        i6 += 2;
                        i7++;
                    }
                    if (z2) {
                        break;
                    }
                    i5++;
                    i2 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                abstractC0654fk8.mo3610e(fArr[i8], i8);
            }
        } else {
            int iM5842b = m5842b(i);
            float fM5843d2 = m5843d(iM5842b, i, true);
            ex4 ex4Var2 = (ex4) lv2Var.m8197b(kv2Var.m7635c(iM5842b));
            if (ex4Var2 != null && (abstractC0654fk5 = ex4Var2.f18562a) != null) {
                abstractC0654fk6 = abstractC0654fk5;
            }
            ex4 ex4Var3 = (ex4) lv2Var.m8197b(kv2Var.m7635c(iM5842b + 1));
            if (ex4Var3 != null && (abstractC0654fk4 = ex4Var3.f18562a) != null) {
                abstractC0654fk7 = abstractC0654fk4;
            }
            int iMo4034b = abstractC0654fk8.mo4034b();
            for (int i9 = 0; i9 < iMo4034b; i9++) {
                abstractC0654fk8.mo3610e((abstractC0654fk7.mo3608a(i9) * fM5843d2) + ((1.0f - fM5843d2) * abstractC0654fk6.mo3608a(i9)), i9);
            }
        }
        return abstractC0654fk8;
    }
}
