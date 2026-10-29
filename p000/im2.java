package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class im2 {

    /* JADX INFO: renamed from: a */
    public ar3 f21553a;

    /* JADX INFO: renamed from: b */
    public boolean f21554b;

    /* JADX INFO: renamed from: c */
    public int f21555c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ qv2 f21556d;

    /* JADX INFO: renamed from: a */
    public final void m6817a(boolean z) {
        qv2 qv2Var = this.f21556d;
        if (z == this.f21554b) {
            return;
        }
        this.f21554b = z;
        int i = z ? 1 : -1;
        int i2 = qv2Var.f28824c;
        qv2Var.f28824c = i + i2;
        if (!qv2Var.f28825d) {
            qv2Var.f28825d = true;
            while (true) {
                try {
                    int i3 = qv2Var.f28824c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    qv2Var.f28825d = false;
                    throw th;
                }
            }
            qv2Var.f28825d = false;
        }
        if (this.f21554b) {
            qv2Var.m10130c(this);
        }
    }
}
