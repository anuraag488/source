package p000;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rb6 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29140a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cp6 f29141b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Bundle f29142c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ jc6 f29143d;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f29140a) {
            case 0:
                qm6 qm6Var = this.f29143d.f22167a;
                qm6Var.m9928A();
                return qm6Var.m9949b0(this.f29142c, this.f29141b);
            default:
                qm6 qm6Var2 = this.f29143d.f22167a;
                qm6Var2.m9928A();
                return qm6Var2.m9949b0(this.f29142c, this.f29141b);
        }
    }
}
