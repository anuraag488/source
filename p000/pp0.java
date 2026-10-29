package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pp0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27875a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ rp0 f27876b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f27877c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f27878d;

    public /* synthetic */ pp0(byte b) {
        this.f27875a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27875a) {
            case 0:
                rp0 rp0Var = this.f27876b;
                long j = this.f27877c;
                String str = this.f27878d;
                yq0 yq0Var = (yq0) rp0Var.f29509o.f22482c;
                pp0 pp0Var = new pp0((byte) 1);
                pp0Var.f27876b = rp0Var;
                pp0Var.f27877c = j;
                pp0Var.f27878d = str;
                VarHandle.storeStoreFence();
                yq0Var.m13214a(pp0Var);
                break;
            default:
                rp0 rp0Var2 = this.f27876b;
                long j2 = this.f27877c;
                String str2 = this.f27878d;
                np0 np0Var = rp0Var2.f29501g;
                xq0 xq0Var = np0Var.f26006n;
                if (xq0Var == null || !xq0Var.f34535e.get()) {
                    ((we1) np0Var.f26001i.f35739c).mo3002m(str2, j2);
                }
                break;
        }
    }
}
