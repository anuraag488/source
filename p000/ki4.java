package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ki4 {

    /* JADX INFO: renamed from: a */
    public ed1[] f23155a;

    /* JADX INFO: renamed from: b */
    public boolean f23156b;

    /* JADX INFO: renamed from: c */
    public short f23157c;

    /* JADX INFO: renamed from: d */
    public Object f23158d;

    /* JADX INFO: renamed from: a */
    public ki4 m7522a() {
        boolean z = false;
        y42.m12848U("execute parameter required", ((sm3) this.f23158d) != null);
        ed1[] ed1VarArr = this.f23155a;
        boolean z2 = this.f23156b;
        short s = this.f23157c;
        ki4 ki4Var = new ki4();
        ki4Var.f23158d = this;
        ki4Var.f23155a = ed1VarArr;
        if (ed1VarArr != null && z2) {
            z = true;
        }
        ki4Var.f23156b = z;
        ki4Var.f23157c = s;
        VarHandle.storeStoreFence();
        return ki4Var;
    }
}
