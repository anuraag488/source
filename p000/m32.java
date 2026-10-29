package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m32 extends dc3 {

    /* JADX INFO: renamed from: l */
    public boolean f24618l;

    @Override // p000.dc3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m32) {
            g24 g24Var = (g24) obj;
            if (this.f16970a.equals(g24Var.mo3641b())) {
                m32 m32Var = (m32) obj;
                if (m32Var.f24618l && Arrays.equals((g24[]) this.f16979j.getValue(), (g24[]) m32Var.f16979j.getValue())) {
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
        }
        return false;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: f */
    public final boolean mo5886f() {
        return this.f24618l;
    }

    @Override // p000.dc3
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
