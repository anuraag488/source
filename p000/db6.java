package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class db6 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16907a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f16908b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f16909c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f16910d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ jc6 f16911e;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16907a) {
            case 0:
                qm6 qm6Var = this.f16911e.f22167a;
                qm6Var.m9928A();
                ar5 ar5Var = qm6Var.f28593c;
                qm6.m9925S(ar5Var);
                return ar5Var.m3204s0(this.f16908b, this.f16909c, this.f16910d);
            case 1:
                qm6 qm6Var2 = this.f16911e.f22167a;
                qm6Var2.m9928A();
                ar5 ar5Var2 = qm6Var2.f28593c;
                qm6.m9925S(ar5Var2);
                return ar5Var2.m3204s0(this.f16908b, this.f16909c, this.f16910d);
            case 2:
                qm6 qm6Var3 = this.f16911e.f22167a;
                qm6Var3.m9928A();
                ar5 ar5Var3 = qm6Var3.f28593c;
                qm6.m9925S(ar5Var3);
                return ar5Var3.m3208w0(this.f16908b, this.f16909c, this.f16910d);
            default:
                qm6 qm6Var4 = this.f16911e.f22167a;
                qm6Var4.m9928A();
                ar5 ar5Var4 = qm6Var4.f28593c;
                qm6.m9925S(ar5Var4);
                return ar5Var4.m3208w0(this.f16908b, this.f16909c, this.f16910d);
        }
    }
}
