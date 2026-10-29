package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class po2 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f27860a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f27861b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f27862c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f27863d;

    public po2(int i) {
        if (i == 0) {
            this.f27861b = qq2.f28686e;
            this.f27862c = qq2.f28687f;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.f27861b = new long[i5];
        this.f27862c = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final Object m9590a(long j) {
        Object obj;
        int iM10025i = qq2.m10025i(this.f27861b, this.f27863d, j);
        if (iM10025i < 0 || (obj = this.f27862c[iM10025i]) == ks5.f23401j) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public final long m9591b(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f27863d)) {
            kx5.m7731r0("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f27860a) {
            long[] jArr = this.f27861b;
            Object[] objArr = this.f27862c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ks5.f23401j) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f27860a = false;
            this.f27863d = i3;
        }
        return this.f27861b[i];
    }

    /* JADX INFO: renamed from: c */
    public final void m9592c(long j, Object obj) {
        Object obj2 = ks5.f23401j;
        int iM10025i = qq2.m10025i(this.f27861b, this.f27863d, j);
        if (iM10025i >= 0) {
            this.f27862c[iM10025i] = obj;
            return;
        }
        int i = ~iM10025i;
        int i2 = this.f27863d;
        if (i < i2) {
            Object[] objArr = this.f27862c;
            if (objArr[i] == obj2) {
                this.f27861b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f27860a) {
            long[] jArr = this.f27861b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f27862c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f27860a = false;
                this.f27863d = i3;
                i = ~qq2.m10025i(this.f27861b, i3, j);
            }
        }
        int i5 = this.f27863d;
        if (i5 >= this.f27861b.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f27861b = Arrays.copyOf(this.f27861b, i9);
            this.f27862c = Arrays.copyOf(this.f27862c, i9);
        }
        int i10 = this.f27863d;
        if (i10 - i != 0) {
            long[] jArr2 = this.f27861b;
            int i11 = i + 1;
            AbstractC0990oo.m9200U(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f27862c;
            AbstractC0990oo.m9198S(i11, i, this.f27863d, objArr3, objArr3);
        }
        this.f27861b[i] = j;
        this.f27862c[i] = obj;
        this.f27863d++;
    }

    public final Object clone() {
        po2 po2Var = (po2) super.clone();
        po2Var.f27861b = (long[]) this.f27861b.clone();
        po2Var.f27862c = (Object[]) this.f27862c.clone();
        return po2Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m9593d(long j) {
        int iM10025i = qq2.m10025i(this.f27861b, this.f27863d, j);
        if (iM10025i >= 0) {
            Object[] objArr = this.f27862c;
            Object obj = objArr[iM10025i];
            Object obj2 = ks5.f23401j;
            if (obj != obj2) {
                objArr[iM10025i] = obj2;
                this.f27860a = true;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m9594e() {
        if (this.f27860a) {
            int i = this.f27863d;
            long[] jArr = this.f27861b;
            Object[] objArr = this.f27862c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ks5.f23401j) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f27860a = false;
            this.f27863d = i2;
        }
        return this.f27863d;
    }

    /* JADX INFO: renamed from: f */
    public final Object m9595f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f27863d)) {
            kx5.m7731r0("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f27860a) {
            long[] jArr = this.f27861b;
            Object[] objArr = this.f27862c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ks5.f23401j) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f27860a = false;
            this.f27863d = i3;
        }
        return this.f27862c[i];
    }

    public final String toString() {
        if (m9594e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f27863d * 28);
        sb.append('{');
        int i = this.f27863d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m9591b(i2));
            sb.append('=');
            Object objM9595f = m9595f(i2);
            if (objM9595f != sb) {
                sb.append(objM9595f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ po2() {
        this(10);
    }
}
