package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 {

    /* JADX INFO: renamed from: a */
    public bt0 f23307a;

    /* JADX INFO: renamed from: b */
    public jp0 f23308b;

    /* JADX INFO: renamed from: a */
    public final void m7570a(String str) {
        jp0 jp0Var = this.f23308b;
        synchronized (jp0Var) {
            if (!Objects.equals((String) jp0Var.f22482c, str)) {
                jp0.m7203I((if1) jp0Var.f22481b, str, (String) jp0Var.f22483d);
                jp0Var.f22482c = str;
            }
        }
    }
}
