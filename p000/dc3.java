package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class dc3 implements g24, f60 {

    /* JADX INFO: renamed from: a */
    public final String f16970a;

    /* JADX INFO: renamed from: b */
    public final wr1 f16971b;

    /* JADX INFO: renamed from: c */
    public final int f16972c;

    /* JADX INFO: renamed from: d */
    public int f16973d = -1;

    /* JADX INFO: renamed from: e */
    public final String[] f16974e;

    /* JADX INFO: renamed from: f */
    public final List[] f16975f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f16976g;

    /* JADX INFO: renamed from: h */
    public Map f16977h;

    /* JADX INFO: renamed from: i */
    public final pg2 f16978i;

    /* JADX INFO: renamed from: j */
    public final pg2 f16979j;

    /* JADX INFO: renamed from: k */
    public final pg2 f16980k;

    public dc3(String str, wr1 wr1Var, int i) {
        this.f16970a = str;
        this.f16971b = wr1Var;
        this.f16972c = i;
        String[] strArr = new String[i];
        byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f16974e = strArr;
        int i3 = this.f16972c;
        this.f16975f = new List[i3];
        this.f16976g = new boolean[i3];
        this.f16977h = w71.f33134a;
        aj2 aj2Var = aj2.f14536a;
        cc3 cc3Var = new cc3(b);
        cc3Var.f15925b = this;
        VarHandle.storeStoreFence();
        this.f16978i = i25.m6630z(aj2Var, cc3Var);
        cc3 cc3Var2 = new cc3((byte) 1);
        cc3Var2.f15925b = this;
        VarHandle.storeStoreFence();
        this.f16979j = i25.m6630z(aj2Var, cc3Var2);
        cc3 cc3Var3 = new cc3((byte) 2);
        cc3Var3.f15925b = this;
        VarHandle.storeStoreFence();
        this.f16980k = i25.m6630z(aj2Var, cc3Var3);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: a */
    public final int mo4430a(String str) {
        Integer num = (Integer) this.f16977h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: b */
    public final String mo3641b() {
        return this.f16970a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: c */
    public zc6 mo4431c() {
        return rd4.f29188j;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: d */
    public final int mo4432d() {
        return this.f16972c;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: e */
    public final String mo4433e(int i) {
        return this.f16974e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dc3) {
            g24 g24Var = (g24) obj;
            if (this.f16970a.equals(g24Var.mo3641b()) && Arrays.equals((g24[]) this.f16979j.getValue(), (g24[]) ((dc3) obj).f16979j.getValue())) {
                int iMo4432d = g24Var.mo4432d();
                int i = this.f16972c;
                if (i == iMo4432d) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (z62.m13387o(mo4436j(i2).mo3641b(), g24Var.mo4436j(i2).mo3641b()) && z62.m13387o(mo4436j(i2).mo4431c(), g24Var.mo4436j(i2).mo4431c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.f60
    /* JADX INFO: renamed from: g */
    public final Set mo4434g() {
        return this.f16977h.keySet();
    }

    @Override // p000.g24
    public final List getAnnotations() {
        return v71.f32439a;
    }

    public int hashCode() {
        return ((Number) this.f16980k.getValue()).intValue();
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: i */
    public final List mo4435i(int i) {
        List list = this.f16975f[i];
        return list == null ? v71.f32439a : list;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: j */
    public g24 mo4436j(int i) {
        return ((jc2[]) this.f16978i.getValue())[i].mo15d();
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: k */
    public final boolean mo4437k(int i) {
        return this.f16976g[i];
    }

    /* JADX INFO: renamed from: l */
    public final void m4438l(String str, boolean z) {
        int i = this.f16973d + 1;
        this.f16973d = i;
        String[] strArr = this.f16974e;
        strArr[i] = str;
        this.f16976g[i] = z;
        this.f16975f[i] = null;
        if (i == this.f16972c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f16977h = map;
        }
    }

    public String toString() {
        return AbstractC0647fd.m5661S(this);
    }
}
