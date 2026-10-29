package p000;

import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d06 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16689a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ r06 f16690b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ UrlResponseInfo f16691c;

    public /* synthetic */ d06(byte b) {
        this.f16689a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16689a) {
            case 0:
                r06 r06Var = this.f16690b;
                try {
                    r06Var.f28937a.onSucceeded(r06Var.f28940d, this.f16691c);
                } catch (Exception e) {
                    i16.m6556a(r06Var.f28940d, "onSucceded", e);
                }
                r06Var.m10178c();
                r06Var.f28940d.f21035s.f15870e.decrementAndGet();
                break;
            default:
                r06 r06Var2 = this.f16690b;
                try {
                    r06Var2.f28937a.onCanceled(r06Var2.f28940d, this.f16691c);
                } catch (Exception e2) {
                    i16.m6556a(r06Var2.f28940d, "onCanceled", e2);
                }
                r06Var2.m10178c();
                r06Var2.f28940d.f21035s.f15870e.decrementAndGet();
                break;
        }
    }
}
