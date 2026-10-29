package p000;

import ads_mobile_sdk.m24;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: uk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1222uk implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31942a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f31943b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31944c;

    public /* synthetic */ RunnableC1222uk(byte b) {
        this.f31942a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31942a) {
            case 0:
                ((IntConsumer) this.f31944c).accept(this.f31943b);
                break;
            default:
                ((m24) this.f31944c).m1687c(this.f31943b + 1);
                break;
        }
    }
}
