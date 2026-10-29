package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class td6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f31094a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mg6 f31095b;

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        mg6 mg6Var = this.f31095b;
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        boolean zM9018a = oa6Var.m9018a();
        boolean z = false;
        boolean z2 = oa6Var.f26533y != null && oa6Var.f26533y.booleanValue();
        boolean z3 = this.f31094a;
        oa6Var.f26533y = Boolean.valueOf(z3);
        if (z2 == z3) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12505b(Boolean.valueOf(z3), "Default data collection state already set to");
        }
        if (oa6Var.m9018a() != zM9018a) {
            boolean zM9018a2 = oa6Var.m9018a();
            if (oa6Var.f26533y != null && oa6Var.f26533y.booleanValue()) {
                z = true;
            }
            if (zM9018a2 != z) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16840o.m12506c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zM9018a));
            }
        } else {
            d76 d76Var3 = oa6Var.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16840o.m12506c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zM9018a));
        }
        mg6Var.m8312M();
    }
}
