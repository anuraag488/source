package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 {

    /* JADX INFO: renamed from: a */
    public ir1 f25830a;

    /* JADX INFO: renamed from: b */
    public y70 f25831b;

    /* JADX INFO: renamed from: c */
    public boolean f25832c;

    /* JADX INFO: renamed from: d */
    public x52 f25833d;

    /* JADX INFO: renamed from: e */
    public boolean f25834e;

    /* JADX INFO: renamed from: f */
    public int f25835f;

    /* JADX INFO: renamed from: g */
    public int f25836g;

    /* JADX INFO: renamed from: h */
    public ArrayList f25837h;

    /* JADX INFO: renamed from: i */
    public int f25838i;

    /* JADX INFO: renamed from: j */
    public int f25839j;

    /* JADX INFO: renamed from: k */
    public int f25840k;

    /* JADX INFO: renamed from: l */
    public int f25841l;

    /* JADX INFO: renamed from: a */
    public final void m8768a() {
        m8770c();
        ArrayList arrayList = this.f25837h;
        if (arrayList.isEmpty()) {
            this.f25836g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8769b() {
        ArrayList arrayList = this.f25837h;
        int i = this.f25836g;
        if (i > 0) {
            x53 x53Var = this.f25831b.f34991a;
            x53Var.m12494X(t53.f30790c);
            x53Var.f34017h[x53Var.f34018i - x53Var.f34015f[x53Var.f34016g - 1].f32421a] = i;
            this.f25836g = 0;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        y70 y70Var = this.f25831b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        y70Var.getClass();
        if (size != 0) {
            x53 x53Var2 = y70Var.f34991a;
            x53Var2.m12494X(t43.f30778c);
            sj3.m10795D(x53Var2, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m8770c() {
        int i = this.f25841l;
        if (i > 0) {
            int i2 = this.f25838i;
            if (i2 >= 0) {
                m8769b();
                x53 x53Var = this.f25831b.f34991a;
                x53Var.m12494X(j53.f22028c);
                int i3 = x53Var.f34018i - x53Var.f34015f[x53Var.f34016g - 1].f32421a;
                int[] iArr = x53Var.f34017h;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f25838i = -1;
            } else {
                int i4 = this.f25840k;
                int i5 = this.f25839j;
                m8769b();
                x53 x53Var2 = this.f25831b.f34991a;
                x53Var2.m12494X(e53.f17709c);
                int i6 = x53Var2.f34018i - x53Var2.f34015f[x53Var2.f34016g - 1].f32421a;
                int[] iArr2 = x53Var2.f34017h;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f25839j = -1;
                this.f25840k = -1;
            }
            this.f25841l = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8771d(boolean z) {
        l84 l84Var = this.f25830a.f21670G;
        int i = z ? l84Var.f23855i : l84Var.f23853g;
        int i2 = i - this.f25835f;
        if (i2 < 0) {
            qi0.m9889a("Tried to seek backward");
        }
        if (i2 > 0) {
            x53 x53Var = this.f25831b.f34991a;
            x53Var.m12494X(m43.f24641c);
            x53Var.f34017h[x53Var.f34018i - x53Var.f34015f[x53Var.f34016g - 1].f32421a] = i2;
            this.f25835f = i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8772e() {
        int i;
        x52 x52Var = this.f25833d;
        l84 l84Var = this.f25830a.f21670G;
        if (l84Var.f23849c <= 0 || x52Var.m12484a(-2) == (i = l84Var.f23855i)) {
            return;
        }
        if (!this.f25832c && this.f25834e) {
            m8771d(false);
            this.f25831b.f34991a.m12494X(z43.f35747c);
            this.f25832c = true;
        }
        if (i > 0) {
            cr1 cr1VarM7845a = l84Var.m7845a(i);
            x52Var.m12486c(i);
            m8771d(false);
            x53 x53Var = this.f25831b.f34991a;
            x53Var.m12494X(y43.f34869c);
            sj3.m10795D(x53Var, 0, cr1VarM7845a);
            this.f25832c = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8773f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                qi0.m9889a("Invalid remove index " + i);
            }
            if (this.f25838i == i) {
                this.f25841l += i2;
                return;
            }
            m8770c();
            this.f25838i = i;
            this.f25841l = i2;
        }
    }
}
