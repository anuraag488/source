package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f16 {

    /* JADX INFO: renamed from: b */
    public static final f16 f18663b;

    /* JADX INFO: renamed from: c */
    public static final f16 f18664c;

    /* JADX INFO: renamed from: a */
    public final Throwable f18665a;

    static {
        if (ok6.f26824d) {
            f18664c = null;
            f18663b = null;
        } else {
            f18664c = new f16(null);
            f18663b = new f16(null);
        }
    }

    public f16(CancellationException cancellationException) {
        this.f18665a = cancellationException;
    }
}
