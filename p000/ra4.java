package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ra4 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int[] f29119a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object[] f29120b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f29121c;

    public ra4(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f29119a = new int[i5];
        this.f29120b = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ra4 clone() {
        ra4 ra4Var = (ra4) super.clone();
        ra4Var.f29119a = (int[]) this.f29119a.clone();
        ra4Var.f29120b = (Object[]) this.f29120b.clone();
        return ra4Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m10255b(int i) {
        if (i >= this.f29121c || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f29119a[i];
    }

    /* JADX INFO: renamed from: c */
    public final void m10256c(int i, Object obj) {
        int iM10024h = qq2.m10024h(this.f29119a, this.f29121c, i);
        if (iM10024h >= 0) {
            this.f29120b[iM10024h] = obj;
            return;
        }
        int i2 = ~iM10024h;
        int i3 = this.f29121c;
        if (i2 < i3) {
            Object[] objArr = this.f29120b;
            if (objArr[i2] == sc6.f30170g) {
                this.f29119a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f29119a.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.f29119a = Arrays.copyOf(this.f29119a, i7);
            this.f29120b = Arrays.copyOf(this.f29120b, i7);
        }
        int i8 = this.f29121c;
        if (i8 - i2 != 0) {
            int[] iArr = this.f29119a;
            int i9 = i2 + 1;
            AbstractC0990oo.m9199T(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.f29120b;
            AbstractC0990oo.m9198S(i9, i2, this.f29121c, objArr2, objArr2);
        }
        this.f29119a[i2] = i;
        this.f29120b[i2] = obj;
        this.f29121c++;
    }

    /* JADX INFO: renamed from: d */
    public final Object m10257d(int i) {
        if (i >= this.f29121c || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f29120b[i];
    }

    public final String toString() {
        int i = this.f29121c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f29121c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(m10255b(i3));
            sb.append('=');
            Object objM10257d = m10257d(i3);
            if (objM10257d != this) {
                sb.append(objM10257d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
