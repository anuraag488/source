package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i24 implements g24, f60 {

    /* JADX INFO: renamed from: a */
    public String f21064a;

    /* JADX INFO: renamed from: b */
    public zc6 f21065b;

    /* JADX INFO: renamed from: c */
    public int f21066c;

    /* JADX INFO: renamed from: d */
    public List f21067d;

    /* JADX INFO: renamed from: e */
    public HashSet f21068e;

    /* JADX INFO: renamed from: f */
    public String[] f21069f;

    /* JADX INFO: renamed from: g */
    public g24[] f21070g;

    /* JADX INFO: renamed from: h */
    public List[] f21071h;

    /* JADX INFO: renamed from: i */
    public boolean[] f21072i;

    /* JADX INFO: renamed from: j */
    public Map f21073j;

    /* JADX INFO: renamed from: k */
    public g24[] f21074k;

    /* JADX INFO: renamed from: l */
    public dg4 f21075l;

    @Override // p000.g24
    /* JADX INFO: renamed from: a */
    public final int mo4430a(String str) {
        Integer num = (Integer) this.f21073j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: b */
    public final String mo3641b() {
        return this.f21064a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: c */
    public final zc6 mo4431c() {
        return this.f21065b;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: d */
    public final int mo4432d() {
        return this.f21066c;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: e */
    public final String mo4433e(int i) {
        return this.f21069f[i];
    }

    public final boolean equals(Object obj) {
        g24[] g24VarArr = this.f21070g;
        int i = this.f21066c;
        if (this == obj) {
            return true;
        }
        if (obj instanceof i24) {
            g24 g24Var = (g24) obj;
            if (this.f21064a.equals(g24Var.mo3641b()) && Arrays.equals(this.f21074k, ((i24) obj).f21074k) && i == g24Var.mo4432d()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (z62.m13387o(g24VarArr[i2].mo3641b(), g24Var.mo4436j(i2).mo3641b()) && z62.m13387o(g24VarArr[i2].mo4431c(), g24Var.mo4436j(i2).mo4431c())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.f60
    /* JADX INFO: renamed from: g */
    public final Set mo4434g() {
        return this.f21068e;
    }

    @Override // p000.g24
    public final List getAnnotations() {
        return this.f21067d;
    }

    public final int hashCode() {
        return ((Number) this.f21075l.getValue()).intValue();
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: i */
    public final List mo4435i(int i) {
        return this.f21071h[i];
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: j */
    public final g24 mo4436j(int i) {
        return this.f21070g[i];
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: k */
    public final boolean mo4437k(int i) {
        return this.f21072i[i];
    }

    public final String toString() {
        return AbstractC0647fd.m5661S(this);
    }
}
