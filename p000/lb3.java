package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lb3 extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23913a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb3(String str, byte b) {
        super(str);
        this.f23913a = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f23913a) {
            case 0:
                setStackTrace(qs5.f28775h);
                break;
            case 1:
                setStackTrace(i20.f21055i);
                break;
            default:
                setStackTrace(AbstractC1356y5.f34890m);
                break;
        }
        return this;
    }
}
